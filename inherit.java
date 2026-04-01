class P{

	P(int x){

	System.out.println("i am in parent class" + x);

	}	

}

class ch extends P {
	
	void child(int y) {

	System.out.println("i am in parent class" + y);
	
	}


}

class inherit{

	public static void main(String args[]){
	
		ch c = new ch();
		c.child(10);
		
		//P par = new P();
		//par.P(20);
	}


}