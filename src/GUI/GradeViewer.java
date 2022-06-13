package GUI;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.GradeInput;
import manager.GradeManager;

public class GradeViewer extends JPanel{

	WindowFrame frame;

	GradeManager gradeManager;

	public GradeManager getGradeManager() {
		return gradeManager;
	}

	public void setGradeManager(GradeManager gradeManager) {
		this.gradeManager = gradeManager;
		this.removeAll();

		DefaultTableModel model = new DefaultTableModel();
		//model에 들어갈 내용 추가
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Final Goal");
		model.addColumn("Grade And Semester");
		model.addColumn("Grade");

		for(int i = 0 ; i < gradeManager.size(); i++) {
			Vector row = new Vector();
			GradeInput gi = gradeManager.get(i);
			//row에 내용 추가
			row.add(gi.getId());
			row.add(gi.getName());
			row.add(gi.getFinalgoal());
			row.add(gi.getGraSem());
			row.add(gi.getGrade());
			//model에 row를 추가
			model.addRow(row);
		}
		//table에 model추가
		JTable table = new JTable(model);
		//scrollpane에 table 추가
		JScrollPane sp = new JScrollPane(table);

		//frame에 scrollpane 추가
		this.add(sp);
	}

	public GradeViewer(WindowFrame frame, GradeManager gradeManager) {
		this.frame = frame;
		this.gradeManager = gradeManager;

		//추기되어 있는 사람 수 출력
		System.out.println("***" + gradeManager.size() + "***");

		//위 주석과 동일한 내용
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Final Goal");
		model.addColumn("Grade And Semester");
		model.addColumn("Grade");

		for(int i = 0 ; i < gradeManager.size(); i++) {
			Vector row = new Vector();
			GradeInput gi = gradeManager.get(i);
			row.add(gi.getId());
			row.add(gi.getName());
			row.add(gi.getFinalgoal());
			row.add(gi.getGraSem());
			row.add(gi.getGrade());
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}
}
