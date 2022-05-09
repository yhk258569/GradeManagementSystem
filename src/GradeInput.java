import java.util.Scanner;

public interface GradeInput {
	public int getId();

	public void setName(String name);

	public void setId(int id);

	public void setFinalgoal(double finalgoal);

	public double getGraSem();

	public void setGrade(String grade);

	public void printInfo();

	public void getUserInput(Scanner input);
}
