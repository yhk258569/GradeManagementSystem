package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.GradeManager;

public class WindowFrame extends JFrame {

	GradeManager gradeManager;
	MenuSelection menuselection;
	GradeAdder gradeadder;
	GradeViewer gradeviewer;
	GradeEdit gradeEdit;



	public WindowFrame(GradeManager gradeManager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("MY FRAME");

		this.gradeManager = gradeManager;
		menuselection = new MenuSelection(this, this.gradeManager);
		gradeadder = new GradeAdder(this, this.gradeManager);
		gradeviewer = new GradeViewer(this, this.gradeManager);
		gradeEdit = new GradeEdit(this, this.gradeManager);


		this.add(menuselection);


		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public GradeAdder getGradeadder() {
		return gradeadder;
	}

	public void setGradeadder(GradeAdder gradeadder) {
		this.gradeadder = gradeadder;
	}

	public GradeViewer getGradeviewer() {
		return gradeviewer;
	}

	public void setGradeviewer(GradeViewer gradeviewer) {
		this.gradeviewer = gradeviewer;
	}


	public GradeEdit getGradeEdit() {
		return gradeEdit;
	}

	public void setGradeEdit(GradeEdit gradeEdit) {
		this.gradeEdit = gradeEdit;
	}

}
