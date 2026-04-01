
class Product{
		
	
	void fun(String name,int cost){

		System.out.println("Parent Product Name : " + name + "Parent Product Cost : " + cost);

		
	}	

	
}

class productchild extends Product 
{
void fun(String name,int cost)
{

System.out.println("CHILD Product Name : " + name + "CHILD Product Cost : " + cost);

}	

}


class Overridding {

public static void main(String s[]){
		


		productchild c = new productchild();
		c.fun("junaid",500);
		
		Product p = new Product();
		p.fun("suraj",220);

		
	}



}