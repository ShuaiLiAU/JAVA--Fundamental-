package quest2;

import java.util.*;

public class Game 
{
	public static void main(String[] agrs)
	{
		System.out.println("Please read the introduction carefully !");
		System.out.println("0 represent paper,");
		System.out.println("1 represent scissors,");
		System.out.println("2 represent rock,");
		Scanner in = new Scanner(System.in);
		System.out.println("Please tpye how many rounds to play : ");
		int playGame = in.nextInt();
		int numRounds = 0;
		int roundsWon = 0;
		while(numRounds < playGame)
		{
			System.out.println("Now put your number : ");
			Scanner in1 = new Scanner(System.in);
			int person = in1.nextInt();
			int computer = (int)((Math.random())*3);
			if(person == 0)
			{
				if(computer == 0)
				{
					System.out.println("a draw");
					numRounds = numRounds + 1;
				}
				else if(computer == 1)
				{
					System.out.println("Scissors wins: scissors cut paper");
					numRounds = numRounds + 1;
				}
				else if(computer == 2)
				{
					System.out.println("Paper wins: paper wraps rock");
					numRounds = numRounds + 1;
					roundsWon = roundsWon + 1;
				}
				else
				{
					System.out.println("Sorry your input is not valid! Start Over (valid not count into round)");
				}
			}
			else if(person == 1)
			{
				if(computer == 0)
				{
					System.out.println("Scissors wins: scissors cut paper");
					numRounds = numRounds + 1;
					roundsWon = roundsWon + 1;
				}
				else if(computer == 1)
				{
					System.out.println("a draw");
					numRounds = numRounds + 1;
				}
				else if(computer == 2)
				{
					System.out.println("Rock wins: rock blunts scissors");
					numRounds = numRounds + 1;
				}
				else
				{
					System.out.println("Sorry your input is not valid! Start Over (valid not count into round)");
				}
			}
			else if(person == 2)
			{
				if(computer == 0)
				{
					System.out.println("Paper wins: paper wraps rock");
					numRounds = numRounds + 1;
				}
				else if(computer == 1)
				{
					System.out.println("Rock wins: rock blunts scissors");
					roundsWon = roundsWon + 1;
					numRounds = numRounds + 1;
				}
				else if(computer == 2)
				{
					System.out.println("a draw");
					numRounds = numRounds + 1;
				}
				else
				{
					System.out.println("Sorry your input is not valid! Start Over (valid not count into round)");
				}
			}
			else
			{
				System.out.println("Sorry your input is not valid! Start Over (valid not count into round)");
			}
			System.out.println("*************numRounds : " + "you have played " + numRounds + " times");
			System.out.println("*************roundsWon : " + "you have winned " + roundsWon + " times");
			System.out.println("************************************************");
			
		}
		System.out.println("The Game Ends !");
		
	}

}
