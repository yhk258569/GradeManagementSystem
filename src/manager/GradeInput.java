package manager;
import java.util.Scanner;

import exception.FormatException;

public interface GradeInput {
	public int getId();

	public void setName(String name) throws FormatException;
	
	public String getName();

	public void setId(int id);
	
	public double getFinalgoal();

	public void setFinalgoal(double finalgoal);

	public double getGraSem();
	
	public String getGrade();

	public void setGrade(String grade);

	public void printInfo();

	public void getUserInput(Scanner input);

	public void setStudentID(Scanner input);

	public void setStudentName(Scanner input);

	public void setStudenFinalGoal(Scanner input);

	public void setStudentGrade(Scanner input);
}
