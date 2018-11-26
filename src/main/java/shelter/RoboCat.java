package shelter;

public class RoboCat extends Cat implements Robo {

	private int oil;

	public int getOil() {

		return oil;
	}

	public RoboCat(String name, int hydration, int happiness, int fullness, int boredomLevel) {
		super(name, hydration, happiness, fullness, boredomLevel);
		this.oil = oil;

	}

	@Override
	public void tick() {
		if (oil < 6) {
			oil++;
		}
		if (oil > 10 && happiness > 2) {
			happiness--;
		}

	}

	public int getOilLevel() {
		
		return 0;
	}

}
