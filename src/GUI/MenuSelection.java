package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.ButtonAddListener;
import listener.ButtonViewListener;

public class MenuSelection extends JPanel{

	WindowFrame frame;

	public MenuSelection(WindowFrame frame) {
		this.frame = frame;

		this.setLayout(new BorderLayout());

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");

		JButton button1 = new JButton("Add Grade");
		JButton button2 = new JButton("Delete Grade");
		JButton button3 = new JButton("Edit Grade");
		JButton button4 = new JButton("View Grade");
		JButton button5 = new JButton("Exit Program");

		button4.addActionListener(new ButtonViewListener(frame));
		button1.addActionListener(new ButtonAddListener(frame));

		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		panel1.add(button5);
		panel2.add(label);

		this.add(panel2, BorderLayout.NORTH);
		this.add(panel1, BorderLayout.CENTER);

	}
}
