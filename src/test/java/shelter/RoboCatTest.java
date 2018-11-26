package shelter;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RoboCatTest {
	
RoboCat roboCat;

@Before
public void setup() {
	roboCat = new RoboCat(null, 0, 0, 0, 0);
}
@Test
public void shouldBeAbleToGetOilLevel() {
	int oilLevel = roboCat.getOilLevel();
	assertTrue(oilLevel == 8);
}

@Test
public void shouldBeAbleToOil() {
	int startOilLevel = roboCat.getOilLevel();
	roboCat.getOil();
}
}
