import java.util.ArrayList;
import java.util.Scanner;

public class GradeManager {
	//한 학생이 아닌 여러학생의 정보를 입력받기 위해서 ArrayList<> 사용
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
			if (kind == 1) {	//kind가 1이면 Grade Class 사용
				grade = new Grade();
				grade.getUserInput(input);
				grades.add(grade);
				break;
			}
			else if (kind == 2) {	//kind가 2면 HighSchoolGrade Class 사용
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
		System.out.print("Student ID(U - 학번, H - 반번호): ");
		int studentId = input.nextInt();
		int index = -1;
		//입력한 학번을 찾는 것을 구현함.
		for (int i = 0; i < grades.size(); i ++) {
			if (grades.get(i).getId() == studentId) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			grades.remove(index);	//삭제
			System.out.println("The Student(" + studentId + ") is deleted.");
		}
		else {
			System.out.println("The student has not been registered");
			return;
		}	
	}


	public void editGrade() {
		System.out.print("Student ID(U - 학번, H - 반번호): ");
		int studentId = input.nextInt();
		for (int i =0; i<grades.size(); i++) {
			Grade grade = grades.get(i);
			if (grade.getId() == studentId) {
				int num = -1;
				while (num != 5) {
					System.out.println("** Grade Info Endit Menu **");
					System.out.println("1. Edit Id(U - 학번, H - 반번호)");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Final Goal Grade");
					System.out.println("4. Edit Grade");
					System.out.println("5. Exit");
					System.out.print("Select one number between 1-5: ");
					num = input.nextInt();
					if (num == 1) {
						//num이 1일때 Id를 입력받아 수정하는 코드
						System.out.print("Change Student ID: ");
						int id = input.nextInt();
						grade.setId(id);
					}
					else if (num == 2) {
						//num이 2일때 name을 입력받아 수정하는 코드
						System.out.print("Student Name: ");
						String name = input.nextLine();
						grade.setName(name);
					}
					else if (num == 3) {
						//num이 3일때 Final Goal을 입력받아 수정하는 코드
						System.out.print("Final Goal Grade: ");
						Double finalgoal = input.nextDouble();
						grade.setFinalgoal(finalgoal);
					}
					else if (num == 4) {
						//num이 4일때 Grade를 입력받아 수정하는 코드
						System.out.print("Please enter Grade and Semester(ex - 1.2): ");
						Scanner sc = new Scanner(System.in);
						Double a = sc.nextDouble();
						//입력받은 값과 입력되어 있는 학년 학기를 비교하여서 같으면 if문장을 실행
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
