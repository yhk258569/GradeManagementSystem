import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 5;    //처음 실행했을때 메뉴를 보여줘야 하므로 num을 5로 설정하고 시작
		Scanner input = new Scanner(System.in);    //값을 입력받기 위해 input을 생성
		
		while(num < 6) {    //6번이 exit이기때문에 num이 6보다 작은 동안 loop를 실행
			System.out.println("*** Grade Management System Menu ***");    //*** Grade Management System Menu *** 출력
			System.out.println("1. Add Grades");    //1. Add Grades 출력
			System.out.println("2. Delete Grades");    //2. Delete Grades 출력
			System.out.println("3. Edit Grades");    //3. Edit Grades 출력
			System.out.println("4. View Grades");    //4. View Grades 출력
			System.out.println("5. Show a menu");    //5. Show a menu 출력
			System.out.println("6. Exit");    //6. Exit 출력
			System.out.print("Select one number between 1 ~ 6: ");    //1~6번중 번호를 선택하라는 문장 출력
			num = input.nextInt();    //숫자를 입력받아 num에 저장
			if (num == 1) {
				addGrades();    //num이 1일떄 addGrades라는 함수를 실행하기 위해 정의
			}
			else if (num == 2) {
				deleteGrades();    //num이 2일떄 deleteGrades라는 함수를 실행하기 위해 정의
			}
			else if (num == 3) {
				editGrades();    //num이 3일떄 editGrades라는 함수를 실행하기 위해 정의
			}
			else if (num == 4) {
				viewGrades();    //num이 4일떄 viewGrades라는 함수를 실행하기 위해 정의
			}
			else  {
				continue;  //다른 번호가 나오면 loop를 다시 진행(6이상이 나오면 함수는 끝나게 되어있기 때문에)
			}
		}
	}
	public static void addGrades() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID: ");    //학번을 입력하라는 문장 출력
		int studentId = input.nextInt();    //학번 값을 입력받아 (int)studentid로 저장
		System.out.print("Student Name: ");    //이름을 입력하라는 문장 출력
		String studentName = input.next();    //이름을 입력받아 (String)studentName로 저장
		System.out.print("Final Goal Grade(ex - 4.2): ");    //최종목표 성적을 입력하라는 문장 출력    
		double finalgoalgrade = input.nextDouble();    //목표를 입력받아 (Double)finalgrade로 저장
		//성적을 계산해서 성적을 더 올려야 한다를 알려주기 위한 기능을 계획하기 있기때문에 이 부분을 집어넣음
		System.out.print("Grade and Semester(ex- 1Grade 2Semester is 1.2): ");    //학년과 학기를 입력하라는 문장 출력
		double gradeandSemester = input.nextDouble();    //학년학기를 입력받아 (Double)grandeandsemester로 저장
		System.out.print("Grade(ex - ABACABF): ");    //성적을 입력하라는 문장 출력(플러스나 0없이 알파벳으로만 입력받아 합계성적을 산출할 예정)
		String grade = input.next();    //성적을 입력받아 (String)grade로 저장
		//입력 받은 ABCAA로 총 성적 계산, 최종 목표 성적까지 얼마가 남았다는 말 등을 추가할 예정
		
	}
	public static void deleteGrades() {    //학생의 학번과 학년, 학기를 입력받아 성적을 지우는 함수
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
		System.out.print("Grade and semester: ");
		double gradeandSemester = input.nextDouble();
	}
	public static void editGrades() {    //학생의 학번과 학년, 학기를 입력받아 성적을 수정하는 함수
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
		System.out.print("Grade and semester: ");
		double gradeandSemester = input.nextDouble();
	}
	public static void viewGrades() {    //학생의 학번을 입력받아 입력한 성적을 보여주는 함수
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
	}
}
