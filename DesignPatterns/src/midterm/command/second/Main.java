package midterm.command.second;

public class Main {
	public static void main(String[] args) {
		RemoteControl control = new RemoteControl();

		Light roomLight = new Light("안방");
		BlueToothSpeaker blueToothSpeaker = new BlueToothSpeaker("거실");

		LightOnCommand lightOnCommand = new LightOnCommand(roomLight);
		LightOffCommand lightOffCommand = new LightOffCommand(roomLight);

		SpeakerOnCommand speakerOnCommand = new SpeakerOnCommand(blueToothSpeaker);
		SpeakerOffCommand speakerOffCommand = new SpeakerOffCommand(blueToothSpeaker);

		MacroCommand macroOnCommand = new MacroCommand(lightOnCommand, speakerOnCommand);
		MacroCommand macroOffCommand = new MacroCommand(lightOffCommand, speakerOffCommand);

		control.setCommand(0, lightOnCommand, lightOffCommand);
		control.setCommand(1, speakerOnCommand, speakerOffCommand);
		control.setCommand(2, macroOnCommand, macroOffCommand);

		control.onButtonClick(0);
		control.onButtonClick(1);
		control.offButtonClick(2);

		control.undoButtonClick();
	}
}
