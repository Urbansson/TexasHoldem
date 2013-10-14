package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.PlayerChoices;

public class cancelListener implements ActionListener{
	PlayerChoices choices;
	
	public cancelListener(PlayerChoices choices){
		this.choices = choices;
	}
	
	public void actionPerformed(ActionEvent ae) {		
		choices.makeChoise();
	}
}
