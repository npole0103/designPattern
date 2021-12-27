package midterm.command.third;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
	private List<ICommand> undo = new ArrayList<ICommand>();

	private List<ICommand> redo = new ArrayList<ICommand>();

	public void execute(ICommand command) {

		command.execute();

		undo.add(command);

	}

	public void executeAll() {

		for (ICommand command : undo) {

			command.execute();

		}

	}

	public void undo() {

		ICommand command = undo.get(undo.size() - 1);

		command.undo();

		undo.remove(command);

		redo.add(command);

	}

	public void redo() {

		ICommand command = redo.get(redo.size() - 1);

		command.redo();

		redo.remove(command);

		undo.add(command);

	}

}
