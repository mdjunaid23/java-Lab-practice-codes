	interface Color{
	public void createColor();	

	
	
	}
	
	class Red implements Color{
		public  void createColor(){
	
			System.out.println(" red color");
	
		}	
	
	
	}
	
	class Green implements Color{
		public  void createColor(){
	
			System.out.println(" green color");
	
		}
	
	
	
	}
	
	class Blue implements Color{
		public  void createColor(){
	
			System.out.println(" Blue color");
	
		}
	
	
	
	}
	
	

	
	
	
	
	
	class Interface_demo{
		public static void main(String S[]){
	
			Red obj1 = new Red();
			obj1.createColor();
			
			Green obj2 = new Green();
			obj2.createColor();
	
			Blue obj3 = new Blue();
		obj3.createColor();
	
	
	
	}
	
	
	
	
	
	
	
}
