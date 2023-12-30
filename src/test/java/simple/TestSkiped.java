package simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple1")
public class TestSkiped {
	@Test
	@Disabled ("Some reason")
	void test1 (){
		assertTrue(false);
	}
}
