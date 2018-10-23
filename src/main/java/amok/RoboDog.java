package amok;

public abstract class RoboDog extends Animal implements Robo{

	private int oil;
	
	public int getOil() {
		return oil;
	}
	public RoboDog(String name, int fullness, int hydration, int happiness, int boredomLevel) {
		super(name, fullness, hydration, happiness, boredomLevel);
		this.oil = oil;
	}

}




