package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PetShelter {

	int litterBoxLevelBefore = 0;
	int litterBoxLevel = litterBoxLevelBefore;
	private HashMap<String, VirtualPet> pets;
	private String shelter;

	public PetShelter() {
		pets = new HashMap<String, VirtualPet>();
	}

	public String getName() {
		return getName();
	}

	public VirtualPet getPet(String name) {
		return pets.get(name);
	}

	public void addPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	public void removePet(String name) {
		pets.remove(name);
	}

	public int getHydrationLevels(VirtualPet pet) {
		if (pet instanceof Organic) {
			return ((Organic) pet).getHydration();
		}
		return -1;
	}

	public int feedAllOrganicPets(VirtualPet pet) {
		Collection<VirtualPet> petCollection = pets.values();
		for (VirtualPet pets : petCollection) {
			if (pet instanceof Organic) {
				return ((Organic) pet).getFullness();
			}
		}
		return -3;
	}

	public int getCageCleanlienessLevel(VirtualPet pet) {
		if (pet instanceof Organic) {
			return ((Organic) pet).getCageCleanlienessLevel();
		}
		return -2;

	}

	public int getLitterBoxLevel() {
		return litterBoxLevel;

	}

	public int getOilLevel(VirtualPet pet) {
		if (pet instanceof Robo) {
			return ((Robo) pet).getOil();
		}
		return -2;
	}

	public int waterAllOrganicPets() {
		if (pets instanceof Organic) {
			return ((Organic)pets).getHydration();
			}
		return 4;
		
	}

	public void cleanCages() {

	}

	public void cleanLitterBox() {

	}

	public void oilAllRoboPets() {

	}

	public void tick() {

	}

	

	

}
