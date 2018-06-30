package org.maven.studentInformation;

import java.util.List;
import java.util.Scanner;

	
public class SearchStudent {
	
	public SearchStudent(List<Student> studentArrayList,Student[] student) {
		
		System.out.println("Enter one of the search options\n1.Search By Id\n2.Search By FirstName"
				+ "\n3.Search by LastName\n4.Search By Year\n5.Search By Department");
		Scanner input = new Scanner(System.in);
	
		int searchChoice = input.nextInt();
	
		switch(searchChoice) {
			case 1:
				System.out.println("Enter Id");
		        String id=input.next();
				searchById(studentArrayList,student,id);
				break;
			case 2:
				System.out.println("Enter First Name of Student");
		        String firstName=input.next();
				searchByFirstName(studentArrayList,student,firstName);
				break;
			case 3:
				System.out.println("Enter Last Name Of Student");
		        String lastName=input.next();
				searchByLastName(studentArrayList,student,lastName);
				break;
			case 4:
				System.out.println("Enter Year Of Student");
		        String year=input.next();
				searchByYear(studentArrayList,student,year);
				break;
			case 5:
				System.out.println("Enter Department Of Student");
		        String department=input.next();
				searchByDepartment(studentArrayList,student,department);
				break;
			default:System.out.println("Invalid Choice");
		}
		input.close();
		}
	

	private void searchByDepartment(List<Student> studentArrayList,Student[] student,String department) {
		for(Student b:studentArrayList){  
        	if(b.getStudentDepartment().equals(department)) {
			    System.out.println(b.getStudentId()+" "+b.getStudentFirstName()+" "+b.getStudentLastName()+" "+b.getStudentYear()+" "+b.getStudentDepartment());  
			    
        	}
        } 
	}


	private void searchByYear(List<Student> studentArrayList,Student[] student,String year) {
		for(Student b:studentArrayList){  
        	if(b.getStudentYear().equals(year)) {
			    System.out.println(b.getStudentId()+" "+b.getStudentFirstName()+" "+b.getStudentLastName()+" "+b.getStudentYear()+" "+b.getStudentDepartment());  
			    
        	}
        } 
	}


	private void searchByLastName(List<Student> studentArrayList,Student[] student,String lastName) {
		for(Student b:studentArrayList){  
        	if(b.getStudentLastName().equals(lastName)) {
			    System.out.println(b.getStudentId()+" "+b.getStudentFirstName()+" "+b.getStudentLastName()+" "+b.getStudentYear()+" "+b.getStudentDepartment());  
			    
        	}
        } 
	}


	private void searchByFirstName(List<Student> studentArrayList,Student[] student,String firstName) {		
        for(Student b:studentArrayList){  
        	if(b.getStudentFirstName().equals(firstName)) {
			    System.out.println(b.getStudentId()+" "+b.getStudentFirstName()+" "+b.getStudentLastName()+" "+b.getStudentYear()+" "+b.getStudentDepartment());  
			    
        	}
        } 
	}


	private void searchById(List<Student> studentArrayList,Student[] student,String id) {
		for(Student b:studentArrayList){  
        	if(b.getStudentId().equals(id)) {
			    System.out.println(b.getStudentId()+" "+b.getStudentFirstName()+" "+b.getStudentLastName()+" "+b.getStudentYear()+" "+b.getStudentDepartment());  
			    
        	}
        } 
	}
	
}
