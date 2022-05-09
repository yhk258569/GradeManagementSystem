import java.util.Scanner;

public class MiddleSchoolGrade extends Grade implements GradeInput{
	public MiddleSchoolGrade(StudentKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		//중학생은 학번이 아닌 반번호를 입력받음
		System.out.print("Class and Number(ex - 335 is Class 3, Number 35): ");
		int id = input.nextInt();
		this.setId(id);

		System.out.print("Student Name: ");
		String name = input.next();
		this.setName(name);

		//중학생에게는 아직 성적 관리보다는 꿈을 생각해보는 것이 중요하다.
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
