import java.util.Scanner;

public class Grade {
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
	public void setName(String name) {
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

	//값을 입력받아서 setting(이름, 학번, 성적 등) 해주는 getUserInput 메소드 생성
	public void getUserInput(Scanner input) {
		System.out.print("Student ID(학번): ");
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
}
