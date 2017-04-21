package bookofstrategypattern;

public class ModelDuck extends Duck {

	 public ModelDuck(String name) {
		 setName(name);
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("���� " + getName() + " �Դϴ�.");
	}

}
