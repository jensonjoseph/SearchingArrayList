package com.jensonjo;

public class Student {
	private String name;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(String _name, String _address) {
		address = _address;
		name = _name;
	}

	@Override
	public boolean equals(Object name) {
		if (this.name.equals((String) name))
			return true;
		else
			return false;
	}
}
