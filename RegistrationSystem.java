// Student Name: Khang Tran
// Date Due: November 30, 2022
// Date Submitted: November 29, 2022
// Program Name: Student Registration System
// Program Description: Student registration system allows a staff such as a advisor to input student and course information into
// system that then stores the information.



import java.util.ArrayList;
import java.util.Scanner;

public class RegistrationSystem {

	public static void main(String[] args) {

		ArrayList<Student> Students = new ArrayList<Student>(); //Student List
		ArrayList<Course> Courses = new ArrayList<Course>(); //Courses List
		
		
		Scanner input = new Scanner(System.in);
		
		
		 while (true) { //Registration Option Menu
	            int choice = 0;
	            System.out.print("\nRegistration Menu:");
	            System.out.print("\n1. Enroll Student"); 
	            System.out.print("\n2. Unenroll Student");
	            System.out.print("\n3. Add Course"); 
	            System.out.print("\n4. Delete Course"); 
	            System.out.print("\n5. Register Course");
	            System.out.print("\n6. Drop Course"); 
	            System.out.print("\n7. Student Information");
	            System.out.print("\n8. Courses Informtion");
	            System.out.println();
	            
	            System.out.println("\nEnter your choice: ");
	            choice = input.nextInt();
	            
	            switch(choice) { 
	            
	            case 1: //Enroll Option

	        		String studentName = "";
	            	int studentID = 0;
	            	String registerCourses = null;
	            	
	            	
	            	Scanner userName = new Scanner(System.in);
	            	System.out.println("\nEnter Student's Name: ");
	            	studentName = userName.nextLine();
	            		
	            	Scanner userID = new Scanner(System.in);
	            	System.out.println("\nEnter Student's ID: ");
	            	studentID = userID.nextInt();
	            	
	            	Student student = new Student(studentName, studentID, registerCourses);
	            	Students.add(student);
	            	
	            	System.out.println("Enrolled " + student.getName() + "\n" + student.getName() + "'s ID: " + student.getID() +
	            			" Registered Courses: " + student.getCourse());
	            	
	            	System.out.println();
	            	break;
	            	
	            	
	            case 2: // Unenroll Option
	            	
	            	for (int i = 0; i < Students.size(); i++) {
		            	System.out.println("Enter Student's ID to Unenroll: ");
		            	int stuID = input.nextInt();
	            		if (stuID == Students.get(i).getID()); {
	            			Students.remove(i);
	            		}
	            	}
	            	break;
	            
	            	
	            case 3: // Add Course
	            		
	            	String courseTitle = "";
	            	int courseNumber = 0;
	            	String instructor = "";
	            	float creditNumber = 0;
	            	int maxSeats = 0;
	            	int remainingSeats = 0;
	            	
	            		Scanner inputTitle = new Scanner(System.in);
	            		System.out.println("\nEnter Name of Course: ");
	            		courseTitle = inputTitle.nextLine();
	            		
	            		Scanner inputNumber = new Scanner(System.in);
	            		System.out.println("\nEnter Course Number: ");
	            		courseNumber = inputNumber.nextInt();
	            		
	            		Scanner inputInstructor = new Scanner(System.in);
	            		System.out.println("\nEnter Instructor Name: ");
	            		instructor = inputInstructor.nextLine();
	            		
	            		Scanner inputCredit = new Scanner(System.in);
	            		System.out.println("\nEnter Total Credits: ");
	            		creditNumber = inputCredit.nextInt();
	            		
	            		Scanner inputSeats = new Scanner(System.in);
	            		System.out.println("\nEnter Maximum Seats Within Class: ");
	            		maxSeats = inputSeats.nextInt();
	            		
	            		Course course = new Course(courseTitle, courseNumber, instructor, creditNumber, maxSeats, remainingSeats);
	            		
	            		Courses.add(course);
	            	
	            	break;
	            	
	            	
	            case 4: // Delete Course
	            	
	            	for (int i = 0; i < Courses.size(); i++) {
		            	System.out.println("Enter Student's ID to Unenroll: ");
		            	int courID = input.nextInt();
	            		if (courID == Courses.get(i).getNumber()); {
	            			Courses.remove(i);
	            		}
	            	}
	            	break;
	            	
	            	
	            case 5: // Register Course
	            	// Tried attempting the syntax for registering course for student and storing it, but to no avail and couldn't
	            	// figure out to make it work properly.
	            	
	            	for (int i = 0; i < Students.size(); i++) {
	            	System.out.println("Enter Student's ID: ");
	            	int ID = input.nextInt();
            		if (ID == Students.get(i).getID());
	            	} 
	            	
	            	System.out.println("What Class to Register for Student?");
	            	System.out.println("Enter Course Name: ");
	            	Scanner courName = new Scanner(System.in);
	            	courseTitle = courName.nextLine();
	            	
	            	System.out.println("Enter Course Number: ");
	            	Scanner courNum = new Scanner(System.in);
	            	courseNumber = courName.nextInt();
	            	
	            	Student student1 = new Student(courseTitle, courseNumber);
	            	
	            	for (int i = 0; i < Courses.size(); i++) {
	            		if (courseTitle == Courses.get(i).getTitle() && courseNumber == Courses.get(i).getNumber()) {
	            			Students.add(student1);
	            		} 
	            	}
	            	
	            	break;
	            	
	            	
	            case 6: //Drop Course
	            	
	            	for (int i = 0; i < Students.size(); i++) {
		            	System.out.println("Enter Student's ID to Unenroll: ");
		            	String stuCla = input.nextLine();
	            		if (stuCla == Students.get(i).getCourse()); {
	            			Students.remove(i);
	            		}
	            	}
	            	break;
	            	
	            	
	            case 7: // Student Information
	            	
	            	System.out.println("\nEnrolled Students Information:");
	            	for (int i = 0; i < Students.size(); i++)
	            		System.out.println("Student's Name: " + Students.get(i).getName() + " " + "ID: " + Students.get(i).getID() + 
	            				"Registered Courses: " + Students.get(i).getCourse());
	            	break;
	            	
	            case 8: // Course Information
	            	
	            	System.out.println("\nCurrent Courses Information: ");
	            	for (int i = 0; i < Courses.size(); i++) {
	            	System.out.println("Course: " + Courses.get(i).getTitle() + " " + Courses.get(i).getNumber() + 
	            			"\nInstructor's Name: " + Courses.get(i).getInstructor() + "\nMax Credits: " + Courses.get(i).getCredit() + 
	            			"\nTotal Seats: " + Courses.get(i).getMax() + "\nSeats Remaining: " + Courses.get(i).getRemaining() + "\n");
	            	}
	            	break;
	            	
	            default: System.out.println("\nInvalid Option, Please Try Again");
	            }
	            
		 }
	}

}


