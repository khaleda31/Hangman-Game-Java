import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Game 
{
	//colour
	public static final String BLACK = "\033[0;30m";   
    public static final String RED = "\033[0;31m";     
    public static final String GREEN = "\033[0;32m";   
    public static final String YELLOW = "\033[0;33m";  
    public static final String BLUE = "\033[0;34m";
    public static final String PURPLE = "\033[0;35m"; 
    public static final String CYAN = "\033[0;36m";
    public static final String RESET = "\033[0m"; 
	public static final String PBRIGHT= "\033[1;95m";
	
	private ArrayList <String> namelist = new ArrayList <String> ();
	private ArrayList <Vocab> collection = new ArrayList <Vocab>();
	private Gallow g1 = new Gallow();
	private Vocab v1;
	private Record r1;
	private String word, colour;
	private String star = "";
	private String newStar;
	private String collect = "";
	private static int error = 0;
	int chances = 6;
	
	Random rand = new Random();
	Scanner in = new Scanner(System.in);

	public Game()
	{
		
	}
	
	//adding objects to Array List
	public void addWord(String worded, String coloured)
	{
		collection.add(v1 = new Vocab(worded, coloured));
	}
	
	//getting a word from Array List
	public void getWord()
	{
		int random = rand.nextInt(0,10);
		word = collection.get(random).getWord();
		colour = collection.get(random).getColour();
	}
	
	//display unguessed word
	public void getMystery()
	{
		for (int i = 0; i < word.length(); i++)
		{
			star += "*";
		}
	}
	
	//setting colour to word
	public void colour(String colour)
		{
			if (colour.equals("RED"))
			{
				System.out.println(RED + word + RESET);
			}
			else if (colour.equals("GREEN"))
			{
				System.out.println(GREEN + word + RESET);
			}
			else if (colour.equals("YELLOW"))
			{
				System.out.println(YELLOW + word + RESET);
			}
			else if (colour.equals("BLUE"))
			{
				System.out.println(BLUE + word + RESET);
			}
			else if (colour.equals("PBRIGHT"))
			{
				System.out.println(PBRIGHT + word + RESET);
			}
			else if (colour.equals("CYAN"))
			{
				System.out.println(CYAN + word + RESET);
			}
			else if (colour.equals("PURPLE"))
			{
				System.out.println(PURPLE + word + RESET);
			}
			
		}

	//main game
		public void main()
		{
			if (error == 0)
			{
				g1.hangmanImage(error);
			}
			while (error < 6 && star.contains("*")) 
			{
				
				System.out.println("Chances left : " + (chances));
				System.out.println("GUESS ANY CHARACTER");
				System.out.println(star);
				String guess = in.next();
				getNewMystery(guess);
				results();
				if ( error == 6)
				{
					colour(colour);
					System.out.println("Chances available: 0");
				}
				win();
			}
		
		}

	//update guesses
	public void getNewMystery(String guess) 
	{
		newStar = "";
		for (int i = 0; i < word.length(); i++) 
		{
			if (star.charAt(i) != '*') 
			{
				newStar += word.charAt(i);
			} 
			else if (word.charAt(i) == guess.charAt(0)) 
			{
				newStar += guess.charAt(0);
			} 
			else 
			{
				newStar += "*";
			}
			
		}
	}
	
	//results
	public void results() 
	{
			if (star.equals(newStar)) 
			{
				error++;
				chances--;
				System.out.println(PBRIGHT + "Try again 💪" + RESET);
				g1.hangmanImage(error);
			} 
			else 
			{
				star = newStar;
				g1.hangmanImage(error);
			}
	}
		
	//check for success
	public void win()
	{
		if (star.equals(word)) {
			System.out.println("YOU SAVED A LIFE! JAVA-MAN THANKS YOU!");
			System.out.print(GREEN + "Correct! The word was " + RESET);
			colour(colour);
		}
	}
	
	//reset game to initial
	public void reset()
	{
		error = 0;
		chances = 6;
		collect = "";
		star = "";
	}
	
	//run game
	public void play()
	{
		r1 = new Record("H00415663", "Shar", "0");
		char decision;
		
		System.out.println(PURPLE + "WELCOME, EARTHLING. JAVA-MAN NEEDS YOUR HELP. SAVE STICKIE FROM DANGER BY PLAYING MY HANGMAN." + RESET);
			
			do
			{
				r1.getDetails();
				reset();
				getWord();
				getMystery();
				main();
				r1.printDetails();
				System.out.println(CYAN + "Retry?" + "\nPress C/c to continue: " + RESET);
				decision = in.next().charAt(0);
			
			}
			while (decision == 'c' || decision == 'C');
		System.out.println(PBRIGHT + "THANK YOU FOR PLAYING!" + RESET);
	}

}
