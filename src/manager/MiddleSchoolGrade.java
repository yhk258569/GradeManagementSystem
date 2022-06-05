package manager;
import java.util.Scanner;

import exception.FormatException;

public class MiddleSchoolGrade extends Grade {
	public MiddleSchoolGrade(StudentKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) {
		//���л��� �й��� �ƴ� �ݹ�ȣ�� �Է¹���
		System.out.print("Class and Number(ex - 335 is Class 3, Number 35): ");
		ssetStudentID(input);

		setStudentName(input);

		//���л����Դ� ���� ���� �������ٴ� ���� �����غ��� ���� �߿��ϴ�.
		System.out.print("What is your Dream: ");
		String grade1 = input.next();
		this.setGrade(grade1);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind: " + skind + " Name: "+ name + " Id: " + id + " Dream: " + grade);
	}

}
