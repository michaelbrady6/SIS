import java.util.*;
public class Adder{
   public static void addStudent(){
      String fn,ln,c1,c2,c3,g1,g2,g3;
      Scanner scan= new Scanner(System.in);
      System.out.println("Please type the new students first name");
      fn=scan.nextLine();
      System.out.println("Please type the students last name");
      ln=scan.nextLine();
      System.out.println("Please type the students first class");
      c1=scan.nextLine();
      System.out.println("Please type the students grades in that class");
      g1=scan.nextLine();
      System.out.println("Please type the students second class");
      c2=scan.nextLine();
      System.out.println("Please type the students grades in that class");
      g2=scan.nextLine();
      System.out.println("Please type the students third class");
      c3=scan.nextLine();
      System.out.println("Please type the students grades in that class");
      g3=scan.nextLine();
      Student k = new Student(fn,ln,c1,c2,c3,g1,g2,g3);
      Runner.students.add(k);
      System.out.println("The new student has been added");

   }
}
