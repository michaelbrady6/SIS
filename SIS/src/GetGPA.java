
public class GetGPA
	{
		public double getGPA(int i){
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
return q;	}
	}
