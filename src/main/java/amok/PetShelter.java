package amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PetShelter {
	
	int litterBoxLevelBefore = 0;
	int litterBoxLevel = litterBoxLevelBefore;

	Map<String, Animal> animals;

	public Collection<Animal> getAllAnimals() {
		return animals.values();
	}
	public String getName() {
		return getName();
	}
	public Animal getPet(String name) {
		return animals.get(name);
	}
	PetShelter() {
		animals = new HashMap<String, Animal>();
	}

	public void addPet(Animal animal) {
		animals.put(animal.getName(), animal);
	}

	public Animal getAnimal(String name) {
		return animals.get(name);
	}
	public void removeAnimal(String name) {
		animals.remove(name);
	}

	public int getHydrationLevels(Animal animal) {
		if (animal instanceof Organic) {
			return ((Organic) animal).getHydration();
		}
		return -1;
	}

	public int feedAllOrganicPets(Animal animal) {
		Collection<Animal> animalCollection = animals.values();
		for (Animal animals :animalCollection) {
		if (animal instanceof Organic) {
			return ((Organic) animal).getFullness();
		}
		}
		return -3;
	}

	public int getCageCleanlienessLevel(Animal animal) {
		if(animal instanceof Organic) {
		return ((Organic) animal).getCageCleanlienessLevel();
		}
		return -2;
		
}
		public int getLitterBoxLevel() {
			return litterBoxLevel;
	
	}
		public int getOilLevel(Animal animal) {
			if(animal instanceof Robo) {
				return((Robo)animal).getOil();
			}
			return -2;
		}
		public void waterAllAnimals() {
		
			}
			
		
		public void cleanCages() {
			
			
		}
		public void cleanLitterBox() {
			
			
		}
		public void oilAllRoboAnimals() {
			
			
		}
		public void tick() {
			
			
		}

}
