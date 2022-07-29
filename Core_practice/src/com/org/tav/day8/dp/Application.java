package com.org.tav.day8.dp;

public class Application {

	private Button button;
	private CheckBox checkbox;
	
	
	public Application(GUIFactory factory) {
		super();
		// TODO Auto-generated constructor stub
		
	   button = factory.createButton();
		
		checkbox = factory.createCheckbox();
	}
	
	public void paint() {
		button.paint();
		checkbox.paint();
	}
	
	
}
