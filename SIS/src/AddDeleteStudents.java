import java.util.Scanner;

public class AddDeleteStudents {

	
	public static void deleteStudent(){
		
		
		System.out.println("Which student would you like to delete?");
		Scanner input2 = new Scanner(System.in);
		int input = input2.nextInt();
		
		
		System.out.println("Are you sure you would like to remove" + Student.students.get(Student.getName(input)));
		System.out.println("(1) Yes");
		System.out.println("(0) No");
		
		
		Scanner input3 = new Scanner(System.in);
		int input4 = input3.nextInt()
		
		if(input4 == 1){
			
		Student.students.remove(input);
		
		}
		
		else if(input4 == 0){
		
		}
		
	}
	
	
}