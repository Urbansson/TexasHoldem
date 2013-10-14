package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import view.PlayerChoices;

public class betListener implements ActionListener, ChangeListener{
	
	PlayerChoices choices;
		
	public betListener(PlayerChoices choices){
		this.choices = choices;
	}
	
	public void actionPerformed(ActionEvent ae) {	
		choices.getSliderValue();

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		choices.updateAmount();	
	}

}
