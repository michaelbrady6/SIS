import java.util.*;
import java.io.*;
public class Runner
	{
		static ArrayList<Student> students = new ArrayList<Student>();
		public static void main(String[] args)throws IOException
			{
	 				Scanner file = new Scanner(new File ("studentInformation.txt"));
			 				int i = 0;
			 				while(file.hasNextLine())
			 					{
			 						String line = file.nextLine();
			 						students.add(new Student());
			 						students.get(i).setFirstName(line.substring(0,line.indexOf(" ")));
			 						line = line.replace((line.substring(0, line.indexOf(" ")) + " "), "");
			 						System.out.println(line);
			 						students.get(i).setLastName(line.substring(0,line.indexOf(" ")));
//			 						System.out.println(students.get(i).getLastName());
			 						line = line.replace((line.substring(0, line.indexOf(" ")) + " "), "");
			 						System.out.println(line);
			 						students.get(i).setClass1(line.substring(0,line.indexOf(" ")));
			 						i++;
			 					}
			 				changeGrade();
			}
		public static void initSetup()
			{
				System.out.println("Welcome to INPUT NAME ");
				System.out.println("Would you like to : ");
				System.out.println(" (1) Add or Delete a Student");
				System.out.println(" (2) Change Student grades");
				System.out.println(" (3) Sort Students");
				Scanner input = new Scanner(System.in);
				int input2 = input.nextInt();

				if (input2 == 1)
					{
						// Add how would you like students listed method
						// Add or Delete Student method

					} 
				else if (input2 == 2)
					{
						// Add how would you like students listed method
						// Change Student Grades method
					} 
				else if (input2 == 3)
					{
						// Add how would you like students listed method
						// Sort Students method

					} 
				else
					{
						System.out.println("Please input Either 1 , 2 or,  3 ");

					}

			}
		public static void deleteStudent(){
			
			
			System.out.println("Which student would you like to delete?");
			Scanner input = new Scanner(System.in);
			int input2 = input.nextInt();
			
			
			System.out.println("Are you sure you would like to remove " + students.get(input2).getFirstName());
			System.out.println("(1) Yes");
			System.out.println("(0) No");
			
			int input4 = input.nextInt();
			
			if(input4 == 1){
				
			students.remove(input);
			
			}
			
			else if(input4 == 0){
			
			}
		}
		public static void changeGrade()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Which student's grades would you like to change?");
			int input2 = input.nextInt();
			System.out.println("Is this the student who's grade you would like to change:");
			System.out.println(students.get(input2).getFirstName() + " " + students.get(input2).getLastName());
		}
	}