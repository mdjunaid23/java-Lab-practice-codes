class Student {
    String name;

    void show() {
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ali";
        s.show();
    }
}
