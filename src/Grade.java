
import java.io.Serializable;
import java.util.Scanner;

import exception.FormatException;

public abstract class Grade implements GradeInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 238895548803606013L;
	protected StudentKind kind = StudentKind.University;
	protected String name;
	protected int id;
	protected double finalgoal;
	protected double graSem;
	protected String grade;

	public Grade() {

	}

	public Grade(StudentKind kind) {
		this.kind = kind;
	}

	public Grade(String name, int id, double finalgoal, double graSem, String grade) {
		this.name = name;
		this.id = id;
		this.finalgoal = finalgoal;
		this.graSem = graSem;
		this.grade = grade;
	}

	public Grade(StudentKind kind, String name, int id, double finalgoal, double graSem, String grade) {
		this.kind =  kind;
		this.name = name;
		this.id = id;
		this.finalgoal = finalgoal;
		this.graSem = graSem;
		this.grade = grade;
	}

	//get,set 메소드 생성
	public StudentKind getKind() {
		return kind;
	}
	public void setKind(StudentKind kind) {
		this.kind = kind;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) throws FormatException {
		if (!name.contains("!")) {
			throw new FormatException();
		}
		this.name = name;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public double getFinalgoal() {
		return finalgoal;
	}
	public void setFinalgoal(double finalgoal) {
		this.finalgoal = finalgoal;
	}


	public double getGraSem() {
		return graSem;
	}
	public void setGraSem(double graSem) {
		this.graSem = graSem;
	}


	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public abstract void printInfo();

	public void setStudentID(Scanner input) {
		System.out.print("Student ID: ");
		int id = input.nextInt();
		this.setId(id);
	}

	public void setStudentName(Scanner input) {
		String name = "";
		while (!name.contains("!")) {
			System.out.print("Student Name: ");
			name = input.next();
			try {
				this.setName(name);
			} catch (FormatException e) {
				System.out.println("Incorrect Name Format. Put your Name that contains !(ex - name!)");
			}
		}
	}

	public void setStudenFinalGoal(Scanner input) {
		System.out.print("Final Goal Grade: ");
		Double finalgoal = input.nextDouble();
		this.setFinalgoal(finalgoal);
	}

	public void setStudentGrade(Scanner input) {
		System.out.print("Please enter Grade and Semester(ex - 1.2): ");
		Scanner sc = new Scanner(System.in);
		Double a = sc.nextDouble();

		//입력받은 값과 입력되어 있는 학년 학기를 비교하여서 같으면 if문장을 실행
		if (a == this.getGraSem()) {
			System.out.print("Grade: ");
			String grade1 = input.next();
			this.setGrade(grade1);
		}
	}

	public void ssetStudentID(Scanner input) {
		int id = input.nextInt();
		this.setId(id);
	}

	public void ssetStudenFinalGoal(Scanner input) {
		Double finalgoal = input.nextDouble();
		this.setFinalgoal(finalgoal);
	}

	public void ssetStudentGraSem(Scanner input) {
		Double graSem = input.nextDouble();
		this.setGraSem(graSem);
	}

	public void ssetStudentGrade(Scanner input) {
		String grade1 = input.next();
		this.setGrade(grade1);
	}

	public String getKindString() {
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
		return skind;
	}

}
