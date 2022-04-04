import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);    //���� �Է¹ޱ� ���� input�� ����
		GradeManager gradeManager = new GradeManager(input);	//GradeManger��� (input)�� parameter�� �޴� Ŭ������ �ν��Ͻ��� gradeManager ����

		int num = 0;	//�ʱ� num�� ���� 0���� ����
		while(num != 5) {    //5���� exit�̱⶧���� num�� 5�� �ƴѵ��� loop����
			System.out.println("*** Grade Management System Menu ***");    //*** Grade Management System Menu *** ���
			System.out.println("1. Add Grades");    //1. Add Grades ���
			System.out.println("2. Delete Grades");    //2. Delete Grades ���
			System.out.println("3. Edit Grades");    //3. Edit Grades ���
			System.out.println("4. View Grades");    //4. View Grades ���
			System.out.println("5. Exit");    //5. Exit ���
			System.out.print("Select one number between 1 ~ 5: ");    //1~5���� ��ȣ�� �����϶�� ���� ���
			num = input.nextInt();    //���ڸ� �Է¹޾� num�� ����
			if (num == 1) {
				gradeManager.addGrades();    //num�� 1�ϋ� �ν��Ͻ� gradeManager�� addGrades()��� methods ����
			}
			else if (num == 2) {
				gradeManager.deleteGrades();    //num�� 2�ϋ� �ν��Ͻ� gradeManager�� deleteGrades()��� methods ����
			}
			else if (num == 3) {
				gradeManager.editGrades();    //num�� 3�ϋ� �ν��Ͻ� gradeManager�� editGrades()��� methods ����
			}
			else if (num == 4) {
				gradeManager.viewGrades();    //num�� 4�ϋ� �ν��Ͻ� gradeManager�� viewGrades()��� methods ����
			}
			else  {
				continue;  //�ٸ� ��ȣ�� ������ loop�� �ٽ� ����(5�� ������ �Լ��� ������ �Ǿ��ֱ� ������)
			}
		}
	}

}
