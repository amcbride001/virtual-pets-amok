package amok;

public abstract class Animal {

	private String name;
	private int fullness = 0;
	protected int hydration = 0;
	protected int happiness = 0;
	private int boredomLevel;

	protected String getName() {

		return name;
	}

	protected int getFullnessLevel() {
		return fullness;

	}

	protected int getHydrationLevel() {

		return hydration;
	}

	protected int getHappiness() {

		return happiness;
	}

	protected Animal(String name, int fullness, int hydration, int happiness, int boredomLevel) {
		this.name = name;
		this.fullness = fullness;
		this.hydration = hydration;
		this.happiness = happiness;
		this.boredomLevel = boredomLevel;

	}

	public abstract void tick();

	public abstract void play();

	public int feed() {
		return this.feed();
	}

	public int getPlaying() {
		// TODO Auto-generated method stub
		return 0;
	}

}
