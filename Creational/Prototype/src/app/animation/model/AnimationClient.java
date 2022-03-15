package app.animation.model;

import java.util.ArrayList;
import java.util.List;

import app.animation.Animation;

public class AnimationClient {

	private static List<Animation> frames = new ArrayList<Animation>();

	public static void animate() throws InterruptedException {
		System.out.println("*********************************");
		System.out.println("* ");
		Thread.sleep(3000);
		for (Animation frame : getFrames()) {
			frame.draw();
			Thread.sleep(500);
		}
		System.out.println("**********************");
		System.out.println("* ");
		System.out.println("* The End!");
		System.out.println("* ");
		System.out.print("**********************");
	}

	public static Animation addLeft(Animation a) throws CloneNotSupportedException {
		Animation animation = (Animation) a.clone();
		animation.left();
		getFrames().add(animation);
		return animation;
	}

	public static Animation addRight(Animation a) throws CloneNotSupportedException {
		Animation animation = (Animation) a.clone();
		animation.right();
		getFrames().add(animation);
		return animation;
	}

	public static List<Animation> getFrames() {
		return frames;
	}
}
