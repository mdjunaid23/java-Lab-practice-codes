import java.util.Scanner;

class ExaminationRules {

    static final int PASS_MARKS = 40;

     ExaminationRules() {

        System.out.println("Vishwakarma University");
        System.out.println("-----ESE EXAMINATION-----");
        System.out.println("Year 2026");
    }

    void DisplayRules() {

        System.out.println("1. Ensure integrity and fairness");
        System.out.println("2. Arrive early with ID");
    }
}

class StudentResult extends ExaminationRules {

    String name;
    int marks;

    void input() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name:");
        name = sc.nextLine();

        System.out.println("Enter your marks:"); marks = sc.nextInt();
    }

    void print_result() {

        System.out.println("Student name: " + name);

        if (marks < PASS_MARKS){
            System.out.println("Marks = " + marks + " FAIL");}
        else{
            System.out.println("Marks = " + marks + " PASS");}
    }

    void DisplayRules() {

        System.out.println("Passing criteria is above 40");
   }
}

class university {

    public static void main(String args[]) {

        StudentResult A = new StudentResult();

        	
	//ExaminationRules B = new ExaminationRules();
	A.DisplayRules();
       
	A.input();
        A.print_result();
        A.DisplayRules();

	
    }
}
