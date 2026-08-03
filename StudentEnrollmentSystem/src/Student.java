import java.util.ArrayList;

public class Student {
	
	//instance variables 
	private String studentName; 
	private ArrayList<Course> schedule; 
	
	//constructor 
	public Student(String name) {
		this.studentName = name; 
		schedule = new ArrayList<>(); 
	}
	
	//enroll method
	public void enroll(Course c) {
		if (c == null) { //check if course is null
			System.out.println("Course is Null"); 
			return; 
		} 
		
		if (schedule.contains(c)) { //check if course is already in schedule
			System.out.println("Already Enrolled in this course"); 
		} else {
			schedule.add(c); 
			System.out.println("Successfully Enrolled in" + c.getName());
		}
	}
	
	//drop course method 
	public void drop(int targetID) {
		for (int i = schedule.size() - 1; i >= 0; i--) {
			if (schedule.get(i).getCourseID() == targetID) { //get i from schedule then get courseID from Course.java / compare to target
                System.out.println("Dropped course: " + schedule.get(i).getName());
                schedule.remove(i); //course is removed
                return;
			} 
		}
		//only prints if loop does not find course
		System.out.println("Course with ID " + targetID + " not found in schedule.");
	}
		
	//get total credits method
	public int getTotalCredits() {
		int total = 0; 
		
		for (Course c : schedule) {
			total += c.getCredits(); 
		}
		return total; 
	}
	
	//print schedule 
	public void printSchedule() {
		//name 
		System.out.println("\nStudent Name: " + studentName); 
		
		//schedule
		System.out.println("Current Schedule: "); 
		for (Course c : schedule) {
			System.out.println(c); 
		}
		
		//total credits
		System.out.println("Total Credits: " + getTotalCredits()); 
	}
	
}
