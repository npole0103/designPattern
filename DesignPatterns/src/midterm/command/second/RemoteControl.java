package midterm.command.second;

import java.util.EmptyStackException;
import java.util.Stack;

public class RemoteControl {
	private Command[] onCommands;
	private Command[] offCommands;
	private Stack<Command> undoCommands;

	public RemoteControl() {
		onCommands = new Command[3];
		offCommands = new Command[3];

		Command noCommand = new NoCommand();

		for (int i = 0; i < onCommands.length; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}

		undoCommands = new Stack<>();
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonClick(int slot) {
		System.out.println("---------------- ON ----------------");
		onCommands[slot].execute();
		undoCommands.push(onCommands[slot]);
		System.out.println();
	}

	public void offButtonClick(int slot) {
		System.out.println("---------------- OFF ----------------");
		offCommands[slot].execute();
		undoCommands.push(offCommands[slot]);
		System.out.println();
	}

	public void undoButtonClick() {

		try {
			undoCommands.pop().undo();
		}
		catch (EmptyStackException ignored) {
		}
	}
}