class Student { //Student class
	
	private String studentName; 
	private int studentID;
	private String registerCourses;
	private ArrayList<Course> regCourses;
	
	//Student class constructor
	Student(String studentName, int studentID) {
		this.setName(studentName);
		this.setID(studentID);
		this.setCourse(registerCourses);
	}
	//Another class constructor
	Student(String studentName, int studentID, String registerCourses) {
		this.setName(studentName);
		this.setID(studentID);
		this.setCourse(registerCourses);
	}
	
	//Student get() methods
	public String getName() {
		return studentName;
	}
	
	public int getID() {
		return studentID;
	}
	
	public String getCourse() {
		return registerCourses;
	}
	
	public ArrayList<Course> getRegCourses() {
		return regCourses;
	}
	
	//Student set() methods
	public void setName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setID(int studentID) {
		this.studentID = studentID;
	}
	
	public void setCourse(String course) {
		this.registerCourses = course;
	}
	
	
}

class Course { //Course class
	
	private String courseTitle;
	private int courseNumber;
	private String instructor;
	private float creditHours;
	private int maxSeats;
	private int remainingSeats;
	private ArrayList<Student> regStudents;

	//Course class constructor
	Course(String courseTitle, int courseNumber, String instructor, float creditHours, int maxSeats, int remainingSeats) {
		this.setTitle(courseTitle);
		this.setNumber(courseNumber);
		this.setInstuctor(instructor);
		this.setCredit(creditHours);
		this.setMax(maxSeats);
		this.setRemaining(remainingSeats);
		regStudents = new ArrayList<Student>();
	}
	
	//Another class constructor
	Course(String courseTitle, int courseNumber) {
		this.setTitle(courseTitle);
		this.setNumber(courseNumber);
	}
	
	//Course get() methods
	public String getTitle() {
		return courseTitle;
	}
	
	public int getNumber() {
		return courseNumber;
	}
	
	public String getInstructor() {
		return instructor;
	}
	
	public float getCredit() {
		return creditHours;
	}
	
	public int getMax() {
		return maxSeats;
	}
	
	public int getRemaining() {
		return remainingSeats;
	}
	
	public ArrayList<Student> getRegStudents() {
		return regStudents;
	}
	
	//Course set() methods
	public void setTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	
	public void setNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	
	public void setInstuctor(String instructor) {
		this.instructor = instructor;
	}
	
	public void setCredit(float creditHours) {
		this.creditHours = creditHours;
	}
	
	public void setMax(int maxSeats) {
		this.maxSeats = maxSeats;
	}
	
	public void setRemaining(int remainingSeats) {
		this.remainingSeats = remainingSeats;
	}
	
}
