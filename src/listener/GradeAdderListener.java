package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.FormatException;
import manager.GradeInput;
import manager.GradeManager;
import manager.StudentKind;
import manager.UniversityGrade;

public class GradeAdderListener implements ActionListener{
	JTextField fieldID; 
	JTextField fieldName;
	JTextField fieldFinalGoal;
	JTextField fieldGradeAndSemester;
	JTextField fieldGrade;
	GradeManager gradeManager;

	//생성자로 값을 필드 5개의 값을 가져옴
	public GradeAdderListener
	(JTextField fieldID, JTextField fieldName, JTextField fieldFinalGoal, 
			JTextField fieldGradeAndSemester, JTextField fieldGrade, GradeManager gradeManager) {
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldFinalGoal = fieldFinalGoal;
		this.fieldGradeAndSemester = fieldGradeAndSemester;
		this.fieldGrade = fieldGrade;
		this.gradeManager = gradeManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		GradeInput grade = new UniversityGrade(StudentKind.University);
		try {
			grade.setId(Integer.parseInt(fieldID.getText()));
			grade.setName(fieldName.getText());
			grade.setFinalgoal(Double.parseDouble(fieldFinalGoal.getText()));
			grade.setGraSem(Double.parseDouble(fieldGradeAndSemester.getText()));
			grade.setGrade(fieldGrade.getText());
			gradeManager.addGrade(grade);
			putObject(gradeManager, "grademanager.ser");
			grade.printInfo();
		} catch (FormatException e1) {
			e1.printStackTrace();
		}

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
