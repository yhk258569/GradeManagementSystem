import java.util.Scanner;

public class UniversityGrade extends Grade implements GradeInput{

	public UniversityGrade(StudentKind kind) {
		super(kind);
	}

	//���� �Է¹޾Ƽ� setting(�̸�, �й�, ���� ��) ���ִ� getUserInput �޼ҵ� ����
	public void getUserInput(Scanner input) {
		System.out.print("Student ID(�й�): ");
		int id = input.nextInt();
		this.setId(id);

		System.out.print("Student Name: ");
		String name = input.next();
		this.setName(name);

		System.out.print("Final Goal Grade(ex - 4.2): "); 
		Double finalgoal = input.nextDouble();
		this.setFinalgoal(finalgoal);

		System.out.print("Grade and Semester(ex- 1 Grade 2 Semester is 1.2): ");
		Double graSem = input.nextDouble();
		this.setGraSem(graSem);

		System.out.print("Grade(ex - ABACABF): ");
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
			/*case ElementarySchool:
			skind = "Elementary";
			break; */
		default:

		}
		System.out.println("Kind: " + skind + " Name: "+ name + " Id: " + id +" FinalGoal: "+ finalgoal + " GradeAndSemester: " + graSem + " Grade: " + grade);
	}
}
