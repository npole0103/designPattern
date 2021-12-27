package midterm.observer.first;

import java.util.ArrayList;
import java.util.List;

public class Kayne implements Teacher{
	
	private List<Student> students = new ArrayList<>();
	
	public void teaching()
	{
		System.out.println("���� �ð��̴�.");
		notifyMsg("���� �ڸ��� ����");
	}
	
	public void breakTime()
	{
		System.out.println("���� �ð��̴�.");
		notifyMsg("ȭ��� ���ٿ��� �� ����� ����");
	}
	
	public void goToSchool()
	{
		System.out.println("� �ð��̴�.");
		notifyMsg("8�ñ��� �ڸ��� �ɾ����� ��");
	}
	public void goToHome()
	{
		System.out.println("�ϱ� �ð��̴�.");
		notifyMsg("���� ��. ���� ���� ����.");
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
