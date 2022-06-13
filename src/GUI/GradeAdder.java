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

	//생성자 
	public GradeAdder(WindowFrame frame, GradeManager gradeManager){
		this.frame = frame;
		this.gradeManager = gradeManager;

		JPanel panel = new JPanel();
		//panel의 레이아웃으로 SpringLayout을 설정
		panel.setLayout(new SpringLayout());

		//ID를 입력 받는 칸 생성
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		//panel에 추가
		panel.add(labelID);
		panel.add(fieldID);

		//이름을 입력 받는 칸 생성
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		//panel에 추가
		panel.add(labelName);
		panel.add(fieldName);

		//최종 목표 성적을 입력 받는 칸 생성
		JLabel labelFinalGoal = new JLabel("Final Goal: ", JLabel.TRAILING);
		JTextField fieldFinalGoal = new JTextField(10);
		labelName.setLabelFor(fieldFinalGoal);
		//panel에 추가
		panel.add(labelFinalGoal);
		panel.add(fieldFinalGoal);

		//학년 학기를 입력받는 칸 생성
		JLabel labelGradeAndSemester = new JLabel("Grade And Semester: ", JLabel.TRAILING);
		JTextField fieldGradeAndSemester = new JTextField(10);
		labelGradeAndSemester.setLabelFor(fieldGradeAndSemester);
		//panel에 추가
		panel.add(labelGradeAndSemester);
		panel.add(fieldGradeAndSemester);

		//성적을 입력받는 칸 생성
		JLabel labelGrade = new JLabel("Grade : ", JLabel.TRAILING);
		JTextField fieldGrade  = new JTextField(10);
		labelGrade .setLabelFor(fieldGrade);
		//panel에 추가
		panel.add(labelGrade);
		panel.add(fieldGrade);

		//save 버튼과 cancel 버튼을 만들어줌
		JButton saveButton =new JButton("Save");
		//save 버튼과 cancel 버튼ㄴ에 ActionListener 추가
		saveButton.addActionListener(new GradeAdderListener(fieldID, fieldName, fieldFinalGoal, fieldGradeAndSemester, fieldGrade, gradeManager));
		JButton cancelButton =new JButton("Cancel");
		cancelButton.addActionListener(new GradeAdderCancelListener(frame));

		//패널에 버튼 추가
		panel.add(saveButton);
		panel.add(cancelButton);


		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);

		this.add(panel);
		//창이 보이도록 설정
		this.setVisible(true);
	}
}
