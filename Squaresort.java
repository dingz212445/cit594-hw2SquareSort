package squaresort;

import java.util.Comparator;

// This is comment is for testing git

public class Squaresort {
	
	
	public static void linearSort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			for (int j = i; j > 0; j--) {
				if (nums[j - 1] > nums[j]) {
					int temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
				}
			}
		}
	}
	
	public static void linearSort(Person[] people, Comparator<Person> comp) {
		for (int i = 1; i < people.length; i++) {
			for (int j = i; j > 0; j--) {
				if (comp.compare(people[j - 1], people[j]) > 0) {
					Person p = people[j];
					people[j] = people[j - 1];
					people[j - 1] = p;
				}
			}
		}
	}
	
	public static void squaresort(Person[][] people, Comparator<Person> comp) {
		int rowNum = people.length;
		int columnNum = people[0].length;
		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < columnNum; j++) {
				
				if (i == 0 && j == 0) continue;
					for (int p = i; p >= 0; p--) {
						for (int k = j; k >= 0; k--) {
							
							if (p == 0 && k == 0) continue;
							if (k == 0) {
								if (comp.compare(people[p - 1][columnNum - 1], people[p][k]) > 0) {
									Person temp = people[p][k];
									people[p][k] = people[p - 1][columnNum - 1];
									people[p - 1][columnNum - 1] = temp;
								}
								continue;
							}
							if (comp.compare(people[p][k - 1], people[p][k]) > 0) {
								Person temp = people[p][k];
								people[p][k] = people[p][k - 1];
								people[p][k - 1] = temp;
							}
						}
					}
						
			}
		}
	}

}
