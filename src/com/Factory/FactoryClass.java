package com.Factory;

public class FactoryClass {
	
	public OS getOS(String str) {
		if(str.equals("Android"))
			return new Android();
		else if(str.equals("Apple"))
			return new IOS();
		else
			return new Windows();
	}

}
