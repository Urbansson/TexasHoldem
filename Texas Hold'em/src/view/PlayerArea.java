package view;

import java.awt.Insets;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

import model.Player;

public class PlayerArea extends JPanel{

	private static final ImageIcon CARD_PLACEHOLDER = new ImageIcon("images/card_placeholder.png");
	private static final ImageIcon CARD_BACK= new ImageIcon("images/card_back.png");

	private JLabel nameLabel;
	private JLabel cashLabel;
	private JLabel betLabel;
	private JLabel lastMove;
	private JLabel card1;
	private JLabel card2;
	
	Player player;
	
	//private String[][] infotext[][];

	public PlayerArea(){
		this.player = player;
		nameLabel = new JLabel();
		cashLabel = new JLabel();
		betLabel = new JLabel();
		lastMove = new JLabel();
		card1 = new JLabel(CARD_PLACEHOLDER);
		card2 = new JLabel(CARD_PLACEHOLDER);
		
        this.setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

		CustomizeLabel(nameLabel);
		nameLabel.setText(" " );
		
		CustomizeLabel(cashLabel);
		cashLabel.setText(" ");
		
		CustomizeLabel(lastMove);
		lastMove.setText(" ");
		
		CustomizeLabel(betLabel);
		betLabel.setText(" ");

		//Padding
        gc.insets = new Insets(5, 5, 5, 5);
		
        gc.gridx = 0;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.CENTER;
        gc.fill = GridBagConstraints.BOTH;
        add(nameLabel, gc);
        
        gc.gridx = 1;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.CENTER;
        gc.fill = GridBagConstraints.HORIZONTAL;
        add(cashLabel, gc);
        
        gc.gridx = 0;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.CENTER;
        gc.fill = GridBagConstraints.HORIZONTAL;
        add(lastMove, gc);
        
        gc.gridx = 1;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.CENTER;
        gc.fill = GridBagConstraints.HORIZONTAL;
        add(betLabel, gc);
        
        gc.gridx = 0;
        gc.gridy = 3;
        gc.anchor = GridBagConstraints.CENTER;
        gc.fill = GridBagConstraints.NONE;
        add(card1, gc);
        
        gc.gridx = 1;
        gc.gridy = 3;
        gc.anchor = GridBagConstraints.CENTER;
        gc.fill = GridBagConstraints.NONE;
        add(card2, gc);

	}	
	
	public void updatePlayer(){		
		CustomizeLabel(nameLabel);
		nameLabel.setText("Teddy ");
		
		CustomizeLabel(cashLabel);
		cashLabel.setText(" 23");
		
		CustomizeLabel(lastMove);
		lastMove.setText("3434 ");
		
		CustomizeLabel(betLabel);
		betLabel.setText("343 ");
	}

	public void showCards(){
		card1.setIcon(CARD_BACK); 
		card2.setIcon(CARD_BACK); 	
	}
	
	public void hideCards(){
		card1.setIcon(CARD_BACK); 
		card2.setIcon(CARD_BACK); 
	}
	
	private void CustomizeLabel(JLabel Label){
		Label.setText(" ");
		Label.setHorizontalAlignment(JLabel.CENTER);
		Label.setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	private static final long serialVersionUID = 1L;

}
