class Computer{
	void method_1(){
	System.out.println("class computer-method ");

}
	Computer(){
	System.out.println("class computer-constructor ");
	
}
}

class Laptop{
	void method_2(){
	System.out.println("class laptop-method ");

}
	Laptop(){
	System.out.println("class laptop-constructor");
}

}

class Example {
	public static void main(String s[]){
	Computer C = new Computer();
	Laptop L = new Laptop();
	C.method_1();
	L.method_2();
}
}