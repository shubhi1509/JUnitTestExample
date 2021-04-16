package JUnitPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testaddnumbers {

	@Test
	void test() {
		JUnitTesting junit = new JUnitTesting();
		int result = junit.addnumber(100, 200);
		assertEquals (300, result);
	}

}
