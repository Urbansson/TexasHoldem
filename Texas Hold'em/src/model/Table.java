package model;

import view.*;
import java.util.ArrayList;

public class Table {
	GameArea gui;
	
	private Deck gameDeck;
	private ArrayList<Player> Players;
	private ArrayList<Card> board;
	private int pot;
	
	private final int MAXPLAYERS = 4;
	
	public Table(){
		gameDeck = new Deck();
		gameDeck.shuffleCards();
		Players = new ArrayList<Player>();
		board = new ArrayList<Card>();
		pot = 2323;
	}
	
	public void play(){
		dealCards();
		takebets();
		firstCardsOnTable();
		takebets();
		addAditionalCardToTable();
		takebets();
		addAditionalCardToTable();
		//checkWinnder();
	}
	
	public void addUI(GameArea gui){
		this.gui = gui;
	}
	
	public void takebets(){
		pot = Players.get(0).getBet();
	}
	
	public void newGame(int numberOfComputerplayers, int numberofRealPlayers){
		
		//addPlayer();
		//addPlayer();
		//addPlayer();
		//addPlayer();
		
		Players.add(new Player("Teddy", 600));
		Players.add(new Player("Teddy", 600));
		Players.add(new Player("Teddy", 600));
		Players.add(new Player("Teddy", 600));

		Players.get(0).addObserver(gui);
		Players.get(1).addObserver(gui);
		Players.get(2).addObserver(gui);
		Players.get(3).addObserver(gui);
		
		firstCardsOnTable();
	}
	
	public void addPlayer(){
		if(Players.size() < MAXPLAYERS){
			Players.add(new Player("Teddy", 600));
			Players.get((Players.size())).addObserver(gui);
		}
	}
	
	public Player getPlayer(int index){
		return Players.get(index);
	}
	
	public ArrayList<Player> getPlayers(){
		return Players;
	}
	
	public int getPot(){
		return pot;
	}
	
	
	public void dealCards(){
		for(int k = 0; k <2;k++){
			for(int i = 0; i < Players.size();i++){
				Players.get(i).addCardToHand(gameDeck.dealCard());
			}
		}
	}

	public void firstCardsOnTable(){
		for(int i = 0; i < 3;i++){
			board.add(gameDeck.dealCard());
		}
	}
	
	public void addAditionalCardToTable(){
		gameDeck.dealCard();
		board.add(gameDeck.dealCard());
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Card> getCardsOnTable(){
		return (ArrayList<Card>) board.clone();
	}

	public String toString(){
		String outPut = "";
		
		for(int i = 0; i < Players.size(); i++){
			outPut += Players.get(i).toString() +"\n";
		}
		
		outPut+="CARDS ON TABLE\n";
		for(int i = 0; i < board.size();i++){
			outPut += board.get(i).toString() + "\n";
		}
		return outPut;
	}	
}
