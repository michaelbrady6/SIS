public class Student
	{
		private String firstName;
		private String lastName;
		private String Class1;
		private String Class2;
		private String Class3;
		private String Grade1;
		private String Grade2;
		private String Grade3;
		private double GPA;
		public void Student(String f,String l,String c1,String c2,String c3, String g1,String g2, String g3)
			{
				firstName=f;
				lastName=l;
				Class1=c1;
				Class2=c2;
				Class3=c3;
				Grade1=g1;
				Grade2=g2;
				Grade3=g3;
				double q=0;
			switch(g1.substring(0,1)){
			case "A":q+=4;
			break;
			case "B":q+=3;
			break;
			case "C":q+=2;
			break;
			case "D":q+=1;
			default:break;
			}
			switch(g2.substring(0,1)){
			case "A":q+=4;
			break;
			case "B":q+=3;
			break;
			case "C":q+=2;
			break;
			case "D":q+=1;
			default:break;
			}
			switch(g3.substring(0,1){
			case "A":q+=4;
			break;
			case "B":q+=3;
			break;
			case "C":q+=2;
			break;
			case "D":q+=1;
			default:break;
			}
			q = q/3;
			q=q*100;
			int a = (int)q;
			double t= (double)a;
			t=t/100;
			
GPA=t;
			}
		@Override
		public String toString()
			{
				return   firstName + " " + lastName + " " + Class1 + " "
						+ Class2 + " " + Class3 + " " + Grade1 + " " + Grade2 + " "
						+ Grade3 + " " + GPA ;
			}
		public String getFirstName()
			{
				return firstName;
			}
		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}
		public String getLastName()
			{
				return lastName;
			}
		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}
		public String getClass1()
			{
				return Class1;
			}
		public void setClass1(String class1)
			{
				Class1 = class1;
			}
		public String getClass2()
			{
				return Class2;
			}
		public void setClass2(String class2)
			{
				Class2 = class2;
			}
		public String getClass3()
			{
				return Class3;
			}
		public void setClass3(String class3)
			{
				Class3 = class3;
			}
		public String getGrade1()
			{
				return Grade1;
			}
		public void setGrade1(String grade1)
			{
				Grade1 = grade1;
			}
		public String getGrade2()
			{
				return Grade2;
			}
		public void setGrade2(String grade2)
			{
				Grade2 = grade2;
			}
		public String getGrade3()
			{
				return Grade3;
			}
		public void setGrade3(String grade3)
			{
				Grade3 = grade3;
			}
		public double getGPA()
			{
				return GPA;
			}
		public void setGPA(double gPA)
			{
				GPA = gPA;
			}
	}
