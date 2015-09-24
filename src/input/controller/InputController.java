package input.controller;

import input.view.PopupDisplay;

public class InputController
{
	
	private PopupDisplay myPopups;
	
	public InputController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	{
		
		myPopups.showResponce("Look Words!");
		
	}
	
}
