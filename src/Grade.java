import java.util.Scanner;

public abstract class Grade {
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

	//get,set 五社球 持失
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

	public abstract void printInfo();

}
