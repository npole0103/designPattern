package midterm.command.second;

public class BlueToothSpeaker {
	 private String location;

	    public BlueToothSpeaker(String location) {
	        this.location = location;
	    }

	    public void on() {
	        System.out.println(location + "�� ������� ����Ŀ�� �������ϴ�.");
	    }

	    public void connectWithPhone() {
	        System.out.println("�޴����� ���� �մϴ�.");
	    }

	    public void playingMusic() {
	        System.out.println("������ ŵ�ϴ�.");
	    }

	    public void off() {
	        System.out.println(location + "�� ������� ����Ŀ�� �������ϴ�.");
	    }
}
