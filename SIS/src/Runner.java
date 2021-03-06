import java.util.*;
import java.io.*;

public class Runner
	{
		static ArrayList<Student> students = new ArrayList<Student>();

		public static void main(String[] args) throws IOException
			{
				Scanner file = new Scanner(new File("studentInformation.txt"));
				int i = 0;
				while (file.hasNextLine())
					{
						String line = file.nextLine();
						students.add(new Student());

						students.get(i).setFirstName(
								line.substring(0, line.indexOf(" ")));
						line = line.replace(
								(line.substring(0, line.indexOf(" ")) + " "),
								"");

						students.get(i).setLastName(
								line.substring(0, line.indexOf(" ")));
						line = line.replace(
								(line.substring(0, line.indexOf(" ")) + " "),
								"");

						students.get(i).setClass1(
								line.substring(0, line.indexOf(" ")));
						line = line.replace(
								(line.substring(0, line.indexOf(" ")) + " "),
								"");

						students.get(i).setGrade1(
								line.substring(0, line.indexOf(" ")));
						line = line.replace(
								(line.substring(0, line.indexOf(" ")) + " "),
								"");

						students.get(i).setClass2(
								line.substring(0, line.indexOf(" ")));
						line = line.replace(
								(line.substring(0, line.indexOf(" ")) + " "),
								"");

						students.get(i).setGrade2(
								line.substring(0, line.indexOf(" ")));
						line = line.replace(
								(line.substring(0, line.indexOf(" ")) + " "),
								"");

						students.get(i).setClass3(
								line.substring(0, line.indexOf(" ")));
						line = line.replace(
								(line.substring(0, line.indexOf(" ")) + " "),
								"");

						students.get(i).setGrade3(line.substring(0));
						students.get(i).setGPA(GetGPA.getGPA(i));
						i++;

					}

				printStudents();

				initSetup();

			}

		public static void printStudents()
			{

				int e = 0;
				while (e <= students.size() - 1)
					{

						System.out.print(e + 1 + ") ");

						System.out.println(students.get(e));
						e++;

					}
			}


		public static void initSetup()
			{
				boolean a = true;
				System.out.println("Welcome to SIS ");
				while (a)
					{
						System.out.println("Would you like to : ");
						System.out.println(" 1) Add or Delete a Student");
						System.out.println(" 2) Change Student grades");
						System.out.println(" 3) Sort Students");
						Scanner input = new Scanner(System.in);
						int input2 = input.nextInt();

						if (input2 == 1)
							{
								System.out.println("1) Add a student");
								System.out.println("2) Delete a Student");
								Scanner studentInput = new Scanner(System.in);
								int studentInput2 = studentInput.nextInt();
								if (studentInput2 == 1)
									{
										Adder.addStudent();

									}
								else if (studentInput2 == 2)
									{
										deleteStudent();

									}
								else
									{
										System.out
												.println("Please input either a 1 or a 2");
									}

							}
						else if (input2 == 2)
							{
								System.out.println("1) Change student grade");
								System.out.println("2) Switch student's classes");
								Scanner studentInput = new Scanner(System.in);
								int studentInput2 = studentInput.nextInt();
								if (studentInput2 == 1)
									{
										changeGrade();
									}
								else if (studentInput2 == 2)
									{
										SwitchClass.Change();
									}
							}
						else if (input2 == 3)
							{
								System.out.println("How would you like it sorted?");
								System.out.println("1) By GPA");
								System.out.println("2) By Last Name");
								System.out.println("3) By Class");
								Scanner studentInput = new Scanner(System.in);
								int num = studentInput.nextInt();
								if (num == 1)
									{
										Sorter.GPA();
										printStudents();
									}
								else if (num == 2)
									{
										Sorter.name();
										printStudents();
									}
								else if (num == 3)
									{
										Sorter.name();
										Sorter.Class();
										printStudents();
									}
							}
						else
							{
								System.out.println("Please input Either 1 , 2 or,  3 ");
							}
						System.out.println("Would you like to run this again?");
						Scanner n = new Scanner(System.in);
						String x = n.nextLine();
						if (x.toLowerCase().equals("y")
								|| x.toLowerCase().equals("yes"))
							{

							}
						else
							{
								a = false;
								System.out.println("Goodbye");
							}
					}
			}

		public static void deleteStudent()
			{

				System.out.println("Which student would you like to delete?");
				Scanner input = new Scanner(System.in);
				int input2 = input.nextInt();

				System.out.println("Are you sure you would like to remove "
						+ students.get(input2 - 1).getFirstName() + " "
						+ students.get(input2 - 1).getLastName());
				System.out.println("1) Yes");
				System.out.println("0) No");
				Scanner input3 = new Scanner(System.in);
				int input4 = input3.nextInt();

				if (input4 == 1)
					{

						students.remove(input2 - 1);
						printStudents();
					}

				else if (input4 == 0)
					{
						System.out
								.println("Bringing you back to the top . . . ");
						initSetup();
					}

			}

		public static void changeGrade()
			{
				Scanner input = new Scanner(System.in);
				System.out
						.println("Which student's grades would you like to change?");
				int input2 = input.nextInt();
				System.out
						.println("Is this the student who's grade you would like to change:");
				System.out.println(students.get(input2 - 1).getFirstName()
						+ " " + students.get(input2 - 1).getLastName());
				Scanner input3 = new Scanner(System.in);
				String inp = input3.nextLine().toLowerCase();
				if (inp.equals("y") || inp.equals("yes"))
					{
						System.out.println("Which class would you like to change the grade for?");
						System.out.println("(1) "
								+ students.get(input2 - 1).getClass1());
						System.out.println("(2) "
								+ students.get(input2 - 1).getClass2());
						System.out.println("(3) "
								+ students.get(input2 - 1).getClass3());
						int n = input.nextInt();
						System.out.println("What would you like the grade to be?");
						String s = input3.nextLine();
						if (n == 1)
							{
								students.get(input2 - 1).setGrade1(s);
								students.get(input2 - 1).getGrade1();
							}
						if (n == 2)
							{
								students.get(input2 - 1).setGrade2(s);
								students.get(input2 - 1).getGrade2();
							}
						if (n == 3)
							{
								students.get(input2 - 1).setGrade3(s);

							}
						GetGPA.getGPA(input2 - 1);
						System.out.println("The grade has been changed");
						printStudents();
					}
			}

	}
