package bookofstrategypattern;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard= new MallardDuck("û�տ���");
		mallard.display();
		mallard.performQuack();
		mallard.performFly();	
		
		System.out.println("=================");
		
		
		Duck model = new  ModelDuck("��������");
		 model.display();
		 model.performFly();
		 model.setFlyBehavior(new FlyRocketPowered());
		 model.performFly();
	}

}
