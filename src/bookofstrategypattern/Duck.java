package bookofstrategypattern;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	public void swim(){
		System.out.println("��� ������ ���� ��ϴ�. ��¥ ������ ������ ��ϴ�.");
	}
	
	public void setFlyBehavior(FlyBehavior fb)
	{
		 flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb)
	{
		quackBehavior = qb;
	}
	
	
	
}
