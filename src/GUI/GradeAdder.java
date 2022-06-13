package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.GradeAdderCancelListener;
import listener.GradeAdderListener;
import manager.GradeManager;

public class GradeAdder extends JPanel{

	WindowFrame frame;

	GradeManager gradeManager;

	//������ 
	public GradeAdder(WindowFrame frame, GradeManager gradeManager){
		this.frame = frame;
		this.gradeManager = gradeManager;

		JPanel panel = new JPanel();
		//panel�� ���̾ƿ����� SpringLayout�� ����
		panel.setLayout(new SpringLayout());

		//ID�� �Է� �޴� ĭ ����
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		//panel�� �߰�
		panel.add(labelID);
		panel.add(fieldID);

		//�̸��� �Է� �޴� ĭ ����
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		//panel�� �߰�
		panel.add(labelName);
		panel.add(fieldName);

		//���� ��ǥ ������ �Է� �޴� ĭ ����
		JLabel labelFinalGoal = new JLabel("Final Goal: ", JLabel.TRAILING);
		JTextField fieldFinalGoal = new JTextField(10);
		labelName.setLabelFor(fieldFinalGoal);
		//panel�� �߰�
		panel.add(labelFinalGoal);
		panel.add(fieldFinalGoal);

		//�г� �б⸦ �Է¹޴� ĭ ����
		JLabel labelGradeAndSemester = new JLabel("Grade And Semester: ", JLabel.TRAILING);
		JTextField fieldGradeAndSemester = new JTextField(10);
		labelGradeAndSemester.setLabelFor(fieldGradeAndSemester);
		//panel�� �߰�
		panel.add(labelGradeAndSemester);
		panel.add(fieldGradeAndSemester);

		//������ �Է¹޴� ĭ ����
		JLabel labelGrade = new JLabel("Grade : ", JLabel.TRAILING);
		JTextField fieldGrade  = new JTextField(10);
		labelGrade .setLabelFor(fieldGrade);
		//panel�� �߰�
		panel.add(labelGrade);
		panel.add(fieldGrade);

		//save ��ư�� cancel ��ư�� �������
		JButton saveButton =new JButton("Save");
		//save ��ư�� cancel ��ư���� ActionListener �߰�
		saveButton.addActionListener(new GradeAdderListener(fieldID, fieldName, fieldFinalGoal, fieldGradeAndSemester, fieldGrade, gradeManager));
		JButton cancelButton =new JButton("Cancel");
		cancelButton.addActionListener(new GradeAdderCancelListener(frame));

		//�гο� ��ư �߰�
		panel.add(saveButton);
		panel.add(cancelButton);


		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);

		this.add(panel);
		//â�� ���̵��� ����
		this.setVisible(true);
	}
}
