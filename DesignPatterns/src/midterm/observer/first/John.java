package midterm.observer.first;

public class John implements Student{
	@Override
	public void update(String msg) {
		System.out.println("John ���� : " + msg);
	}
}