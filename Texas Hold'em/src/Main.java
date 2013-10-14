import model.*;
import view.*;
import view.Menu;

import java.awt.*;

import javax.swing.*;

public class Main {

	public static void main(String args[]) {
		
		Table game = new Table();
	
		GameArea GameArea = new GameArea(game);		
		game.addUI(GameArea);
		
		game.newGame(0, 4);


		JFrame frame = new JFrame("Texas Hold'em");
		Menu panel = new Menu(game);
		
		
		JMenuBar menuBar = panel.createMenuBar();
		frame.setJMenuBar(menuBar);
		frame.add(panel);
		frame.getContentPane().add(GameArea);

		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1280, 960);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.setMinimumSize(new Dimension(1100,800));
		
	}
	
		/*
		Table game = new Table();
		game.addPlayer();
		game.addPlayer();
		game.addPlayer();
		game.addPlayer();

		game.dealCards();
		game.firstCardsOnTable();
		game.addAditionalCardToTable();
		game.addAditionalCardToTable();
		System.out.print(game.toString());
*/
	}

