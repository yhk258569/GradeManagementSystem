package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.GradeViewer;
import GUI.WindowFrame;

public class ButtonViewListener implements ActionListener{

	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		GradeViewer viewer = frame.getGradeviewer();
		frame.setupPanel(viewer);
	}

}
