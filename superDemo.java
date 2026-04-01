class Parent {

    // Default constructor
    Parent() {
        System.out.println("Parent default constructor");
    }

    // Parameterized constructor
    Parent(int x) {
        System.out.println("Parent parameterized constructor: " + x);
    }
}

class Child extends Parent {

    // Default constructor
    Child() {
        super();     // calls parent default constructor
        System.out.println("Child default constructor");
    }

    // Parameterized constructor
    Child(int y,int z) {
        super(y);  // calls parent parameterized constructor
        System.out.println("Child parameterized constructor: " + z);
    }
}

class superDemo {
    public static void main(String[] args) {

        Child c1 = new Child();      // default
        Child c2 = new Child(5,6);     // parameterized
    }
}
