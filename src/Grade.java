
public class Grade {	//성적을 입력할때 담기는 것을 Grade라는 클래스에 field로 입력
	String name;	//이름
	int id;		//학번
	double finalgoal;	//최종목표
	double graSem;	//학년 학기
	String grade;	//성적

	public Grade() {

	}

	public Grade(String name, int id, double finalgoal, double graSem, String grade) {
		/*인스턴스를 생성할떄 (String name, int id, double finalgoal, double graSem, String grade) 을 입력하면
		생성하면서 바로 그 값들을 인스턴스의 name, id, finalgoal, graSem, grade에 저장*/
		this.name = name;
		this.id = id;
		this.finalgoal = finalgoal;
		this.graSem = graSem;
		this.grade = grade;
	}
	public void printInfo() {	//입력한 것을 다시 출력해서 보여주는 method 생성
		System.out.println("Name: "+ name + " Id: " + id +" FinalGoal: "+ finalgoal + " GradeAndSemester: " + graSem + " Grade: " + grade);
	}
}
