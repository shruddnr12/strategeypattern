package strategypattern;

public class Main {

	public static void main(String[] args) {
			Gamecharacter gamecharacter = new Gamecharacter();
			
			gamecharacter.attack();
			
			gamecharacter.setWeapon(new Knife());
			gamecharacter.attack();
			gamecharacter.setWeapon(new Sord());
			gamecharacter.attack();
		
			//유지보수 (추가)
			gamecharacter.setWeapon(new Ax());
			gamecharacter.attack();
			
			
	}
}


//package strategypattern;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Ainterface ainterface = new AinterfaceImpl();
//
//		//통로
//		//ainterface.funcA();	
//		
//		
//		Aobj aobj = new Aobj();
//		aobj.funcAA();
//		
//		
//	}
//}
