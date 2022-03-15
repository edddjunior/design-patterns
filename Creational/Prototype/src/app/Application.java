package app;

import app.animation.Animation;
import app.animation.model.AnimationClient;
import app.animation.model.AnimationSamples;
import app.cloneBuilderFunctionalApproach.functionalClient;
import app.deepCopyAndShallowCopy.CloneTypesClient;

public class Application {
	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		
		// immutable functuinal builder clone client
		functionalClient.cloneUserWithBuilder();
		
		// UserAddress Exemple
		CloneTypesClient.copyUserObject();
		
		// Animation Exemple
//		Animation animation = samples.get("stickMan");
		AnimationSamples samples = new AnimationSamples();
		Animation animation = samples.get("fatMan");
		AnimationClient.getFrames().add(animation);
		animation = AnimationClient.addLeft(animation);
		animation = AnimationClient.addLeft(animation);
		animation = AnimationClient.addLeft(animation);
		animation = AnimationClient.addRight(animation);
		animation = AnimationClient.addRight(animation);
		animation = AnimationClient.addRight(animation);
		animation = AnimationClient.addRight(animation);
		animation = AnimationClient.addRight(animation);
		animation = AnimationClient.addRight(animation);
		animation = AnimationClient.addRight(animation);
		animation = AnimationClient.addLeft(animation);
		animation = AnimationClient.addLeft(animation);
		animation = AnimationClient.addLeft(animation);
		AnimationClient.animate();
	}
}
