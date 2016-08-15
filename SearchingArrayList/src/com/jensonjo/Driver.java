package com.jensonjo;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	static void display(ArrayList<Student> list) {
		for (Student student : list) {
			System.out.printf("%-15s %-15s %n", student.getName(), student.getAddress());

		}
		System.out.printf("%-30s %n", "##############################");
	}

	public static void main(String[] args) {
		String[] name = { "Jenson", "Sunil", "Pratik", "Prashant", "Paul", "Ankit", "Dharmesh", "Bidhu", "Prashant",
				"Kolge" };
		String[] address = { "Chicago", "New York", "Cincinati", "San Diago", "Denver", "Boston", "Columbus", "Buffalo",
				"Kentuky", "Pensilvania" };
		ArrayList<Student> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(new Student(name[i], address[i]));
		}
		display(list);
		list.sort(new StudentNameComparator());
		display(list);

		Student searchKey = new Student("Jenson", "Chicago");
		int res = Collections.binarySearch(list, searchKey, new StudentNameComparator());
		if (res >= 0) {
			System.out.printf("%-15s %-15s %n", list.get(res).getName(), list.get(res).getAddress());
		}
		for (Student student : list) {
			if (student.equals("Jenson")) {
				System.out.println("Student found");
				return;
			}
		}
	}

}
