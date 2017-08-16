package squaresort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NameComparatorTest {
	
	NameComparator nameComp;
	
	@Before
	public void setUP() {
		nameComp = new NameComparator();
	}

	@Test
	public void test() {
		Person Ding = new Person("Ding", "Zhang", 3);
		Person Lan = new Person("Lan", "Li", 5);
		assertTrue(nameComp.compare(Ding, Lan) > 0);
		
		Ding = new Person("Zhang", "Ding", 3);
		Lan = new Person("Li", "Ding", 5);
		assertTrue(nameComp.compare(Ding, Lan) > 0);
		
		Ding = new Person("Li", "Ding", 3);
		Lan = new Person("Li", "Ding", 5);
		assertTrue(nameComp.compare(Ding, Lan) == 0);
	}

}
