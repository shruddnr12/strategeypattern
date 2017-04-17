package strategypattern;

public class Aobj {
	
	Ainterface ainterface;
	
	public Aobj()
	{
		ainterface = new AinterfaceImpl();
	}
		public void funcAA()
		{			
			//~~기능이 필요합니다 개발해 주세요~~~ <위임>
			ainterface.funcA();
			ainterface.funcA();
			
			//다른 개발자의 코드를 복붙하는게 아니다!!!!!!!
		}
}
