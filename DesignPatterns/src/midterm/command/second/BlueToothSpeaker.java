package midterm.command.second;

public class BlueToothSpeaker {
	 private String location;

	    public BlueToothSpeaker(String location) {
	        this.location = location;
	    }

	    public void on() {
	        System.out.println(location + "의 블루투스 스피커가 켜졌습니다.");
	    }

	    public void connectWithPhone() {
	        System.out.println("휴대폰과 연결 합니다.");
	    }

	    public void playingMusic() {
	        System.out.println("음악을 킵니다.");
	    }

	    public void off() {
	        System.out.println(location + "의 블루투스 스피커를 꺼졌습니다.");
	    }
}
