package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import GUI.GradeViewer;
import GUI.WindowFrame;
import manager.GradeManager;

public class ButtonViewerListener implements ActionListener{

	WindowFrame frame;

	public ButtonViewerListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		JButton b = (JButton) e.getSource();
//		GradeViewer viewer = frame.getGradeviewer();
//		frame.setupPanel(viewer);
		GradeViewer gradeViewer = frame.getGradeviewer();
		GradeManager gradeManager = getObject("grademanager.ser");
		gradeViewer.setGradeManager(gradeManager);
	
		frame.getContentPane().removeAll();
		frame.getContentPane().add(gradeViewer);
		frame.revalidate();
		frame.repaint();
		
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

}
