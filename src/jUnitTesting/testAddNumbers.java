package jUnitTesting;
//import org.junit.Test;



import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class testAddNumbers {

	@Test
	public void test() {
		junit obj=new junit();
		int result=obj.add(100,200);
		assertEquals (300,result);
	}

}
