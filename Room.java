class Room{

	int length, breath, height;
	
	Room(){
	length=10;
	breath=2;
	height=2;

}

	Room(int x, int y, int z){
	length=x;
	breath=y;
	height=z;
	
}
 
	void volume(){
	
	int vol = length*breath*height;
	System.out.println("volume = " + vol);
	
}
	public static void main(String s[]){
	 
	Room R1= new Room();
	Room R2= new Room(5,5,5);
	R1.volume();
	R2.volume();
}



}