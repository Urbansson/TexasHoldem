package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Table;

public class newGameListener implements ActionListener{
	
	Table table;
	
	public newGameListener(Table table){
		this.table = table;
	}
	
	public void actionPerformed(ActionEvent ae) {		
		table.newGame(0,4);
		table.play();
	}
}
