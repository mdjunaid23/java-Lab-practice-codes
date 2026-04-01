final class demo {

	final int i = 4;  //constant
	
	final void fun() {  		
		System.out.println("junaid = " + i);
		
	
		
		
}

}

class child extends demo {  // can't inherit

	void fun1(){

		
		System.out.println("suraj = " + i);
		
}
}

class finaldemo{

	public static void main(String args[]){


		child c = new child();
		c.fun();
		c.fun1();
}
}