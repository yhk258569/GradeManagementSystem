package manager;
import java.util.Scanner;

public class HighSchoolGrade extends Grade {

	public HighSchoolGrade(StudentKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Class and Number(ex - 335 is Class 3, Number 35): ");
		ssetStudentID(input);

		setStudentName(input);

		//대학생과 다르게 고등학생은 목표 내신점수를 입력받음
		System.out.print("Final Goal Grade(ex - 1.2): ");
		ssetStudenFinalGoal(input);

		System.out.print("Grade and Semester(ex- 1 Grade 2 Semester is 1.2): ");
		ssetStudentGraSem(input);

		//A - 수, B - 우, C - 미, D - 양, F - 가
		System.out.print("Grade(ex - 수우미양가): ");
		ssetStudentGrade(input);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind: " + skind + " Name: "+ name + " Id: " + id +" FinalGoal: "+ finalgoal + " GradeAndSemester: " + graSem + " Grade: " + grade);
	}

}
