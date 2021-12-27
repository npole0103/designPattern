package midterm.command.first;

public class Main {
	public static void main(String[] args) {
		Heater heater = new Heater();
		Lamp lamp = new Lamp();
		
		Command heaterCommand = new HeaterOnCommand(heater);
		Command lampCommand = new LampOnCommand(lamp);
		HeyGoogle heyGoogle = new HeyGoogle();
		
		//���͸� Ų��
		heyGoogle.setCommand(heaterCommand);
		heyGoogle.talk();
		
		//������ Ų��.
		heyGoogle.setCommand(lampCommand);
		heyGoogle.talk();
	}
}
