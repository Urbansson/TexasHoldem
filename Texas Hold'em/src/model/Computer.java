package model;
import java.io.Serializable;
import java.util.ArrayList;

/** Objects of this class represents 
 *	a AI player of the game 
 *	it is a extension of the player object
 *	It works by checking the highest bet and the cards
 *	and the points the player have and calculates what the best choice 
 *	is.
 */

public class Computer extends Player implements Serializable{

	int highestBet;
	ArrayList<Card> cardsOnTable = new ArrayList<Card>();
	HandEvaluator evaluate = new HandEvaluator();

	

	public Computer(String Name, int Points, int id){
		super(Name, Points, id);	
	}
	
	public int analyze(Table table){
		highestBet = table.findBiggestBet();
		cardsOnTable.clear();
		cardsOnTable.addAll(table.getCardsOnTable());
		
		//Only the two cards player have been dealed in the beginning of the game.
		if(cardsOnTable.size() == 0){
			checkFirstBettingRound();
		}
		
		//First three cards dealed out on the table
		if(cardsOnTable.size() == 3){
			checkSecondBettingRound();
		}

		//Four cards on the table
		if(cardsOnTable.size() == 4){
			
		}

		//Last round
		if(cardsOnTable.size() == 5){
			
		}
	
		
		return 0;
	}
	
	private void checkFirstBettingRound(){
		if(highestBet > 40){
			if(super.getHand().get(0).getRank().getCode()==super.getHand().get(1).getRank().getCode()){
				//Rise();
			}
			else if(super.getHand().get(0).getSuit().getCode()==super.getHand().get(1).getSuit().getCode()){
				//check();
			}
			else if(5 > super.getHand().get(0).getRank().getCode() - super.getHand().get(1).getRank().getCode() && -5 < super.getHand().get(0).getRank().getCode() - super.getHand().get(1).getRank().getCode()){
				//check();
			}
			else{
				//fold();
			}
		}
		else{
			//check();
		}
	}
	private void checkSecondBettingRound(){
		evaluate.Evaluate(cardsOnTable, this);
		
	}
	


	private static final long serialVersionUID = 1L;

}
