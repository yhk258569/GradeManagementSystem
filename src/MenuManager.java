import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 5;    //ó�� ���������� �޴��� ������� �ϹǷ� num�� 5�� �����ϰ� ����
		Scanner input = new Scanner(System.in);    //���� �Է¹ޱ� ���� input�� ����
		
		while(num < 6) {    //6���� exit�̱⶧���� num�� 6���� ���� ���� loop�� ����
			System.out.println("*** Grade Management System Menu ***");    //*** Grade Management System Menu *** ���
			System.out.println("1. Add Grades");    //1. Add Grades ���
			System.out.println("2. Delete Grades");    //2. Delete Grades ���
			System.out.println("3. Edit Grades");    //3. Edit Grades ���
			System.out.println("4. View Grades");    //4. View Grades ���
			System.out.println("5. Show a menu");    //5. Show a menu ���
			System.out.println("6. Exit");    //6. Exit ���
			System.out.print("Select one number between 1 ~ 6: ");    //1~6���� ��ȣ�� �����϶�� ���� ���
			num = input.nextInt();    //���ڸ� �Է¹޾� num�� ����
			if (num == 1) {
				addGrades();    //num�� 1�ϋ� addGrades��� �Լ��� �����ϱ� ���� ����
			}
			else if (num == 2) {
				deleteGrades();    //num�� 2�ϋ� deleteGrades��� �Լ��� �����ϱ� ���� ����
			}
			else if (num == 3) {
				editGrades();    //num�� 3�ϋ� editGrades��� �Լ��� �����ϱ� ���� ����
			}
			else if (num == 4) {
				viewGrades();    //num�� 4�ϋ� viewGrades��� �Լ��� �����ϱ� ���� ����
			}
			else  {
				continue;  //�ٸ� ��ȣ�� ������ loop�� �ٽ� ����(6�̻��� ������ �Լ��� ������ �Ǿ��ֱ� ������)
			}
		}
	}
	public static void addGrades() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID: ");    //�й��� �Է��϶�� ���� ���
		int studentId = input.nextInt();    //�й� ���� �Է¹޾� (int)studentid�� ����
		System.out.print("Student Name: ");    //�̸��� �Է��϶�� ���� ���
		String studentName = input.next();    //�̸��� �Է¹޾� (String)studentName�� ����
		System.out.print("Final Goal Grade(ex - 4.2): ");    //������ǥ ������ �Է��϶�� ���� ���    
		double finalgoalgrade = input.nextDouble();    //��ǥ�� �Է¹޾� (Double)finalgrade�� ����
		//������ ����ؼ� ������ �� �÷��� �Ѵٸ� �˷��ֱ� ���� ����� ��ȹ�ϱ� �ֱ⶧���� �� �κ��� �������
		System.out.print("Grade and Semester(ex- 1Grade 2Semester is 1.2): ");    //�г�� �б⸦ �Է��϶�� ���� ���
		double gradeandSemester = input.nextDouble();    //�г��б⸦ �Է¹޾� (Double)grandeandsemester�� ����
		System.out.print("Grade(ex - ABACABF): ");    //������ �Է��϶�� ���� ���(�÷����� 0���� ���ĺ����θ� �Է¹޾� �հ輺���� ������ ����)
		String grade = input.next();    //������ �Է¹޾� (String)grade�� ����
		//�Է� ���� ABCAA�� �� ���� ���, ���� ��ǥ �������� �󸶰� ���Ҵٴ� �� ���� �߰��� ����
		
	}
	public static void deleteGrades() {    //�л��� �й��� �г�, �б⸦ �Է¹޾� ������ ����� �Լ�
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
		System.out.print("Grade and semester: ");
		double gradeandSemester = input.nextDouble();
	}
	public static void editGrades() {    //�л��� �й��� �г�, �б⸦ �Է¹޾� ������ �����ϴ� �Լ�
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
		System.out.print("Grade and semester: ");
		double gradeandSemester = input.nextDouble();
	}
	public static void viewGrades() {    //�л��� �й��� �Է¹޾� �Է��� ������ �����ִ� �Լ�
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
	}
}
