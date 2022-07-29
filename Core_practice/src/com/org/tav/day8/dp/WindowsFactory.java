package com.org.tav.day8.dp;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

	@Override
	public CheckBox createCheckbox() {
		// TODO Auto-generated method stub
		return new WindowsCheckbox();
	}

}
