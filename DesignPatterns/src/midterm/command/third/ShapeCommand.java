package midterm.command.third;

class ShapeCommand implements ICommand {

	Shape shape;

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void execute() {
		shape.draw();
	}

	public void undo() {
		shape.undraw();
	}

	public void redo() {
		execute();
	}

}