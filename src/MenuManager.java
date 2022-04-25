import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GradeManager gradeManager = new GradeManager(input);

		int num = 0;
		while(num != 5) {
			System.out.println("*** Grade Management System Menu ***");
			System.out.println("1. Add Grade");
			System.out.println("2. Delete Grade");
			System.out.println("3. Edit Grade");
			System.out.println("4. View Grades");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1 ~ 5: ");
			num = input.nextInt();
			if (num == 1) {
				gradeManager.addGrade();
			}
			else if (num == 2) {
				gradeManager.deleteGrade();
			}
			else if (num == 3) {
				gradeManager.editGrade();
			}
			else if (num == 4) {
				gradeManager.viewGrades();
			}
			else  {
				continue;
			}
		}
	}

}
