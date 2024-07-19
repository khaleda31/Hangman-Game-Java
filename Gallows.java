
public class Gallow {
	private static final String 
	         red = "\033[0;31m",
			 green = "\033[0;32m", 
			 yellow = "\033[0;33m", 
			 blue = "\033[0;34m", 
			 pink = "\033[38;5;206m", 
			 cyan = "\033[0;36m", 
			 purple = "\033[0;35m", 
			 reset = "\u001B[0m";

	String word;
	
	public void hangmanImage(int error) {
		if (error == 0) 
		{
			System.out.println(yellow + "SAVE STICKIE. YOU HAS SIX CHANCES. 3,2,1, GO! 😶‍🌫️" + reset);
			System.out.println("\n   ____________" + 
			                    "\n   |\n" + 
			                      "   |\n" + 
			                      "   |\n" + 
			                      "   |\n" + 
			                      "   |\n" + 
			                      "   |\n" + 
			                      "   |" + 
			                    "\n___|___");
		}
		if (error == 1) 
		{
			System.out.println("   ____________");
			System.out.println("   |          " + yellow + "_" + reset + "|" + yellow + "_" + reset);
			System.out.println("   |         " + yellow + "/   \\" + reset);
			System.out.println("   |        " + yellow + "|     |" + reset);
			System.out.println("   |         " + yellow + "\\_ _/" + reset);
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (error == 2) 
		{
			System.out.println("   ____________");
			System.out.println("   |          " + yellow + "_" + reset + "|" + yellow + "_" + reset);
			System.out.println("   |         " + yellow + "/   \\" + reset);
			System.out.println("   |        " + yellow + "|     |" + reset);
			System.out.println("   |         " + yellow + "\\_ _/" + reset);
			System.out.println("   |           " + blue + "|" + reset);
			System.out.println("   |           " + blue + "|" + reset);
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (error == 3) 
		{
			System.out.println("   ____________");
			System.out.println("   |          " + yellow + "_" + reset + "|" + yellow + "_" + reset);
			System.out.println("   |         " + yellow + "/   \\" + reset);
			System.out.println("   |        " + yellow + "|     |" + reset);
			System.out.println("   |         " + yellow + "\\_ _/" + reset);
			System.out.println("   |           " + blue + "|" + reset);
			System.out.println("   |           " + blue + "|" + reset);
			System.out.println("   |          " + red + "  \\ " + reset);
			System.out.println("___|___      " + red + "    \\" + reset);
		}
		if (error == 4) 
		{
			System.out.println("   ____________");
			System.out.println("   |          " + yellow + "_" + reset + "|" + yellow + "_" + reset);
			System.out.println("   |         " + yellow + "/   \\" + reset);
			System.out.println("   |        " + yellow + "|     |" + reset);
			System.out.println("   |         " + yellow + "\\_ _/" + reset);
			System.out.println("   |           " + blue + "|" + reset);
			System.out.println("   |           " + blue + "|" + reset);
			System.out.println("   |          " + red + "/ \\ " + reset);
			System.out.println("___|___      " + red + "/   \\" + reset);
		}
		if (error == 5) 
		{
			System.out.println("   ____________");
			System.out.println("   |          " + yellow + "_" + reset + "|" + yellow + "_" + reset);
			System.out.println("   |         " + yellow + "/   \\" + reset);
			System.out.println("   |        " + yellow + "|     |" + reset);
			System.out.println("   |         " + yellow + "\\_ _/" + reset);
			System.out.println("   |           " + blue + "|" + reset);
			System.out.println("   |         " + blue + "/ |" + reset);
			System.out.println("   |          " + red + "/ \\ " + reset);
			System.out.println("___|___      " + red + "/   \\" + reset);
		}
		if (error == 6) 
		{
			System.out.println("   ____________");
			System.out.println("   |          " + yellow + "_" + reset + "|" + yellow + "_" + reset);
			System.out.println("   |         " + yellow + "/   \\" + reset);
			System.out.println("   |        " + yellow + "| X X |" + reset);
			System.out.println("   |         " + yellow + "\\_O_/" + reset);
			System.out.println("   |           " + blue + "|" + reset);
			System.out.println("   |         " + blue + "/ | \\" + reset);
			System.out.println("   |          " + red + "/ \\ " + reset);
			System.out.println("___|___      " + red + "/   \\" + reset);
			System.out.println("HE'S DEAD!");
			System.out.print("The word was ");
			
		}
	}
}
