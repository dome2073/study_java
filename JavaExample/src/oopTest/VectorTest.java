package oopTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	public void addTest() {
		Vector v = new Vector();
		final int SIZE = 100_000;
		for( int i=0; i<100000;i++) {
			v.add(""+i);
		}

		System.out.println(v);
		
		assertTrue(v.size() ==SIZE);

	}

}
