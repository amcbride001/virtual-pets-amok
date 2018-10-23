package amok;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnimalTest {

	@Test
	public void shouldBeAbleToCreateAnimal() {
		Animal dog = new Dog("");
		assertTrue(dog instanceof Animal);
	}
@Test
	public void shouldBeAbleToCreateDifferentAnimals() {
		Animal dog = new Dog("");
		Animal cat = new Cat("");
		Animal roboDog = new RoboDog("");
		Animal roboCat = new RoboCat("");
		assertTrue(dog instanceof Animal);
		assertTrue(cat instanceof Animal);
		assertTrue(roboDog instanceof Animal);
		assertTrue(roboCat instanceof Animal);
	}
	
}

