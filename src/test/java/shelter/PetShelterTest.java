package shelter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PetShelterTest {

			@Before
			public void setup() {
			PetShelter	petShelter = new PetShelter();
			}

			@Test
			public void shouldBeAbleToCreateShelter() {
				PetShelter shelter = new PetShelter();
			}


			@Test
			public void shouldBeAbleToWaterAllOrganicPets() {
				PetShelter shelter = new PetShelter();
				VirtualPet organicCat = new OrganicCat("", 2, 3, 2, 4);
				VirtualPet organicDog = new OrganicDog("", 4, 2, 3, 4);

			}

			@Test
			public void shouldBeAbleToFeedAllOrganicPets() {
				VirtualPet organicCat = new OrganicCat("", 2, 3, 2, 4);
				VirtualPet organicDog = new OrganicDog("", 4, 2, 3, 4);
			}

	


	

}
