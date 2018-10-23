package amok;

public abstract class Dog extends Animal {

protected Dog(String name, int fullness, int hydration, int happiness, int boredomLevel) {
		super(name, fullness, hydration, happiness, boredomLevel);
		
	}

	protected abstract void walk();





	public void giveWater() {
		
		
	}





	public int feed(int i) {
		return 0;
		
		
	}





	public int getWalking() {
	
		return 0;
	}

	
}
