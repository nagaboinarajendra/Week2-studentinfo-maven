package org.maven.studentInformation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentMain {
	public static void main(String[] args) throws IOException {
		BufferedReader csvFileReader = new BufferedReader(new FileReader("/Users/rajendra/eclipse-workspace/studentinfo/res/studentdetails.csv"));
		String inputLine = "";
		int index=0;
		List<Student> studentArrayList = new ArrayList<Student>();
		Student[] student=new Student[10];
		while((inputLine=csvFileReader.readLine())!=null){
		    String [] currentStudent =inputLine.trim().split(",");
		    student[index]=new Student(currentStudent[0],currentStudent[1],currentStudent[2],currentStudent[3],currentStudent[4]);
		    studentArrayList.add(student[index]);
		    index++;
		}
        csvFileReader.close();
        Scanner input = new Scanner(System.in);
        System.out.println("choose one of the below options\n1.Search for Student"
        		+ "\n2.Sort the student list");
        int choice = input.nextInt();
        switch(choice){
        	case	1 :
        		new SearchStudent(studentArrayList,student);
        		break;
        	case	2:
        		new SortStudent(studentArrayList,student);
        		break;
        	default:System.out.println("invalid choice");
        }
        input.close();
	}
}
