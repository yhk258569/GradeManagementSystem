import java.util.ArrayList;
import java.util.Scanner;

public class GradeManager {
	//�� �л��� �ƴ� �����л��� ������ �Է¹ޱ� ���ؼ� ArrayList<> ���
	ArrayList<Grade> grades = new ArrayList<Grade>();	
	Scanner input;
	GradeManager(Scanner input){
		this.input = input;
	}

	public void addGrade() {
		int kind = 0;
		Grade grade;
		while (kind != 1 && kind != 2) {
			System.out.println("Select Student Kind: ");
			System.out.println("1. For University");
			System.out.println("2. For High School");
			System.out.print("Select num for Student Kind between 1 and 2: ");
			kind = input.nextInt();
			if (kind == 1) {	//kind�� 1�̸� Grade Class ���
				grade = new Grade();
				grade.getUserInput(input);
				grades.add(grade);
				break;
			}
			else if (kind == 2) {	//kind�� 2�� HighSchoolGrade Class ���
				grade = new HighSchoolGrade();
				grade.getUserInput(input);
				grades.add(grade);
				break;
			}
			else {
				System.out.print("Select num for Student Kind between 1 and 2: ");
			}
		}
	}

	public void deleteGrade() {
		System.out.print("Student ID(U - �й�, H - �ݹ�ȣ): ");
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
		System.out.print("Student ID(U - �й�, H - �ݹ�ȣ): ");
		int studentId = input.nextInt();
		for (int i =0; i<grades.size(); i++) {
			Grade grade = grades.get(i);
			if (grade.getId() == studentId) {
				int num = -1;
				while (num != 5) {
					System.out.println("** Grade Info Endit Menu **");
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
						grade.setId(id);
					}
					else if (num == 2) {
						//num�� 2�϶� name�� �Է¹޾� �����ϴ� �ڵ�
						System.out.print("Student Name: ");
						String name = input.nextLine();
						grade.setName(name);
					}
					else if (num == 3) {
						//num�� 3�϶� Final Goal�� �Է¹޾� �����ϴ� �ڵ�
						System.out.print("Final Goal Grade: ");
						Double finalgoal = input.nextDouble();
						grade.setFinalgoal(finalgoal);
					}
					else if (num == 4) {
						//num�� 4�϶� Grade�� �Է¹޾� �����ϴ� �ڵ�
						System.out.print("Please enter Grade and Semester(ex - 1.2): ");
						Scanner sc = new Scanner(System.in);
						Double a = sc.nextDouble();
						//�Է¹��� ���� �ԷµǾ� �ִ� �г� �б⸦ ���Ͽ��� ������ if������ ����
						if (a == grade.graSem) {
							System.out.print("Grade: ");
							String grade1 = input.next();
							grade.setGrade(grade1);
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
