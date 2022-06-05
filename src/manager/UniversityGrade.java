package manager;

import java.util.Scanner;

public class UniversityGrade extends Grade {

	public UniversityGrade(StudentKind kind) {
		super(kind);
	}

	//값을 입력받아서 setting(이름, 학번, 성적 등) 해주는 getUserInput 메소드 생성
	public void getUserInput(Scanner input) {
		System.out.print("Student ID(학번): ");
		ssetStudentID(input);

		setStudentName(input);

		System.out.print("Final Goal Grade(ex - 4.2): "); 
		ssetStudenFinalGoal(input);

		System.out.print("Grade and Semester(ex- 2 Grade 1 Semester is 2.1): ");
		ssetStudentGraSem(input);

		System.out.print("Grade(ex - ABACABF): ");
		ssetStudentGrade(input);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind: " + skind + " Name: "+ name + " Id: " + id +" FinalGoal: "+ finalgoal + " GradeAndSemester: " + graSem + " Grade: " + grade);
	}
}
