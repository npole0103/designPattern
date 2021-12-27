package midterm.observer.first;

import java.util.ArrayList;
import java.util.List;

public class Kayne implements Teacher{
	
	private List<Student> students = new ArrayList<>();
	
	public void teaching()
	{
		System.out.println("수업 시간이다.");
		notifyMsg("얘들아 자리에 앉자");
	}
	
	public void breakTime()
	{
		System.out.println("쉬는 시간이다.");
		notifyMsg("화장실 갔다오고 쉴 사람은 쉬자");
	}
	
	public void goToSchool()
	{
		System.out.println("등교 시간이다.");
		notifyMsg("8시까지 자리에 앉아있을 것");
	}
	public void goToHome()
	{
		System.out.println("하교 시간이다.");
		notifyMsg("수업 끝. 집에 가자 얘들아.");
	}
	
	@Override
	public void subscribe(Student student) {
		students.add(student);
		
	}
	@Override
	public void unSubscribe(Student student) {
		students.remove(student);	
	}
	
	@Override
	public void notifyMsg(String msg) {
		for(Student student : students)
		{
			student.update(msg);
		}
	}

}
