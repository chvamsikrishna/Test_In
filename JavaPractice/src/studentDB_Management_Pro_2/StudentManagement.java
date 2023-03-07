package studentDB_Management_Pro_2;

public class StudentManagement {

	public static void main(String[] args) {
		
		
		StudentDetails sd = new StudentDetails();
		CourseDetails cd = new CourseDetails();
		cd.courseEnrolment();
		FeeAndPayments fp = new FeeAndPayments();
		fp.StudentFeeDetails();

	}

}
