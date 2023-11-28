package fsp;
import java.util.Random;
import java.util.Scanner;
public class task1_no_game 
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	Random r = new Random();
    	int maxN=100;
    	int minN=1;
    	int maxTry=10;
    	System.out.println("WELCOME TO THE NUMBER GUESSING GAME");
    	int round=0;
    	int score =0;
    	try 
    	{
    		do 
        	{
        		int target = r.nextInt(maxN)+minN;
        		System.out.println("ROUND : "+(round+1));
        		System.out.println("GUESS THE NUMBER BETWEEN "+minN+" to "+maxN);
        		int Try=0;
        	    while(Try<maxTry)
        	    {
        	    	int userInput = sc.nextInt();
        	    	Try++;
        	    	if(userInput<minN || userInput>maxN)
        	    	{
        	    		System.out.println("You reached out of bond");
        	    	}
        	    	if(userInput == target)
        	    	{
        	    	System.out.println("Congratulation ! you guess corectly in "+Try+" attempts");
        	    	score++;
        	    	break;
        	    	}
        	    	else if(userInput<target)
        	    	{
        	    		System.out.println("Please try higher number !");
        	    	}
        	    	else
        	    	{
        	    		System.out.println("Please try smaller number !");
        	    	}
        	    	if(Try>=maxTry)
        	    	{
        	    		System.out.println("Sorry ! you can't try more then "+maxTry+" times");
        	    	}
        	    }
        	  round++;
        	  System.out.println("Do you want to play again if yes press 'y' if no press 'no' ");
        				
        	}while(sc.next().equalsIgnoreCase("y"));
    		
    		System.out.println("You play : "+round+" round");
        	System.out.println("You guess the number correctly "+score+" times");
        	System.out.println("Your score is "+score);
    	}catch(Exception e)
    	{
    		System.out.println("Your input is incorrect !");
    		System.out.println(e);
    		System.out.println("play agin !");
    		
    	}
    
    	
    }
}
