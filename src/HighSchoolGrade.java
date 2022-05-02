import java.util.Scanner;

public class HighSchoolGrade extends Grade {	//Grade를 부모클래스로 받는 자식클래스를 생성

	public HighSchoolGrade(StudentKind kind) {
		super(kind);
	}

	//메소드 오버라이딩(고등학생과 대학생은 조금 다르기 때문에)
	public void getUserInput(Scanner input) {
		//고등학생은 학번이 아닌 반번호를 입력받음
		System.out.print("Class and Number(ex - 335 is Class 3, Number 35): ");
		int id = input.nextInt();
		this.setId(id);

		System.out.print("Student Name: ");
		String name = input.next();
		this.setName(name);

		//대학생과 다르게 고등학생은 목표 내신점수를 입력받음
		System.out.print("Final Goal Grade(ex - 1.2): ");
		Double finalgoal = input.nextDouble();
		this.setFinalgoal(finalgoal);

		System.out.print("Grade and Semester(ex- 1 Grade 2 Semester is 1.2): ");
		Double graSem = input.nextDouble();
		this.setGraSem(graSem);

		//A - 수, B - 우, C - 미, D - 양, F - 가
		System.out.print("Grade(ex - 수우미양가): ");
		String grade1 = input.next();
		this.setGrade(grade1);
	}
}