package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.*;

public class riseListener implements ActionListener{
	PlayerChoices choices;
	
	public riseListener(PlayerChoices choises){
		this.choices = choises;
	}
	
	public void actionPerformed(ActionEvent ae) {	
		choices.bet();
	}
}
