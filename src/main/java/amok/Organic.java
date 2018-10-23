package amok;

public interface Organic {

	abstract int getLitterBoxLevel();

	abstract int getFullness();
	
	abstract int getHydration();

	abstract int getHappiness();
	
	abstract int feed(int food);
	
	abstract void water();

	abstract int getCageCleanlienessLevel();
}