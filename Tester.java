import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		
		Game g1 = new Game();
		g1.addWord("switch", "RED");
		g1.addWord("boolean", "GREEN");		
		g1.addWord("object", "YELLOW");		
		g1.addWord("double", "BLUE");		
		g1.addWord("import", "PBRIGHT");		
		g1.addWord("public", "CYAN");		
		g1.addWord("return", "PURPLE");		
		g1.addWord("syntax", "YELLOW");		
		g1.addWord("static", "PBRIGHT");		
		g1.addWord("export", "CYAN");				
		
		g1.play();
		
		
	}

}
