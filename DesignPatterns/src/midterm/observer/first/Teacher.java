package midterm.observer.first;

public interface Teacher {
	void subscribe(Student student);
	void unSubscribe(Student student);
	void notifyMsg(String msg);
}