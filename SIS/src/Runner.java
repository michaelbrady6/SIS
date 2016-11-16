import java.util.*;
import java.io.*;
public class Runner
	{
		static ArrayList<Student> students = new ArrayList<Student>();
		public static void main(String[] args)throws IOException
			{
			 				Scanner file = new Scanner(new File ("studentInformation.txt"));
			 				int i = 0;
			 				int g1 = 0;
			 				int g2 = 0;
			 				int g3 = 0;
			 				while(file.hasNextLine())
			 					{
			 						String line = file.nextLine();
			 						students.add(new Student());
			 						
			 						students.get(i).setFirstName(line.substring(0,line.indexOf(" ")));
			 						line = line.replace((line.substring(0, line.indexOf(" ")) + " "), "");
			 						
			 						students.get(i).setLastName(line.substring(0,line.indexOf(" ")));
			 						line = line.replace((line.substring(0, line.indexOf(" ")) + " "), "");
			 						
			 						students.get(i).setClass1(line.substring(0,line.indexOf(" ")));
			 						line = line.replace((line.substring(0, line.indexOf(" ")) + " "), "");
			 						
			 						students.get(i).setGrade1(line.substring(0,line.indexOf(" ")));
			 						line = line.replace((line.substring(0, line.indexOf(" ")) + " "), "");
			 						
			 						students.get(i).setClass2(line.substring(0,line.indexOf(" ")));
			 						line = line.replace((line.substring(0, line.indexOf(" ")) + " "), "");
			 						
			 						students.get(i).setGrade2(line.substring(0,line.indexOf(" ")));
			 						line = line.replace((line.substring(0, line.indexOf(" ")) + " "), "");
			 						
			 						students.get(i).setClass3(line.substring(0,line.indexOf(" ")));
			 						line = line.replace((line.substring(0, line.indexOf(" ")) + " "), "");
			 						
			 						students.get(i).setGrade3(line.substring(0,line.indexOf(" ")));
			 						line = line.replace((line.substring(0, line.indexOf(" ")) + " "), "");
			 						
			 						switch (students.get(i).getGrade1().substring(0,1))
			 						{
			 						case "A":
			 							g1 = 4;
			 						case "B":
			 							g1 = 3;
			 						case "C":
			 							g1 = 2;
			 						case "D":
			 							g1 = 1;
			 						case "F":
			 							g1 = 0;
			 						}
			 						switch (students.get(i).getGrade2().substring(0,1))
			 						{
			 						case "A":
			 							g2 = 4;
			 						case "B":
			 							g2 = 3;
			 						case "C":
			 							g2 = 2;
			 						case "D":
			 							g2 = 1;
			 						case "F":
			 							g2 = 0;
			 						}
			 						switch (students.get(i).getGrade3().substring(0,1))
			 						{
			 						case "A":
			 							g3 = 4;
			 						case "B":
			 							g3 = 3;
			 						case "C":
			 							g3 = 2;
			 						case "D":
			 							g3 = 1;
			 						case "F":
			 							g3 = 0;
			 						}
			 						students.get(i).setGPA((g1 + g2 + g3)/3);
			 						i++;
			 					}
			 				System.out.println(students.get(1).getFirstName());
			 				System.out.println(students.get(1).getLastName());
			 				System.out.println(students.get(1).getClass1());
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
			
			if(input4 == 1)
			{
				
			students.remove(input);
			
			}
			
			else if(input4 == 0)
			{
			
			}
			
		}
	}