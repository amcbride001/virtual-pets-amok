package amok;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DogTest {
	Dog dog;


	@Test
	public void walkingShouldDecreaseSoiledCages() {
		
		int walkingBefore = dog.getWalking();
		dog.walk();
		int walkingAfter = dog.getWalking();
		assertThat(walkingAfter, is(lessThan(walkingBefore)));
	}

	@Test
	public void shouldBeAbleToFeedDog() {
		int fullnessBefore = dog.getFullnessLevel();
		dog.feed(1);
		assertTrue((fullnessBefore - 2) == (dog.getFullnessLevel()));
	}

	@Test
	public void shouldBeAbleToGetFullnessLevel() {
		int fullnessLevel = dog.getFullnessLevel();
		assertTrue(fullnessLevel == 5);

	}

	@Test
	public void shouldBeAbleToGetHappinessLevel() {
		int happinessLevel = dog.getHappiness();
		assertTrue(happinessLevel == 8);
	}

	@Test
	public void shouldBeAbleToPlayWithDog() {
		int happinessLevelBefore = dog.getHappiness();
		dog.play();
		assertTrue(happinessLevelBefore - 3 == dog.getHappiness());
	}

	@Test
	public void shouldBeAbleToGetName() {
		String name = dog.getName();
		assertTrue(name.equals(""));
	}
	@Test
	public void shouldBeAbleToWaterDog() {
		int hydrationBefore = dog.getHydrationLevel();
		dog.giveWater();
		assertTrue(hydrationBefore -2 == dog.getHydrationLevel());
	}
	@Test
	public void shouldBeAbleToGetHydrationLevel() {
		int hydrationLevel = dog.getHydrationLevel();
		assertTrue(hydrationLevel == 7);
	}
	@Test
	public void shouldBeAbleToIncreaseAndDecreaseTick() {
		int happinessLevelBefore = dog.getHappiness();
		int hydrationLevelBefore = dog.getHydrationLevel();
		int fullnessLevelBefore = dog.getFullnessLevel();
		dog.tick();
		assertTrue(happinessLevelBefore +2 ==dog.getHappiness());
		assertTrue(hydrationLevelBefore +1 == dog.getHydrationLevel());
		assertTrue(fullnessLevelBefore +2 == dog.getFullnessLevel());
		}
	}
	


