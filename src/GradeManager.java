import java.util.Scanner;

public class GradeManager {	//GradeManager라는 클래스 생성(Grade와 관련된 부분을 따로 관리하기 위해서)
	Grade grade = new Grade();	//Grade 클래스와 값이 같은 grade라는 인스턴스 생성
	Scanner input;	//스캐너 input 생성
	GradeManager(Scanner input){
		this.input = input;	//인스턴스를 생성할때 GradeManager(입력값)하면 그 인스턴스의 input에 (입력값)이 저장됨
	}

	public void addGrades() {	//addGrades()라는 method grade라는 인스턴스를 통해 클래스 Grade로 접근
		System.out.print("Student ID: ");    //학번을 입력하라는 문장 출력
		grade.id = input.nextInt();    //학번을 입력받아 Grade 클래스의 id로 저장
		System.out.print("Student Name: ");    //이름을 입력하라는 문장 출력
		grade.name = input.next();    //이름을 입력받아 Grade 클래스의 name으로 저장
		System.out.print("Final Goal Grade(ex - 4.2): ");    //최종목표 성적을 입력하라는 문장 출력    
		grade.finalgoal = input.nextDouble();    //목표를 입력받아 Grade 클래스의 finalgoal에 저장
		//성적을 계산해서 성적을 더 올려야 한다를 알려주기 위한 기능을 계획하고 있습니다.
		System.out.print("Grade and Semester(ex- 1Grade 2Semester is 1.2): ");    //학년과 학기를 입력하라는 문장 출력
		grade.graSem = input.nextDouble();    //학년학기를 입력받아 Grade클래스의 graSem에 저장
		System.out.print("Grade(ex - ABACABF): ");    //성적을 입력하라는 문장 출력(+나 0없이 알파벳으로만 입력받아 합계성적을 산출할 예정입니다.)
		grade.grade = input.next();    //성적을 입력받아 Grade클래스의 grade에 저장
		//입력 받은 ABCAA로 총 성적 계산, 최종 목표 성적까지 얼마가 남았다는 말 등을 추가할 생각입니다.
	}
	
	//같은 if가 너무 많이 반복되는 경향이 있는덴 이 부분은 후에 고쳐서 좀 더 정돈된 코드를 만들도록 하겠습니다.
	
	public void deleteGrades() {    //학생의 학번과 학년, 학기를 입력받아 성적을 지우는 method
		System.out.print("Student ID: ");	//학번을 입력하라는 문장 출력
		int studentId = input.nextInt();	//사용자에게 학번을 입력받아 studentId에 저장
		if (grade.id != studentId) {	//사용자가 add해놓았던 학번과 방금 입력한 학번이 같은지 알아보아 같지 않으면 아래 문장 출력하고 return
			System.out.println("The Student's grade has not been registered.");
			return;
		}	//같으면 그대로 진행
		System.out.print("Grade and semester: ");	//학년과 학기를 입력하라는 문장 출력
		Double gradeSemester = input.nextDouble();	//사용자에게 입력받아 gradeSemester에 저장
		if (grade.graSem != gradeSemester) {	//사용자가 add해놓았던 학년학기와 방금 입력한 학년학기가 같은지 알아보아 같지 않으면 아래 문장 출력하고 return
			System.out.println("There are no grades for that school year.");
			return;
		}	//같으면 그대로 진행
		if (grade.id == studentId && grade.graSem == gradeSemester) {	//학번과 학년학기가 모두 같으면 grade에 null값을 줌으로써 delete 기능을 수행하고 그것을 알려주는 문장 출력
			grade = null;
			System.out.println("The Student's " + gradeSemester + " grade is deleted.");
		}
	}
	
	public void editGrades() {    //학생의 학번과 학년, 학기를 입력받아 성적을 수정하는 method
		System.out.print("Student ID: ");	//학번을 입력하라는 문장 출력
		int studentId = input.nextInt();	//사용자에게 학번을 입력받아 studentId에 저장
		if (grade.id != studentId) {	//사용자가 add해놓았던 학번과 방금 입력한 학번이 같은지 알아보아 같지 않으면 아래 문장 출력하고 return
			System.out.println("The Student's grade has not been registered.");
			return;
		}	//같으면 그대로 진행
		System.out.print("Grade and semester: ");	//학년과 학기를 입력하라는 문장 출력
		Double gradeSemester = input.nextDouble();	//사용자에게 입력받아 gradeSemester에 저장
		if (grade.graSem != gradeSemester) {	//사용자가 add해놓았던 학년학기와 방금 입력한 학년학기가 같은지 알아보아 같지 않으면 아래 문장 출력하고 return
			System.out.println("There are no grades for that school year.");
			return;
		}	//같으면 그대로 진행
		//학번 학년학기가 모두 같으면 edit할 성적 문자열을 입력하라는 문장 출력 후 그것을 Grade클래스에 저장한 후 아래 문장 출력
		if (grade.id == studentId && grade.graSem == gradeSemester) {
			System.out.print("Please Enter edit grade(ex: ABAAC): ");
			grade.grade = input.next();
			System.out.println("The Student's grade (ID: " + studentId + ") is edited");
		}
	}
	
	public void viewGrades() {    //학생의 학번을 입력받아 입력한 성적을 보여주는 method
		System.out.print("Student ID: ");	//학번을 입력하라는 문장 출력
		int studentId = input.nextInt();	//사용자에게 학번을 입력받아 studentId에 저장
		if (grade.id == studentId) {	//사용자가 add해놓았던 학번과 방금 입력한 학번이 같은지 알아보아 같으면 Grade클래스의 printInfo method 실행
			grade.printInfo();
		}
	}
}
