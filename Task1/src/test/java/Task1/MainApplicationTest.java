package Task1;

import static org.junit.Assert.*;

import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

public class MainApplicationTest {

	@Test
	public void testSortFunction() {
		assertThat(Functions.sort(List.of("Vlad", "John"), List.of("drives"), List.of("car", "motorcycle", "bus")), is( "John drives bus. John drives car. John drives motorcycle. Vlad drives bus. Vlad drives car. Vlad drives motorcycle."));
	}

}
