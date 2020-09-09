package student;

public class Calculator {
	int studentNo;
	String studentFirstname;
	String studentLastname;
	int age;
	char gender;
	float englishMarks;
	float mathsMarks;
	String major;
	float totalMarks;
	float averageMarks;
	void student()
	{
	System.out.println("Student Complete Details are");
	System.out.println("Fullname of Student ="+ studentFirstname + " " + studentLastname);
	System.out.println("Age ="+ age);
	System.out.println("Gender ="+ gender);
	totalMarks = englishMarks+mathsMarks;
	System.out.println("Total Marks =" +totalMarks);
	averageMarks = totalMarks/2;
	System.out.println("Average Marks =" +averageMarks);
	
	System.out.println("Major =" +major);
	
	}
	void display() {
		if(studentFirstname== "Rajesh")
		{
			System.out.println("Fullname of Student ="+ studentFirstname + " " + studentLastname);
			/*System.out.println("Age ="+ age);
			System.out.println("Gender ="+ gender);
			totalMarks = englishMarks+mathsMarks;
			System.out.println("Total Marks =" +totalMarks);
			averageMarks = totalMarks/2;
			System.out.println("Average Marks =" +averageMarks);*/
			
			System.out.println("Major =" +major);
		}
		if(studentNo == 1) {
			System.out.println("Fullname of Student ="+ studentFirstname + " " + studentLastname);
			/*System.out.println("Age ="+ age);
			System.out.println("Gender ="+ gender);
			totalMarks = englishMarks+mathsMarks;
			System.out.println("Total Marks =" +totalMarks);
			averageMarks = totalMarks/2;
			System.out.println("Average Marks =" +averageMarks);*/
			
			System.out.println("Major =" +major);
		}
		if(major == "Computer Science") {
			System.out.println("Computer Science Student ="+ studentFirstname + " " + studentLastname);
		}
		else if(major == "E.C.E") {
			System.out.println("E.C.E Student ="+ studentFirstname + " " + studentLastname);
		}
		else
		{
			System.out.println("Not Found");
		}
	}
	
	

}
