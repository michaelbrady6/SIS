import java.util.*;
import java.io.*;
public class Runner
	{
		public static void main(String[] args)throws IOException
			{
				ArrayList<Student> students = new ArrayList<Student>();
				Scanner file = new Scanner(new File ("studentInformation.txt"));
				int i = 0;
				while(file.hasNextLine())
					{
						String line = file.nextLine();
						students.add(new Student());
						students.get(i).setFirstName(line.substring(0,line.indexOf(" ")));
						i++;
					}
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
	}