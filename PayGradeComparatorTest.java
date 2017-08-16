package squaresort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PayGradeComparatorTest {
	PayGradeComparator EID;
	
	@Before
	public void setUP() {
		EID = new PayGradeComparator();
	}

	@Test
	public void test() {
		Person Ding = new Person("Zhang", "Ding", 3);
		Person Lan = new Person("Li", "Lan", 5);
		assertTrue(EID.compare(Ding, Lan) > 0);
	}

}
