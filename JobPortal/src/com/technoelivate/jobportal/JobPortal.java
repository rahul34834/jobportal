package com.technoelivate.jobportal;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class JobPortal {
	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Name , Age , Percentage in the same order");
		
		LinkedHashSet<Candidate> lhs=new LinkedHashSet<Candidate>();
		
		lhs.add(new Candidate(sc.next(),sc.nextInt(),sc.nextDouble()));
		lhs.add(new Candidate(sc.next(),sc.nextInt(),sc.nextDouble()));
		lhs.add(new Candidate(sc.next(),sc.nextInt(),sc.nextDouble()));
		lhs.add(new Candidate(sc.next(),sc.nextInt(),sc.nextDouble()));
		
		Company c=new Company(60);
		
		System.out.println("The eligible Candidates are.....!!!");
		
		System.out.println("Name "+" \t\t "+" Age" + " \t\t "+" Percentage ");
		System.out.println("..........................................");
		
		for (Candidate cd : lhs) {
			if (cd.getPercentage()>=c.getEligible() && cd.getPercentage()<=100) {
				System.out.println(cd.getName()+ " \t\t "+ cd.getAge()+ " \t\t " +cd.getPercentage());
				
				
			}
			
		}
		
		
	}
}
