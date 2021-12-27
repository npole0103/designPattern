package midterm.command.first;

public class Main {
	public static void main(String[] args) {
		Heater heater = new Heater();
		Lamp lamp = new Lamp();
		
		Command heaterCommand = new HeaterOnCommand(heater);
		Command lampCommand = new LampOnCommand(lamp);
		HeyGoogle heyGoogle = new HeyGoogle();
		
		//히터를 킨다
		heyGoogle.setCommand(heaterCommand);
		heyGoogle.talk();
		
		//램프를 킨다.
		heyGoogle.setCommand(lampCommand);
		heyGoogle.talk();
	}
}
