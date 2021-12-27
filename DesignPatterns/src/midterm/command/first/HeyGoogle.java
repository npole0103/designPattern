package midterm.command.first;

public class HeyGoogle {
	private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void talk(){
        command.run();
    }
}
