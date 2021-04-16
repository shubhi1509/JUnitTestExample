package JUnitPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddString {

	@Test
	void test() {
		JUnitTesting junit = new JUnitTesting();
		String result = junit.addstring("capstone", "project");
		assertEquals ("capstoneproject", result);
	}

}
