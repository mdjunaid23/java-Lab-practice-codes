class Lamp {
	boolean isOn;

	void turnOn(){
	isOn = true;
	System.out.println("turnOn fun = "+isOn);
}
	void turnOff(){
	isOn = false;
	System.out.println("turnOff fun = "+isOn);

}
	


}
class lamp_program{
	public static void main(String s[]){
	Lamp led = new Lamp();
	Lamp halogen = new Lamp();
	led.turnOn();
	halogen.turnOff();

}

}
