// Parent class
class A {

    //String name;

    // Default constructor
    A() {
        System.out.println("Default constructor");
    }

    // Parameterized constructor
    A(String n) {
        //name = n;
        System.out.println("Parameterized constructor" +n);
    }

    void show() {
        System.out.println("This is class A");
    }
}

// Child class
class B extends A {

    //int x;

    // Constructor using super
    B(String n, int a) {
        super(n);
        //x = a;
    }

    // Method overriding
    void show() {
        System.out.println("This is class B");
    }

    // Method overloading
    void display(int z) {
	int p=10;
	p=z;
        System.out.println("Value: " + z);
    }

    void display(int y) {
        System.out.println("Value + y = " + (z + y));
    }
}

// Main class
class MainProgram {

    public static void main(String[] args) {

        B obj = new B("Ali", 10);

       // System.out.println("Name: " + obj.name);

        obj.show();        // overriding
        obj.display();     // overloading
        obj.display(5);    // overloading
    }
}
