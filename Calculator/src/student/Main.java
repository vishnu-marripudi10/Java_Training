package student;

public class Main {
	public static void main(String[] args)
	{
	Calculator calc1 = new Calculator();
	calc1.studentNo=1;
	calc1.studentFirstname="Vishnu";
	calc1.studentLastname="Sai";
	calc1.age=21;
	calc1.gender='M';
	calc1.englishMarks=88.5f;
	calc1.mathsMarks=91.3f;
	calc1.major="Computer Science";
	calc1.student();
	calc1.display();
	Calculator calc2 = new Calculator();
	calc2.studentNo=2;
	calc2.studentFirstname="Rajesh";
	calc2.studentLastname="Babu";
	calc2.age=21;
	calc2.gender='M';
	calc2.englishMarks=89.5f;
	calc2.mathsMarks=95.3f;
	calc2.major="E.C.E";
	calc2.student();
	calc2.display();
	
	}
}
