package midterm.command.second;

public class SpeakerOnCommand implements Command{
	private BlueToothSpeaker blueToothSpeaker;

    public SpeakerOnCommand(BlueToothSpeaker blueToothSpeaker) {
        this.blueToothSpeaker = blueToothSpeaker;
    }

    @Override
    public void execute() {
        blueToothSpeaker.on();
        blueToothSpeaker.connectWithPhone();
        blueToothSpeaker.playingMusic();
    }

    @Override
    public void undo() {
        blueToothSpeaker.off();
    }
}
