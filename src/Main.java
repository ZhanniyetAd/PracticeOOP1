import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("hello");
        System.out.println("hello");



        Scanner in = new Scanner(System.in);

        Student[] students = new Student[10];
        int i = 0;


        while(true){
            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENT");
            System.out.println("PRESS [0] TO EXIT");

            int choice = in.nextInt();

            if(choice == 1){

                System.out.println("Insert Name: ");
                String name = in.next();

                System.out.println("Insert Surname: ");
                String surname = in.next();

                System.out.println("Insert GPA: ");
                double gpa = in.nextDouble();

                Student s = new Student(i, name, surname,gpa);


                students[i] = s;
                i++;
            } else if(choice == 2){
                for(int k = 0; k < students.length; k++){
                    if(students[k] != null) {
                        System.out.println(students[k].getStudentData());
                    }
                }
            } else if(choice == 0){
                break;
            }
        }



    }
}
