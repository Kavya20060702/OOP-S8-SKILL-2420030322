package skill1;

public class StudentDashboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long rollNumber = 2420030322L;
        String name = "P. Kavya Sai";
        float marks = 98.9f;
        char gender = 'F';
        boolean isPassed = true;

        
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks);
        System.out.println("Gender      : " + gender);
        System.out.println("Status      : " + (isPassed ? "Pass" : "Fail"));
	}

}
