import java.util.Scanner;

public class GradeManager {	//GradeManager��� Ŭ���� ����(Grade�� ���õ� �κ��� ���� �����ϱ� ���ؼ�)
	Grade grade = new Grade();	//Grade Ŭ������ ���� ���� grade��� �ν��Ͻ� ����
	Scanner input;	//��ĳ�� input ����
	GradeManager(Scanner input){
		this.input = input;	//�ν��Ͻ��� �����Ҷ� GradeManager(�Է°�)�ϸ� �� �ν��Ͻ��� input�� (�Է°�)�� �����
	}

	public void addGrades() {	//addGrades()��� method grade��� �ν��Ͻ��� ���� Ŭ���� Grade�� ����
		System.out.print("Student ID: ");    //�й��� �Է��϶�� ���� ���
		grade.id = input.nextInt();    //�й��� �Է¹޾� Grade Ŭ������ id�� ����
		System.out.print("Student Name: ");    //�̸��� �Է��϶�� ���� ���
		grade.name = input.next();    //�̸��� �Է¹޾� Grade Ŭ������ name���� ����
		System.out.print("Final Goal Grade(ex - 4.2): ");    //������ǥ ������ �Է��϶�� ���� ���    
		grade.finalgoal = input.nextDouble();    //��ǥ�� �Է¹޾� Grade Ŭ������ finalgoal�� ����
		//������ ����ؼ� ������ �� �÷��� �Ѵٸ� �˷��ֱ� ���� ����� ��ȹ�ϰ� �ֽ��ϴ�.
		System.out.print("Grade and Semester(ex- 1Grade 2Semester is 1.2): ");    //�г�� �б⸦ �Է��϶�� ���� ���
		grade.graSem = input.nextDouble();    //�г��б⸦ �Է¹޾� GradeŬ������ graSem�� ����
		System.out.print("Grade(ex - ABACABF): ");    //������ �Է��϶�� ���� ���(+�� 0���� ���ĺ����θ� �Է¹޾� �հ輺���� ������ �����Դϴ�.)
		grade.grade = input.next();    //������ �Է¹޾� GradeŬ������ grade�� ����
		//�Է� ���� ABCAA�� �� ���� ���, ���� ��ǥ �������� �󸶰� ���Ҵٴ� �� ���� �߰��� �����Դϴ�.
	}
	
	//���� if�� �ʹ� ���� �ݺ��Ǵ� ������ �ִµ� �� �κ��� �Ŀ� ���ļ� �� �� ������ �ڵ带 ���鵵�� �ϰڽ��ϴ�.
	
	public void deleteGrades() {    //�л��� �й��� �г�, �б⸦ �Է¹޾� ������ ����� method
		System.out.print("Student ID: ");	//�й��� �Է��϶�� ���� ���
		int studentId = input.nextInt();	//����ڿ��� �й��� �Է¹޾� studentId�� ����
		if (grade.id != studentId) {	//����ڰ� add�س��Ҵ� �й��� ��� �Է��� �й��� ������ �˾ƺ��� ���� ������ �Ʒ� ���� ����ϰ� return
			System.out.println("The Student's grade has not been registered.");
			return;
		}	//������ �״�� ����
		System.out.print("Grade and semester: ");	//�г�� �б⸦ �Է��϶�� ���� ���
		Double gradeSemester = input.nextDouble();	//����ڿ��� �Է¹޾� gradeSemester�� ����
		if (grade.graSem != gradeSemester) {	//����ڰ� add�س��Ҵ� �г��б�� ��� �Է��� �г��бⰡ ������ �˾ƺ��� ���� ������ �Ʒ� ���� ����ϰ� return
			System.out.println("There are no grades for that school year.");
			return;
		}	//������ �״�� ����
		if (grade.id == studentId && grade.graSem == gradeSemester) {	//�й��� �г��бⰡ ��� ������ grade�� null���� �����ν� delete ����� �����ϰ� �װ��� �˷��ִ� ���� ���
			grade = null;
			System.out.println("The Student's " + gradeSemester + " grade is deleted.");
		}
	}
	
	public void editGrades() {    //�л��� �й��� �г�, �б⸦ �Է¹޾� ������ �����ϴ� method
		System.out.print("Student ID: ");	//�й��� �Է��϶�� ���� ���
		int studentId = input.nextInt();	//����ڿ��� �й��� �Է¹޾� studentId�� ����
		if (grade.id != studentId) {	//����ڰ� add�س��Ҵ� �й��� ��� �Է��� �й��� ������ �˾ƺ��� ���� ������ �Ʒ� ���� ����ϰ� return
			System.out.println("The Student's grade has not been registered.");
			return;
		}	//������ �״�� ����
		System.out.print("Grade and semester: ");	//�г�� �б⸦ �Է��϶�� ���� ���
		Double gradeSemester = input.nextDouble();	//����ڿ��� �Է¹޾� gradeSemester�� ����
		if (grade.graSem != gradeSemester) {	//����ڰ� add�س��Ҵ� �г��б�� ��� �Է��� �г��бⰡ ������ �˾ƺ��� ���� ������ �Ʒ� ���� ����ϰ� return
			System.out.println("There are no grades for that school year.");
			return;
		}	//������ �״�� ����
		//�й� �г��бⰡ ��� ������ edit�� ���� ���ڿ��� �Է��϶�� ���� ��� �� �װ��� GradeŬ������ ������ �� �Ʒ� ���� ���
		if (grade.id == studentId && grade.graSem == gradeSemester) {
			System.out.print("Please Enter edit grade(ex: ABAAC): ");
			grade.grade = input.next();
			System.out.println("The Student's grade (ID: " + studentId + ") is edited");
		}
	}
	
	public void viewGrades() {    //�л��� �й��� �Է¹޾� �Է��� ������ �����ִ� method
		System.out.print("Student ID: ");	//�й��� �Է��϶�� ���� ���
		int studentId = input.nextInt();	//����ڿ��� �й��� �Է¹޾� studentId�� ����
		if (grade.id == studentId) {	//����ڰ� add�س��Ҵ� �й��� ��� �Է��� �й��� ������ �˾ƺ��� ������ GradeŬ������ printInfo method ����
			grade.printInfo();
		}
	}
}
