import java.util.*;
import java.io.*;

public class SwitchClass
	{
		public static void Change()
			{
				String s = "";
				String s2 = "";
				String s3 = "";
				String s4 = "";
				Scanner input = new Scanner(System.in);
				System.out.println("Which student's classes would you like to change?");
				int n = input.nextInt();
				System.out.println("What class would you like to change?");
				System.out.println(" 1)"
						+ Runner.students.get(n - 1).getClass1());
				System.out.println(" 2)"
						+ Runner.students.get(n - 1).getClass2());
				System.out.println(" 3)"
						+ Runner.students.get(n - 1).getClass3());
				int in = input.nextInt();
				System.out.println("What class would you like to change it with?");
				System.out.println(" 1)"
						+ Runner.students.get(n - 1).getClass1());
				System.out.println(" 2)"
						+ Runner.students.get(n - 1).getClass2());
				System.out.println(" 3)"
						+ Runner.students.get(n - 1).getClass3());
				int in2 = input.nextInt();
				if (in == 1)
					{
						s = Runner.students.get(n - 1).getClass1();
						s4 = Runner.students.get(n - 1).getGrade1();
					}
				else if (in == 2)
					{
						s = Runner.students.get(n - 1).getClass2();
						s4 = Runner.students.get(n - 1).getGrade2();
					}
				else if (in == 3)
					{
						s = Runner.students.get(n - 1).getClass3();
						s4 = Runner.students.get(n - 1).getGrade3();
					}
				if (in2 == 1)
					{
						s3 = Runner.students.get(n - 1).getGrade1();
						s2 = Runner.students.get(n - 1).getClass1();
						Runner.students.get(n - 1).setGrade1(s4);
						Runner.students.get(n - 1).setClass1(s);
						if (in == 1)
							{
								Runner.students.get(n - 1).setClass1(s3);
								Runner.students.get(n - 1).setClass1(s2);
							}
						else if (in == 2)
							{
								Runner.students.get(n - 1).setGrade2(s3);
								Runner.students.get(n - 1).setClass2(s2);
							}
						else if (in == 3)
							{
								Runner.students.get(n - 1).setGrade3(s3);
								Runner.students.get(n - 1).setClass3(s2);
							}
					}
				else if (in2 == 2)
					{
						s3 = Runner.students.get(n - 1).getGrade2();
						s2 = Runner.students.get(n - 1).getClass2();
						Runner.students.get(n - 1).setGrade2(s4);
						Runner.students.get(n - 1).setClass2(s);
						if (in == 1)
							{
								Runner.students.get(n - 1).setClass1(s3);
								Runner.students.get(n - 1).setClass1(s2);
							}
						else if (in == 2)
							{
								Runner.students.get(n - 1).setGrade2(s3);
								Runner.students.get(n - 1).setClass2(s2);
							}
						else if (in == 3)
							{
								Runner.students.get(n - 1).setGrade3(s3);
								Runner.students.get(n - 1).setClass3(s2);
							}
					}
				else if (in2 == 3)
					{
						s3 = Runner.students.get(n - 1).getGrade3();
						s2 = Runner.students.get(n - 1).getClass3();
						Runner.students.get(n - 1).setGrade3(s4);
						Runner.students.get(n - 1).setClass3(s);
						if (in == 1)
							{
								Runner.students.get(n - 1).setClass1(s3);
								Runner.students.get(n - 1).setClass1(s2);
							}
						else if (in == 2)
							{
								Runner.students.get(n - 1).setGrade2(s3);
								Runner.students.get(n - 1).setClass2(s2);
							}
						else if (in == 3)
							{
								Runner.students.get(n - 1).setGrade3(s3);
								Runner.students.get(n - 1).setClass3(s2);
							}
					}
				System.out.println(Runner.students.get(n - 1));
			}
	}
