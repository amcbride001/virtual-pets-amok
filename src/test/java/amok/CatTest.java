package amok;

import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class CatTest {
Animal cat;

@Test
	public void playShouldDecreaseSoiledLitterBoxes() {
		Animal cat = new Cat("");
		int playingBefore = cat.getPlaying();
		cat.play();
		int playingAfter = cat.getPlaying();
		assertThat(playingAfter, is(lessThan(playingBefore)));
}

	}


