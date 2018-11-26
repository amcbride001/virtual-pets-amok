package shelter;

public abstract class VirtualPet {

	private int boredomLevel;
	private int fullness;
	private int hydration;
	protected int happiness;
	private String name;

	public VirtualPet(String name, int fullness, int hydration, int happiness, int boredomLevel) {
		this.name = name;     //These are my constructors
		this.hydration = hydration;
		this.happiness = happiness;
		this.fullness = fullness;
		this.boredomLevel = boredomLevel;

	}

	public int getBoredomLevel() {
		return boredomLevel;
	}

	public int getHydration() {
		return hydration;
	}

	public int getFullness() {
		return fullness;
	}

	public int getHappiness() {
		return happiness;
	}

	protected String getName() {
		return name;
	}

	public void water() {
		this.hydration += 6;

	}

	public void feed() {
		this.fullness += 3;

	}

	public void happiness() {
		this.happiness += 8;

	}

	public void removePet(String string) {

	}

	public void getGoPlay() {

	}

	public void takeHome() {

	}
	protected abstract void tick();

}
