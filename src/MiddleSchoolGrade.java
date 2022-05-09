import java.util.Scanner;

public class MiddleSchoolGrade extends Grade implements GradeInput{
	public MiddleSchoolGrade(StudentKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		//���л��� �й��� �ƴ� �ݹ�ȣ�� �Է¹���
		System.out.print("Class and Number(ex - 335 is Class 3, Number 35): ");
		int id = input.nextInt();
		this.setId(id);

		System.out.print("Student Name: ");
		String name = input.next();
		this.setName(name);

		//���л����Դ� ���� ���� �������ٴ� ���� �����غ��� ���� �߿��ϴ�.
		System.out.print("What is your Dream: ");
		String grade1 = input.next();
		this.setGrade(grade1);
	}

	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case University:
			skind = "Univ.";
			break;
		case HighSchool:
			skind = "High.";
			break;
		case MiddleSchool:
			skind = "Middle.";
			break;
		default:
		}
		System.out.println("Kind: " + skind + " Name: "+ name + " Id: " + id + " Dream: " + grade);
	}
}
