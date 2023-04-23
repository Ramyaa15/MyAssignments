package week1.day1;

public class Student {
	String studentName = "Ramyaa";
	int rollNo = 921766;
	String collegeName ="RMD Engineering College";
	int markScored = 88;
	float cgpa = 7.9f;
	
public void report()
{
	System.out.println("StudentName:" + studentName);
	System.out.println("RollNo:" + rollNo);
	System.out.println("CollegeName:" + collegeName);
	System.out.println("Scored Mark:" + markScored);
	System.out.println("CGPA:" + cgpa);
}
	
public static void main(String[] args) {
	    System.out.println("Ramyaa Student Report");
		Student Obj =new Student();
		Obj.report();
		}

}
