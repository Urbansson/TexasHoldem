package view;

import model.*;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GameArea extends JPanel implements Observer{

	Table table;
	TableView midTable;
	PlayerArea Player[] = new PlayerArea[4];
	
	
	public GameArea(Table table){
		this.table = table;
		midTable = new TableView(table);
		//this.setBackground(Color.blue);
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		
		for(int i = 0; i < Player.length; i++){
			Player[i] = new PlayerArea();
			//Player[i].setBackground(Color.blue);
		}
		
		//Padding
		gc.insets = new Insets(10, 10, 10, 10);

		//Mid table
		gc.gridx = 1;
		gc.gridy = 1;
        gc.anchor = GridBagConstraints.CENTER;
        gc.fill = GridBagConstraints.BOTH;
		this.add(midTable, gc);
		
		//Player areas
		gc.gridx = 1;
		gc.gridy = 2;
		this.add(Player[0],gc);
		gc.gridx = 1;
		gc.gridy = 0;
		this.add(Player[1],gc);
		gc.gridx = 0;
		gc.gridy = 1;
		this.add(Player[2],gc);
		gc.gridx = 2;
		gc.gridy = 1;
		this.add(Player[3],gc);

	}

	private static final long serialVersionUID = 1L;
	
	@Override
	public void update(Observable o, Object arg) {
		String msg = (String)arg;
		// TODO Auto-generated method stub
		if(o instanceof Player){
			System.out.println(msg);
		}
	
	}

}
