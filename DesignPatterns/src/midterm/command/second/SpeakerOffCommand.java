package midterm.command.second;

public class SpeakerOffCommand implements Command{
	 private BlueToothSpeaker blueToothSpeaker;

	    public SpeakerOffCommand(BlueToothSpeaker blueToothSpeaker) {
	        this.blueToothSpeaker = blueToothSpeaker;
	    }

	    @Override
	    public void execute() {
	        blueToothSpeaker.off();
	    }

	    @Override
	    public void undo() {
	        blueToothSpeaker.on();
	        blueToothSpeaker.connectWithPhone();
	        blueToothSpeaker.playingMusic();
	    }
}
