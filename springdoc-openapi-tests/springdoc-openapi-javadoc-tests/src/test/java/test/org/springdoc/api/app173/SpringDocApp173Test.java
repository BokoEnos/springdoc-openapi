package test.org.springdoc.api.app173;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.TestPropertySource;
import test.org.springdoc.api.AbstractSpringDocTest;

/**
 * The type Spring doc app 173 test.
 */
@TestPropertySource(properties = "example.description=The example object")
public class SpringDocApp173Test extends AbstractSpringDocTest {

	/**
	 * The type Spring doc test app.
	 */
	@SpringBootApplication
	static class SpringDocTestApp {
	}

}
