package squaresort;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

	@Override
	public int compare(Person p0, Person p1) {
		
		if (p0.surname.compareTo(p1.surname) == 0){
			return p0.givenName.compareTo(p1.givenName);
		}
		
		return p0.surname.compareTo(p1.surname);
	}
	
}
