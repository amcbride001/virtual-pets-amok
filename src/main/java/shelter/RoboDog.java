package shelter;

public abstract class RoboDog extends VirtualPet implements Robo {

	private int oil;

	public int getOil() {
		return oil;
	}

	public RoboDog(String name, int fullness, int hydration, int happiness, int boredomLevel) {
		super(name, fullness, hydration, happiness, boredomLevel);
		this.oil = oil;
	}

	public int getOilLevel() {
		return 0;
	}

}
