package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5414083620850276034L;
	ArrayList<GradeInput> grades = new ArrayList<GradeInput>();	
	transient Scanner input;
	GradeManager(Scanner input){
		this.input = input;
	}

	public void removeArray() {
		int i = grades.size()-1;
		while(i >= 0) {
			grades.remove(i);
			i--;
		}
	}

	public void setScanner(Scanner input) {
		this.input = input;
	}

	public void addGrade(String id, String name, 
			String finalGoal, String gradeAndSemester, String grade) {
		GradeInput gradeInput = new UniversityGrade(StudentKind.University);
		gradeInput.getUserInput(input);
		grades.add(gradeInput);
	}

	public void addGrade(GradeInput gradeInput) {
		grades.add(gradeInput);
	}




	public void addGrade() {
		int kind = 0;
		GradeInput gradeInput;
		while (kind != 1 && kind != 2 && kind != 3) {
			try {
				System.out.println("Select Student Kind: ");
				System.out.println("1. For University");
				System.out.println("2. For High School");
				System.out.println("3. For Middle School");
				System.out.print("Select num for Student Kind between 1 ~ 3: ");
				kind = input.nextInt();
				if (kind == 1) {
					gradeInput = new UniversityGrade(StudentKind.University);
					gradeInput.getUserInput(input);
					grades.add(gradeInput);
					break;
				}
				else if (kind == 2) {
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
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}

	public void deleteGrade() {
		System.out.print("Student ID(U - 학번, H,M - 반번호): ");
		int studentId = input.nextInt();
		int index = findIndex(studentId);
		removefromGrades(index, studentId);
	}

	public int findIndex(int studentId) {
		int index = -1;
		for (int i = 0; i < grades.size(); i++) {
			if (grades.get(i).getId() == studentId) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromGrades(int index, int studentId) {
		if (index >= 0) {
			grades.remove(index);
			System.out.println("The Student(" + studentId + ") is deleted.");
			return 1;
		}
		else {
			System.out.println("The student has not been registered");
			return -1;
		}

	}

	public void editGrade() {
		System.out.print("Student ID(U - 학번, H - 반번호, M - Can't Edit -> Exit Please): ");
		int studentId = input.nextInt();
		for (int i = 0; i<grades.size(); i++) {
			GradeInput grade = grades.get(i);
			if (grade.getId() == studentId) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						grade.setStudentID(input);
						break;
					case 2:
						grade.setStudentName(input);
						break;
					case 3:
						grade.setStudenFinalGoal(input);
						break;
					case 4:
						grade.setStudentGrade(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}


	public void viewGrades() {
		System.out.println("# of registered students: " + grades.size());
		for (int i = 0; i < grades.size(); i++) {
			grades.get(i).printInfo();
		}
	}

	public int size() {
		return grades.size();
	}

	public GradeInput get(int index) {
		return (Grade) grades.get(index);
	}

	public void showEditMenu() {
		System.out.println("** Grade Info Edit Menu **");
		System.out.println("1. Edit Id(U - 학번, H - 반번호)");
		System.out.println("2. Edit Name");
		System.out.println("3. Edit Final Goal Grade");
		System.out.println("4. Edit Grade");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1-5: ");
	}


}
