package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import manager.GradeManager;


public class ButtonDeleteListener implements ActionListener{
	GradeManager gradeManager;
	public ButtonDeleteListener(GradeManager gradeManager) {
		this.gradeManager = gradeManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		putObject(gradeManager, "grademanager.ser");
		gradeManager.removeArray();
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


