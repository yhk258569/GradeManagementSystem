package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import GUI.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger =new EventLogger("log.txt");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GradeManager gradeManager = getObject("grademanager.ser");
		if (gradeManager == null) {
			gradeManager = new GradeManager(input);
		}

		else {
			gradeManager.input = input;
		}

		WindowFrame frame = new WindowFrame(gradeManager);
		selectMenu(input, gradeManager);
		putObject(gradeManager, "grademanager.ser");

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
					logger.log("add a grade");
					break;
				case 2:
					gradeManager.deleteGrade();
					logger.log("delete a grade");
					break;
				case 3:
					gradeManager.editGrade();
					logger.log("edit a grade");
					break;
				case 4:
					gradeManager.viewGrades();
					logger.log("view a grade");
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


	public static void showMenu() {
		System.out.println("*** Grade Management System Menu ***");
		System.out.println("1. Add Grade");
		System.out.println("2. Delete Grade");
		System.out.println("3. Edit Grade");
		System.out.println("4. View Grades");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 ~ 5: ");
	}

	public static GradeManager getObject(String filename) {
		GradeManager gradeManager = null;


		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			gradeManager = (GradeManager) in.readObject();

			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return gradeManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return gradeManager;
	}

	public static void putObject(GradeManager gradeManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(gradeManager);

			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
