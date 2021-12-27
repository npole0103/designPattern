package headfirst.strategy;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		//�� Duck�� ����
		MallardDuck	mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();
 
		//ModeDuck ����
		ModelDuck	model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
		decoy.display();
   
		//model Duck �� �� ����. ������ FlyRocketPowered �� ���������ν� �����ϰ� ����.
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
