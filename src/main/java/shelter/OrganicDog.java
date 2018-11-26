package shelter;

public class OrganicDog extends Dog implements Organic {
	
	private int fullness;
	private int hydration;
	private int boredomLevel;
	private int happiness;

	public int getFullness() {
		return this.fullness;
	}


	public int getThirstLevel() {
		return this.hydration;
	}
	
	public int getBordemLevel() {
		return this.boredomLevel;
	}
	public int getHappiness() {
		return this.happiness;
	}
	protected OrganicDog(String name, int fullness, int hydration, int happiness, int boredomLevel) {
		super(name, fullness, hydration, happiness, boredomLevel);
		this.fullness = fullness;
		this.boredomLevel = boredomLevel;
		this.hydration = hydration;
		this.happiness = happiness;
	}

	@Override
	public void water() {
		if (hydration < 4) {
			hydration = 0;
	} else {
		hydration -= 2;
	}
		if (boredomLevel > 8) {
			happiness = 10;
		} else {
			this.happiness += 2;
		}
	}

	public void tick() {
		if (fullness < 10) {
			fullness++;
		}
		if (fullness > 6 && happiness > 0) {
			happiness--;
		}
	
		if (hydration < 10) {
			hydration++;
		}
		if (hydration > 6 && happiness > 0) {
			happiness--;

		}
		if (boredomLevel < 10) {
			boredomLevel++;
		}
		if (boredomLevel > 6 && happiness > 0) {
			happiness--;
		}

	}

	@Override
	public void play() {
		

	}

	@Override
	public int getHydration() {
		
		return 0;
	}

	@Override
	public int feed(int food) {
		
		return 0;
	}



	@Override
	public int getCageCleanlienessLevel() {
		
		return 0;
	}

	@Override
	protected void walk() {
		
		
	}


	@Override
	public int getLitterBoxLevel() {
		
		return 0;
	}


	
	}


