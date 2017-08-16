package squaresort;

import static org.junit.Assert.*;

import java.util.Comparator;

import org.junit.Before;
import org.junit.Test;

public class SquaresortTest {
	
	Person Ding, Lan, Wenjia, Litian;
	
	@Before
	public void setUp() {
		Ding = new Person("Ding", "Zhang", 3);
		Lan = new Person("Lan", "Li", 5);
		Wenjia = new Person("Wenjia", "Guo", 15);
		Litian = new Person("Litian", "Li", 10);
	}


	@Test
	public void testLinearSort() {
		int[] arrayTested = new int[]{2, 5, 3, 9, 6};
		int[] originalArray = new int[] {2, 3, 5, 6, 9};
		Squaresort.linearSort(arrayTested);
	
		for(int i = 0; i < 5; i++) {
			assertEquals(originalArray[i], arrayTested[i]);
		}
	}
	
	@Test
	public void testLinearSortPersonID() {
		
		Person[] people = new Person[] {Lan, Wenjia, Ding, Litian};
		Person[] peopleID = new Person[] {Ding, Lan, Wenjia, Litian};
		Comparator<Person> idComp = new EmployeeIDComparator();
		Squaresort.linearSort(people, idComp);
		for (int i = 0; i < 4; i++) {
			assertEquals(peopleID[i], people[i]);
		}
	}
	
	@Test
	public void testLinearSortPersonPay() {
		
		Person[] people = new Person[] {Lan, Wenjia, Ding, Litian};
		Person[] peoplePay = new Person[] {Ding, Lan, Litian, Wenjia};
		Comparator<Person> payComp = new PayGradeComparator();
		Squaresort.linearSort(people, payComp);
		for (int i = 0; i < 4; i++) {
			assertEquals(peoplePay[i], people[i]);
			
		}
	}
	
	@Test
	public void testLinearSortPersonName() {
		Person[] people = new Person[] {Lan, Wenjia, Ding, Litian};
		Person[] peopleName = new Person[] {Wenjia, Lan, Litian, Ding};
		Comparator<Person> nameComp = new NameComparator();
		Squaresort.linearSort(people, nameComp);
		for (int i = 0; i < 4; i++) {
			assertEquals(peopleName[i], people[i]);
		}
	}
	
	@Test
	public void testSquareSortPersonID() {
		Person[][] people = new Person[][] {{Lan, Wenjia}, {Ding, Litian}};
		Person[][] peopleID = new Person[][] {{Ding, Lan}, {Wenjia, Litian}};
		Comparator<Person> idComp = new EmployeeIDComparator();
		Squaresort.squaresort(people, idComp);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				assertEquals(peopleID[i][j], people[i][j]);
			}
		}
	}
	
	@Test
	public void testSquareSortPersonPay() {
		Person[][] people = new Person[][] {{Lan, Wenjia}, {Ding, Litian}};
		Person[][] peoplePay = new Person[][] {{Ding, Lan}, {Litian, Wenjia}};
		Comparator<Person> payComp = new PayGradeComparator();
		Squaresort.squaresort(people, payComp);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				assertEquals(peoplePay[i][j], people[i][j]);
			}
		}
	}
	
	@Test
	public void testSquareSortPersonName() {
		Person[][] people = new Person[][] {{Lan, Wenjia}, {Ding, Litian}};
		Person[][] peopleName = new Person[][] {{Wenjia, Lan}, {Litian, Ding}};
		Comparator<Person> nameComp = new NameComparator();
		Squaresort.squaresort(people, nameComp);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				assertEquals(peopleName[i][j], people[i][j]);
			}
		}
	}

}
