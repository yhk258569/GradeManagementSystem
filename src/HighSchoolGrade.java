import java.util.Scanner;

public class HighSchoolGrade extends Grade {	//Grade�� �θ�Ŭ������ �޴� �ڽ�Ŭ������ ����

	public HighSchoolGrade(StudentKind kind) {
		super(kind);
	}

	//�޼ҵ� �������̵�(����л��� ���л��� ���� �ٸ��� ������)
	public void getUserInput(Scanner input) {
		//����л��� �й��� �ƴ� �ݹ�ȣ�� �Է¹���
		System.out.print("Class and Number(ex - 335 is Class 3, Number 35): ");
		int id = input.nextInt();
		this.setId(id);

		System.out.print("Student Name: ");
		String name = input.next();
		this.setName(name);

		//���л��� �ٸ��� ����л��� ��ǥ ���������� �Է¹���
		System.out.print("Final Goal Grade(ex - 1.2): ");
		Double finalgoal = input.nextDouble();
		this.setFinalgoal(finalgoal);

		System.out.print("Grade and Semester(ex- 1 Grade 2 Semester is 1.2): ");
		Double graSem = input.nextDouble();
		this.setGraSem(graSem);

		//A - ��, B - ��, C - ��, D - ��, F - ��
		System.out.print("Grade(ex - ����̾簡): ");
		String grade1 = input.next();
		this.setGrade(grade1);
	}
}