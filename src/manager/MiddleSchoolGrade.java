package manager;
import java.util.Scanner;

import exception.FormatException;

public class MiddleSchoolGrade extends Grade {
	public MiddleSchoolGrade(StudentKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) {
		//중학생은 학번이 아닌 반번호를 입력받음
		System.out.print("Class and Number(ex - 335 is Class 3, Number 35): ");
		ssetStudentID(input);

		setStudentName(input);

		//중학생에게는 아직 성적 관리보다는 꿈을 생각해보는 것이 중요하다.
		System.out.print("What is your Dream: ");
		String grade1 = input.next();
		this.setGrade(grade1);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind: " + skind + " Name: "+ name + " Id: " + id + " Dream: " + grade);
	}

}
