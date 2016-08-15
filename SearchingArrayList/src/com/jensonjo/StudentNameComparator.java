package com.jensonjo;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		int res = o1.getName().compareTo(o2.getName());
		if (res != 0) {
			return res;
		}
		return o1.getAddress().compareTo(o2.getAddress());
	}

}
