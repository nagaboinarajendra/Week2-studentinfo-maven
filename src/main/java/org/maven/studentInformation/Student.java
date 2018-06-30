package org.maven.studentInformation;


public class Student {
	private String studentId;
	private String studentFirstName;
	private String studentLastName;
	private String studentYear;
	private String studentDepartment;
	
	public Student(String id, String firstName, String lastName, String year, String department) {
		this.studentId = id;
		this.studentFirstName = firstName;
		this.studentLastName = lastName;
		this.studentYear = year;
		this.studentDepartment = department;
	}
	
	//setters
	/**
	 * @param id of student.
	 */
	public void setStudentId(String id) {
		this.studentId = id;
	}
	/**
	 * @param firstName of student
	 */
	public void setStudentFirstName(String firstName) {
		this.studentFirstName=firstName;
	}
	/**
	 * 
	 * @param lastName of student
	 */
	public void setStudentLastName(String lastName) {
		this.studentLastName=lastName;
	}
	/**
	 * 
	 * @param year of student
	 */
	public void setStudentYeat(String year) {
		this.studentYear=year;
	}
	/**
	 * 
	 * @param department of student
	 */
	public void setStudentDepartment(String department) {
		this.studentDepartment=department;
	}
	
	//getters
	/**
	 * 
	 * @return id of student
	 */
	public String  getStudentId() {
		return this.studentId;
	}
	/**
	 * firstname of student
	 * @return
	 */
	public String getStudentFirstName() {
		return this.studentFirstName;
	}
	/**
	 * 
	 * @return lastname of student
	 */
	public String getStudentLastName() {
		return this.studentLastName;
	}
	/**
	 * 
	 * @return year of student
	 */
	public String getStudentYear() {
		return this.studentYear;
	}
	/**
	 * 
	 * @return department of student
	 */
	public String getStudentDepartment() {
		return this.studentDepartment;
	}
}
