package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		junit obj=new junit();
		String result=obj.String("Hello ", "World");
		assertEquals("Hello World",result);
	}

}
