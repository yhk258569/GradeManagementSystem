import java.util.ArrayList;
import java.util.Scanner;

public class GradeManager {
	//�� �л��� �ƴ� �����л��� ������ �Է¹ޱ� ���ؼ� ArrayList<> ���
	ArrayList<GradeInput> grades = new ArrayList<GradeInput>();	
	Scanner input;
	GradeManager(Scanner input){
		this.input = input;
	}

	public void addGrade() {
		int kind = 0;
		GradeInput gradeInput;
		while (kind != 1 && kind != 2 && kind != 3) {
			System.out.println("Select Student Kind: ");
			System.out.println("1. For University");
			System.out.println("2. For High School");
			System.out.println("3. For Middle School");
			System.out.print("Select num for Student Kind between 1 ~ 3: ");
			kind = input.nextInt();
			if (kind == 1) {	//kind�� 1�̸� Grade Class ���
				gradeInput = new UniversityGrade(StudentKind.University);
				gradeInput.getUserInput(input);
				grades.add(gradeInput);
				break;
			}
			else if (kind == 2) {	//kind�� 2�� HighSchoolGrade Class ���
				gradeInput = new HighSchoolGrade(StudentKind.HighSchool);
				gradeInput.getUserInput(input);
				grades.add(gradeInput);
				break;
			}
			else if (kind == 3) {
				gradeInput = new MiddleSchoolGrade(StudentKind.MiddleSchool);
				gradeInput.getUserInput(input);
				grades.add(gradeInput);
				break;
			}
			else {
				System.out.print("Select num for Student Kind between 1 ~ 3: ");
			}
		}
	}

	public void deleteGrade() {
		System.out.print("Student ID(U - �й�, H,M - �ݹ�ȣ): ");
		int studentId = input.nextInt();
		int index = -1;
		//�Է��� �й��� ã�� ���� ������.
		for (int i = 0; i < grades.size(); i ++) {
			if (grades.get(i).getId() == studentId) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			grades.remove(index);	//����
			System.out.println("The Student(" + studentId + ") is deleted.");
		}
		else {
			System.out.println("The student has not been registered");
			return;
		}	
	}


	public void editGrade() {
		System.out.print("Student ID(U - �й�, H - �ݹ�ȣ, M - Can't Edit -> Exit Please): ");
		int studentId = input.nextInt();
		for (int i =0; i<grades.size(); i++) {
			GradeInput gradeinput = grades.get(i);
			if (gradeinput.getId() == studentId) {
				int num = -1;
				while (num != 5) {
					System.out.println("** Grade Info Edit Menu **");
					System.out.println("1. Edit Id(U - �й�, H - �ݹ�ȣ)");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Final Goal Grade");
					System.out.println("4. Edit Grade");
					System.out.println("5. Exit");
					System.out.print("Select one number between 1-5: ");
					num = input.nextInt();
					if (num == 1) {
						//num�� 1�϶� Id�� �Է¹޾� �����ϴ� �ڵ�
						System.out.print("Change Student ID: ");
						int id = input.nextInt();
						gradeinput.setId(id);
					}
					else if (num == 2) {
						//num�� 2�϶� name�� �Է¹޾� �����ϴ� �ڵ�
						System.out.print("Student Name: ");
						String name = input.nextLine();
						gradeinput.setName(name);
					}
					else if (num == 3) {
						//num�� 3�϶� Final Goal�� �Է¹޾� �����ϴ� �ڵ�
						System.out.print("Final Goal Grade: ");
						Double finalgoal = input.nextDouble();
						gradeinput.setFinalgoal(finalgoal);
					}
					else if (num == 4) {
						//num�� 4�϶� Grade�� �Է¹޾� �����ϴ� �ڵ�
						System.out.print("Please enter Grade and Semester(ex - 1.2): ");
						Scanner sc = new Scanner(System.in);
						Double a = sc.nextDouble();
						//�Է¹��� ���� �ԷµǾ� �ִ� �г� �б⸦ ���Ͽ��� ������ if������ ����
						if (a == gradeinput.getGraSem()) {
							System.out.print("Grade: ");
							String grade1 = input.next();
							gradeinput.setGrade(grade1);
						}
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}


	public void viewGrades() {
		System.out.println("# of registered students: " + grades.size());
		for (int i = 0; i < grades.size(); i ++) {
			grades.get(i).printInfo();
		}
	}
}
