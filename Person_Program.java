import java.util.Scanner;

class Person {
    String name;
}

class Student extends Person {

    int rollNo;
    int marks;

    void input_Student() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Roll No: ");
        rollNo = sc.nextInt();

	sc.nextLine();


        System.out.println("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Student Marks: ");
        marks = sc.nextInt();
}

    void print_Student() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
}
}

class Parent extends Person {

    int parentId;
    Long contactNo;
    String address;

    void input_Parent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Parent ID: ");
        parentId = sc.nextInt();
	
	sc.nextLine();

        System.out.print("Enter Parent Name: ");
        name = sc.nextLine();

        System.out.print("Enter Contact No: ");
        contactNo = sc.nextLong();

	sc.nextLine();


        System.out.print("Enter Address: ");
        address = sc.nextLine();
    }

    void print_Parent() {
        System.out.println("Parent ID: " + parentId);
        System.out.println("Name: " + name);
        System.out.println("Contact No: " + contactNo);
        System.out.println("Address: " + address);
    }
}

class Person_Program {
    public static void main(String Args[]) {

        Student s = new Student();
        s.input_Student();
        s.print_Student();

        Parent p = new Parent();
        p.input_Parent();
        p.print_Parent();
    }
}
