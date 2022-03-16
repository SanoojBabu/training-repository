package com.te.threads2;

public class Story {

	private StringBuilder story = new StringBuilder("This is Legend here");

	public Story() {
		super();
	}

	public Story(StringBuilder story) {
		super();
		this.story = story;
	}

	public StringBuilder getStory() {
		return story;
	}

	public void setStory(StringBuilder story) {
		this.story = story;
	}

	@Override
	public String toString() {
		return "Story [story=" + story + "]";
	}

	public static void readStory(StringBuilder story) {
		for (int i = 0; i < story.length(); i++) {
			System.out.println(story.charAt(i));
		}
	}

	public static void writeStory(StringBuilder story) {
		for (int i = 0; i < story.length(); i++) {
			story.replace(i, story.length(), "_");
			System.out.println(story.charAt(i));
		}
	}
}
