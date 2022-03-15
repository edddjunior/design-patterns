package app.animation.model;

import java.util.HashMap;
import java.util.Map;

import app.animation.Animation;

public class AnimationSamples {
	private Map<String, Animation> samples;

	public AnimationSamples() {
		samples = new HashMap<>();
		loadSamples();
	}

	public Animation get(String type) {
		return samples.get(type);
	}

	private void loadSamples() {
		samples.put("stickMan", new Animation("                   ", "        o          ", "       /|\\          ",
				"_______/_\\___________"));
		samples.put("fatMan", new Animation("                   ", "       (^ ^)          ", "       <)  )\\         ",
				"_______/__\\___________"));
	}
}
