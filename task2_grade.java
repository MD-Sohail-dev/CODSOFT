package fsp;
import java.util.Scanner;
public class task2_grade
{
  public static void main(String[] args)
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number of subject : ");
	  int nsub=sc.nextInt();
	  int tmarks=0;
	  for(int i=1;i<=nsub;i++)
	  {
		  System.out.println("Enter marks obtain in subject: "+i);
		  int marks=sc.nextInt();
		  tmarks=tmarks+marks;
	  }
	  System.out.println("Total marks of "+nsub+" subject is "+tmarks);
	  double avg=(double)tmarks/(nsub);
	  System.out.println("Average percentage : "+avg+"%");
	  String grade;
	  if(avg>=90 && avg<=100)
		  grade="O (Outstanding)";
	  else if(avg>=80 && avg<90)
		  grade="E (Excelent)";
	  else if(avg>=70 && avg <80)
		  grade="A (Very Good)";
	  else if(avg>=60 && avg <70)
		  grade="B (Good)";
	  else if(avg>=50 && avg <60)
		  grade="C (Fair)";
	  else if(avg>=40 && avg <=49)
		  grade="D (Below Average)";
	  else
		  grade ="F (Fail)";
	 
	  System.out.println("Grade : "+grade);
  }
}
