
public class Grade {	//������ �Է��Ҷ� ���� ���� Grade��� Ŭ������ field�� �Է�
	String name;	//�̸�
	int id;		//�й�
	double finalgoal;	//������ǥ
	double graSem;	//�г� �б�
	String grade;	//����

	public Grade() {

	}

	public Grade(String name, int id, double finalgoal, double graSem, String grade) {
		/*�ν��Ͻ��� �����ҋ� (String name, int id, double finalgoal, double graSem, String grade) �� �Է��ϸ�
		�����ϸ鼭 �ٷ� �� ������ �ν��Ͻ��� name, id, finalgoal, graSem, grade�� ����*/
		this.name = name;
		this.id = id;
		this.finalgoal = finalgoal;
		this.graSem = graSem;
		this.grade = grade;
	}
	public void printInfo() {	//�Է��� ���� �ٽ� ����ؼ� �����ִ� method ����
		System.out.println("Name: "+ name + " Id: " + id +" FinalGoal: "+ finalgoal + " GradeAndSemester: " + graSem + " Grade: " + grade);
	}
}
