import org.junit.jupiter.api.Test;

public class simplePropertyTest {
	@Test
	void simplePropertyTestSystem() {
		String browserName = System.getProperty("browser");
		System.out.println(browserName);
		System.out.println("2");
		// Work 2 was good work
	}
}
