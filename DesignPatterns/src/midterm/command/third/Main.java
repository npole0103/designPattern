package midterm.command.third;

public class Main {
	public static void main(String[] args) {
		CommandManager manager = new CommandManager();
		
		ShapeCommand commandCircle = new ShapeCommand();
		commandCircle.setShape(new Circle());
		manager.execute(commandCircle);
		manager.undo();
		manager.redo();
		
		System.out.println("---------------------------------");
		
		ShapeCommand commandRect = new ShapeCommand();
		commandRect.setShape(new Rectangle());
		manager.execute(commandRect);
		manager.undo();
		manager.redo();
		
		System.out.println("---------------------------------");
		
		manager.executeAll();
		
	}
}
