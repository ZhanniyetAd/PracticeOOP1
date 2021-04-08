import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Player p1 = new Player(1,"Messi", "s1", "LW");
//        Player p2 = new Player(2,"Messi2", "s2", "LF");
//        Player p3 = new Player(3,"Messi3", "s3", "RW");
//        Player p4 = new Player(4,"Messi4", "s4", "FW");
//        Player p5 = new Player(5,"Messi5", "s5", "LF");
//        Player p6 = new Player(6,"Messi6", "s6", "RD");
//
//        Player[] players = new Player[3];
//        players[0] = p1;
//        players[1] = p2;
//        players[2] = p3;
//
//        Player[] players2 = new Player[3];
//        players2[0] = p4;
//        players2[1] = p5;
//        players2[2] = p6;
//
//        Club barcelona = new Club("Barcelona", "SPAIN", 1338, players);
//        Club realMadrid = new Club("Real Madrid", "SPAIN", 1400, players2);
//
//        Club[] clubs = {barcelona, realMadrid};
//
//        for(int i = 0; i < clubs.length; i++){
//            clubs[i].printClubData();
//            System.out.println("************");
//        }

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
