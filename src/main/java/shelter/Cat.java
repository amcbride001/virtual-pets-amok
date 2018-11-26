package shelter;

public abstract class Cat extends VirtualPet {

	public Cat(String name, int happiness, int fullness, int hydration, int boredomLevel) {
		super(name, happiness, fullness, hydration, boredomLevel);
	}

	

	public void play() {

	}

	public int getPlaying() {

		return 0;

	}

}
