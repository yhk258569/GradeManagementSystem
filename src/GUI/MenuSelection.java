package GUI;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.ButtonAdderListener;
import listener.ButtonDeleteListener;
import listener.ButtonEditListener;
import listener.ButtonExitListener;
import listener.ButtonViewerListener;
import manager.GradeInput;
import manager.GradeManager;

public class MenuSelection extends JPanel{
	GradeManager gradeManager;
	WindowFrame frame;

	public MenuSelection(WindowFrame frame, GradeManager gradeManager) {
		this.frame = frame;
		this.gradeManager =gradeManager;

		this.setLayout(new BorderLayout());

		//��ư �г� ���̺��� ����
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");

		JButton button1 = new JButton("Add Grade");
		JButton button2 = new JButton("Delete Grade");
		JButton button3 = new JButton("Edit Grade");
		JButton button4 = new JButton("View Grade");
		JButton button5 = new JButton("Exit Program");

		//��ư�� ActionListener�� �߰�
		button2.addActionListener(new ButtonDeleteListener(gradeManager));
		button4.addActionListener(new ButtonViewerListener(frame));
		button1.addActionListener(new ButtonAdderListener(frame));
		button5.addActionListener(new ButtonExitListener());
		button3.addActionListener(new ButtonEditListener(frame));

		//������ �гο� �߰�
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		panel1.add(button5);
		panel2.add(label);

		//�г��� �����ӿ� �߰�
		this.add(panel2, BorderLayout.NORTH);
		this.add(panel1, BorderLayout.CENTER);

	}
}
