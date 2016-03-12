import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int b = 1; 
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String a = JOptionPane.showInputDialog("Name three keys that don't unlock a door?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (a.equalsIgnoreCase("monkey, turkey and donkey")) 
{
	JOptionPane.showMessageDialog(null, "correct!!!");
	System.out.println(b++);
}
else
{
JOptionPane.showMessageDialog(null, "sorry your uncorrect, the answer is monkey, turkey and donkey");	
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

