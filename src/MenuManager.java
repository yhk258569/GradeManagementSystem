import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);    //값을 입력받기 위해 input을 생성
		GradeManager gradeManager = new GradeManager(input);	//GradeManger라는 (input)을 parameter로 받는 클래스의 인스턴스인 gradeManager 생성

		int num = 0;	//초기 num의 값을 0으로 설정
		while(num != 5) {    //5번이 exit이기때문에 num이 5가 아닌동안 loop실행
			System.out.println("*** Grade Management System Menu ***");    //*** Grade Management System Menu *** 출력
			System.out.println("1. Add Grades");    //1. Add Grades 출력
			System.out.println("2. Delete Grades");    //2. Delete Grades 출력
			System.out.println("3. Edit Grades");    //3. Edit Grades 출력
			System.out.println("4. View Grades");    //4. View Grades 출력
			System.out.println("5. Exit");    //5. Exit 출력
			System.out.print("Select one number between 1 ~ 5: ");    //1~5번중 번호를 선택하라는 문장 출력
			num = input.nextInt();    //숫자를 입력받아 num에 저장
			if (num == 1) {
				gradeManager.addGrades();    //num이 1일떄 인스턴스 gradeManager의 addGrades()라는 methods 실행
			}
			else if (num == 2) {
				gradeManager.deleteGrades();    //num이 2일떄 인스턴스 gradeManager의 deleteGrades()라는 methods 실행
			}
			else if (num == 3) {
				gradeManager.editGrades();    //num이 3일떄 인스턴스 gradeManager의 editGrades()라는 methods 실행
			}
			else if (num == 4) {
				gradeManager.viewGrades();    //num이 4일떄 인스턴스 gradeManager의 viewGrades()라는 methods 실행
			}
			else  {
				continue;  //다른 번호가 나오면 loop를 다시 진행(5가 나오면 함수는 끝나게 되어있기 때문에)
			}
		}
	}

}
