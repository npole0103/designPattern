package midterm.command.third;

public interface ICommand {
	public void execute();

	public void undo();

	public void redo();

}
