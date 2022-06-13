package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.GradeAdder;
import GUI.WindowFrame;

public class GradeAdderCancelListener implements ActionListener{

	WindowFrame frame;

	public GradeAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//		JButton b = (JButton) e.getSource();
		//		GradeAdder adder = frame.getGradeadder();
		//		frame.setupPanel(adder);
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}

}
