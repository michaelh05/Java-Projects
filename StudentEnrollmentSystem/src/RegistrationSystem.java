import java.util.Scanner;

public class RegistrationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//scanner initialization 
		Scanner input = new Scanner(System.in); 
		
		//get name for student object creation 
		System.out.println("Enter Student Name: "); 
		String name = input.nextLine(); 
		
		//initializing student 
		Student student = new Student(name);
		
		//course initialization
		Course[] catalog = new Course[5]; 
		
		
		//hardcoded catalog items 
		catalog[0] = new Course("Intro to Java", 3, Department.CS);
        catalog[1] = new Course("Data Communications", 3, Department.CS);
        catalog[2] = new Course("Calculus", 4, Department.MATH);
        catalog[3] = new Course("History", 3, Department.HIST);
        catalog[4] = new Course("Biology", 3, Department.SCIENCE);
        
        int choice; 
        //menu loop 
        do {

            System.out.println("\n----- Menu -----");
            System.out.println("1. Add Course");
            System.out.println("2. Drop Course");
            System.out.println("3. View Schedule");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            choice = input.nextInt();
            input.nextLine(); // clear buffer

            switch (choice) {

                case 1: // Add Course
                    System.out.println("\nAvailable Courses:");

                    for (Course c : catalog) {
                        System.out.println(c);
                    }

                    System.out.print("Enter Course ID: ");
                    int addID = input.nextInt();
                    input.nextLine();

                    boolean isFound = false;

                    for (Course c : catalog) {
                        if (c.getCourseID() == addID) {
                            student.enroll(c);
                            isFound = true;
                            break;
                        }
                    }

                    if (!isFound) {
                        System.out.println("Invalid Course ID.");
                    }

                    break;

                case 2: // Drop Course
                    System.out.print("Enter Course ID to drop: ");
                    int dropID = input.nextInt();
                    input.nextLine();

                    student.drop(dropID);

                    break;

                case 3: // View Schedule
                    student.printSchedule();
                    break;

                case 4: // Exit
                    System.out.println("Goodbye!");
                    break;
                default: //for invalid input
                    System.out.println("Invalid option."); 
            }

        } while (choice != 4);

        input.close();
    }

}
