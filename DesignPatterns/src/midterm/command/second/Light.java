package midterm.command.second;

public class Light {
	private String location;

    public Light(String feature) {
        this.location = feature;
    }

    public void on() {
        System.out.println(location + "�� ������ �������ϴ�.");
    }

    public void off() {
        System.out.println(location + "�� ������ �������ϴ�.");
    }
}
