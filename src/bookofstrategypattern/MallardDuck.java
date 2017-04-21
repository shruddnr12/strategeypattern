package bookofstrategypattern;

public class MallardDuck extends Duck{

	
	public MallardDuck(String name) {
			setName(name);
			quackBehavior = new Quack();
			flyBehavior = new FlyWithWings();
	}
	
	
	@Override
	public void display() {
		System.out.println("���� " + getName() + " �Դϴ�");
	}
	
}
