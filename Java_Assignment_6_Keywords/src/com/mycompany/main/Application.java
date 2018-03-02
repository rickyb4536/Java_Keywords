package com.mycompany.main;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x, y;
		x = 100.5f;
		y = 33.6f;
		
		System.out.println("Addition result: " + StaticClass.add(x, y));
		
		FinalClass fc = new FinalClass();
		System.out.println(fc.myConstant);
		
		ConcreteClass cc = new ConcreteClass();
		cc.run();
	}

}
