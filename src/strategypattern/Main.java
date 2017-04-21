//package strategypattern;
//
//public class Main {
//
//	public static void main(String[] args) {
//			Gamecharacter gamecharacter = new Gamecharacter();
//			
//			gamecharacter.attack();
//			
//			gamecharacter.setWeapon(new Knife());
//			gamecharacter.attack();
//			gamecharacter.setWeapon(new Sord());
//			gamecharacter.attack();
//		
//			//유지보수 (추가)
//			gamecharacter.setWeapon(new Ax());
//			gamecharacter.attack();
//			
//			
//	}
//}


package strategypattern;

public class Main {

	public static void main(String[] args) {
//		Ainterface ainterface = new AinterfaceImpl();
//
//		//통로
//		//ainterface.funcA();	
//		
//		
//		Aobj aobj = new Aobj();
//		aobj.funcAA();
		
		Gamecharacter gc = new Gamecharacter();
		gc.attack();
		gc.setWeapon(new Knife());
		gc.attack();
		gc.setWeapon(new Sord());
		gc.attack();
		
		
		Gamecharacter gc2 = new Gamecharacter();
		
		gc2.setWeapon(new Ax());
		gc2.attack();	
		
	}
}
