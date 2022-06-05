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
	
	public GradeViewer(WindowFrame frame, GradeManager gradeManager) {
		this.frame = frame;
		this.gradeManager = gradeManager;
		
		System.out.println("***" + gradeManager.size() + "***");
		
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
