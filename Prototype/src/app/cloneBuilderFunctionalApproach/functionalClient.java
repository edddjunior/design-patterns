package app.cloneBuilderFunctionalApproach;

import app.cloneBuilderFunctionalApproach.model.Address;
import app.cloneBuilderFunctionalApproach.model.User;

public class functionalClient {

	public static void cloneUserWithBuilder() {

		User user = new User("John Doe", 21, new Address("Lalala Street", 1000));
		System.out.println(user);

		User clonedUser = user.cloneBuilder().withName("John Cloned Doe").build();
		System.out.println(clonedUser);

		User anotherUser = clonedUser.cloneBuilder().withAge(50).withAddress(new Address("Other Street", 500)).build();
		System.out.println(anotherUser);
	}
}
