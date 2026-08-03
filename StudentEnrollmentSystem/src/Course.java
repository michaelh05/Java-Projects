
public class Course {
	
	//generating unique ids 
	private static int idGenerator = 1000; 
	
	
	//instance variables
	private int courseID; 
	private String name; 
	private int credits; 
	private Department dept; 
	
	//constructor 
	public Course(String name, int credits, Department dept) {
		this.courseID = idGenerator; 
		idGenerator++; //increasing static generator for unique id 
		this.name = name; 
		this.credits = credits; 
		this.dept = dept; 
	}
	
	//getters
	public int getCourseID() {
		return courseID; 
	}
	
	public String getName() {
		return name; 
	}
	
	public int getCredits() {
		return credits; 
	}
	
	public Department getDepartment() {
		return dept; 
	}
	
	//Equals method 
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Course) {
            Course item = (Course) obj; //casting obj to course 
            return this.courseID == item.courseID;
        }
        return false;
	}
	
	@Override 
	public String toString() {
		return "[" + courseID + "]" + dept + " - " + name + "("+credits+"Credits)";
		//"[1000] CS - Intro to Java (3 Credits)
	}
}
