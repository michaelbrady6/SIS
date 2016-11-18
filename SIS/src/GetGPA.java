import java.lang.*;
import java.text.*;
public class GetGPA
	{
		public static double getGPA(int i){
			double q=0;
			switch(Runner.students.get(i).getGrade1().substring(0,1)){
			case "A":q+=4;
			break;
			case "B":q+=3;
			break;
			case "C":q+=2;
			break;
			case "D":q+=1;
			default:break;
			}
			switch(Runner.students.get(i).getGrade2().substring(0,1)){
			case "A":q+=4;
			break;
			case "B":q+=3;
			break;
			case "C":q+=2;
			break;
			case "D":q+=1;
			default:break;
			}
			switch(Runner.students.get(i).getGrade3().substring(0,1)){
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
			
return t;	}
		
	}
