package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumjunit {

	@Test
	 void test() {
		sum junit = new sum();
		int output= junit.add(32, 48);
		assertEquals(80,output);
		
		
		
	}

}
