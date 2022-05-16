import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GradeManager gradeManager = new GradeManager(input);

		selectMenu(input, gradeManager);

	}

	public static void selectMenu(Scanner input, GradeManager gradeManager) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu();
				num = input.nextInt();

				switch(num) {
				case 1:
					gradeManager.addGrade();
					break;
				case 2:
					gradeManager.deleteGrade();
					break;
				case 3:
					gradeManager.editGrade();
					break;
				case 4:
					gradeManager.viewGrades();
					break;
				default:
					continue;

				}
			}
			catch(InputMismatchException e){
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	// if - else 문을 catch문으로 바꿈 + showMenu라는 메소드를 정의해서 사용

	public static void showMenu() {
		System.out.println("*** Grade Management System Menu ***");
		System.out.println("1. Add Grade");
		System.out.println("2. Delete Grade");
		System.out.println("3. Edit Grade");
		System.out.println("4. View Grades");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 ~ 5: ");
	}
}
