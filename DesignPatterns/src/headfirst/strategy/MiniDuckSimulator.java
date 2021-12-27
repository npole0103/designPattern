package headfirst.strategy;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		//각 Duck을 생성
		MallardDuck	mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();
 
		//ModeDuck 생성
		ModelDuck	model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
		decoy.display();
   
		//model Duck 날 수 없음. 하지만 FlyRocketPowered 를 대입함으로써 가능하게 만듦.
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
