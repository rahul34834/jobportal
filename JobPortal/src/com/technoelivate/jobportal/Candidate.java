package com.technoelivate.jobportal;

public class Candidate {
	String name;
	int age;
	double percentage;
	public Candidate(String name, int age, double percentage) {
		super();
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getPercentage() {
		return percentage;
	}
	public String toString() {
		return name + " \t\t " + age + " \t\t " + percentage;
		
	}
	
	

}
