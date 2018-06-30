package org.maven.studentInformation;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class SortStudent {
	public SortStudent(List<Student> studentArrayList,Student[] student) {
		System.out.println("Enter one of the sort options\n1.Sort By Id\n2.Sort By FirstName"
				+ "\n3.Sort by LastName\n4.Sort By Year\n5.Sort By Department");
		Scanner input = new Scanner(System.in);
	
		int sortChoice = input.nextInt();
	
		switch(sortChoice) {
			case 1:
				Collections.sort(studentArrayList, new Comparator<Student>() {
				    public int compare(Student o1, Student o2) {
				    	return o1.getStudentId().compareTo(o2.getStudentId());
				    }
				});
				displayStudentList(studentArrayList);
				break;
			case 2:
				Collections.sort(studentArrayList, new Comparator<Student>() {
				    public int compare(Student o1, Student o2) {
				    	return o1.getStudentFirstName().compareTo(o2.getStudentFirstName());
				    }
				});
				displayStudentList(studentArrayList);
				break;
			case 3:
				Collections.sort(studentArrayList, new Comparator<Student>() {
				    public int compare(Student o1, Student o2) {
				    	return o1.getStudentLastName().compareTo(o2.getStudentLastName());
				    }
				});
				displayStudentList(studentArrayList);
				break;
			case 4:
				Collections.sort(studentArrayList, new Comparator<Student>() {
				    public int compare(Student o1, Student o2) {
				    	return o1.getStudentYear().compareTo(o2.getStudentYear());
				    }
				});
				displayStudentList(studentArrayList);
				break;
			case 5:
				Collections.sort(studentArrayList, new Comparator<Student>() {
				    public int compare(Student o1, Student o2) {
				    	return o1.getStudentDepartment().compareTo(o2.getStudentDepartment());
				    }
				});displayStudentList(studentArrayList);
				break;
			default:System.out.println("Invalid Choice");
		}
		input.close();
	}

	private void displayStudentList(List<Student> studentArrayList) {
		for(Student b:studentArrayList){  
		    System.out.println(b.getStudentId()+"\t\t"+b.getStudentFirstName()+"\t\t"+b.getStudentLastName()+"\t\t"+b.getStudentYear()+"\t\t"+b.getStudentDepartment());  
    } 		
	}


}





