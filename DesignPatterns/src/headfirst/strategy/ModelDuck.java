package headfirst.strategy;

public class ModelDuck extends Duck {
	public ModelDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Quack();
		
		//setFlyBehavior(new FlyNoWay());
		//setQuackBehavior(new Quack());
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
