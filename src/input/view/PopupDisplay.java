package input.view;

import javax.swing.JOptionPane;
/**
 * A popup display class, Used for showing input and output.
 * @author Jared Kerr
 * @version 1.0 09/24/15
 */
public class PopupDisplay
{
	
	/**
	 * Displays the supplied text as a popup window.
	 * @param worsFromSomewhere The text to be displayed
	 */
	public void showResponse(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
		
	}
	
	/**
	 * Displays a popup with a field to type in a responce.
	 * @param stuff The text of the popup window.
	 * @return The users input as a string ata type.
	 */
	public String grabAnswer(String stuff)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, stuff);
		
		return answer;
	}
	
}
