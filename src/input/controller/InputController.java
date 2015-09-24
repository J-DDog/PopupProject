package input.controller;

import input.model.Thingy;
import input.view.PopupDisplay;

public class InputController
{
	
	private PopupDisplay myPopups;
	private Thingy myTestThingy;
	
	public InputController()
	{
		myPopups = new PopupDisplay();
		
	}
	
	/*
	 * The Program Starting Method.
	 */
	public void start()
	{
		
		String myName = myPopups.grabAnswer("Type in your name: ");
		myPopups.showResponse("You typed in: " + myName);
		
		String ageTemp = myPopups.grabAnswer("Type in your age: ");
		int myAge;
		if(isInteger(ageTemp))
		{
			myAge = Integer.parseInt(ageTemp);
		}
		else
		{
			myAge = -9999999;
		}
		
		myPopups.showResponse("You typed in: " + myAge);
		
		String weightTemp = myPopups.grabAnswer("Type in your weight: ");
		double myWeight;
		if(isDouble(ageTemp))
		{
			myWeight = Double.parseDouble(weightTemp);
		}
		else
		{
			myWeight = -9999999;
		}
		
		myPopups.showResponse("You typed in: " + myWeight);
		
		myTestThingy = new Thingy();
	}
	
	/*
	 * Check if string can be converted to integer.
	 */
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int myAge = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not an int - bad value will be used");
		}
		
		return isInt;
	}
	
	/*
	 * Check if string can be converted to double.
	 */
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double myWeight = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not a double = bad value will be used");
		}
		
		return isDouble;
	}
	
}
