import java.util.*;

public class Sorter
	{


		public static void GPA()

		{
			for (int i = 0; i < Runner.students.size(); i++)
				{
					for (int j = 0; j < Runner.students.size(); j++)
						{
							if (Runner.students.get(i).getGPA() < Runner.students.get(j).getGPA())
							{
								Collections.swap(Runner.students, i, j);
							}
						}
				}
		}
		public static void name()
		{
			for (int i = 0; i < Runner.students.size(); i++)
				{
					for (int j = 0; j < Runner.students.size(); j++)
						{
							if (Runner.students.get(i).getLastName().compareTo(Runner.students.get(j).getLastName()) < 0)
							{
								Collections.swap(Runner.students, i, j);
							}
						}
				}
		}
		public static void Class()
			{
				for (int i = 0; i < Runner.students.size(); i++)
					{
						for (int j = 0; j < Runner.students.size(); j++)
							{
								if (Runner.students
										.get(i)
										.getClass1()
										.compareTo(
												Runner.students.get(j)
														.getClass1()) < 0)
									{
										Collections.swap(Runner.students, i, j);
									}
							}
					}
			}
	}
