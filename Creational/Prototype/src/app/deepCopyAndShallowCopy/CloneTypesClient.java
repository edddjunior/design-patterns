package app.deepCopyAndShallowCopy;

import app.deepCopyAndShallowCopy.model.Address;
import app.deepCopyAndShallowCopy.model.User;

public class CloneTypesClient {

	public static void copyUserObject() throws CloneNotSupportedException {
		User user = new User("Original User", 25, new Address("Original Street", 1000));
		System.out.println(user);

		User cloneUser = user.clone();
		cloneUser.name = "Clone User";
		cloneUser.address.street = "Clone Street";
		cloneUser.address.number = 123;
		System.out.println(user);
		System.out.println(cloneUser);
	}
}
