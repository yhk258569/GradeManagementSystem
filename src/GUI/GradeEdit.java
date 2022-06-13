package GUI;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import manager.GradeManager;

public class GradeEdit extends JPanel{
	WindowFrame frame;
	GradeManager gradeManager;

	public GradeEdit(WindowFrame frame, GradeManager gradeManager) {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel label = new JLabel("Coming Soon");
		label.setSize(100,100);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
}
