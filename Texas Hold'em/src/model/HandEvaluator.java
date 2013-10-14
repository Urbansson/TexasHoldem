package model;

import java.util.ArrayList;
import java.util.Collections;

public class HandEvaluator {
	
	ArrayList<Card> Cards;
	
	public HandEvaluator(){
		
	}
	
	public void Evaluate(ArrayList<Card> CardsOnTable, Player Player){
		Cards.addAll(CardsOnTable);
		Cards.addAll(Player.getHand());
		Collections.sort(Cards,new CompareRank());

		findPair();
		findTwoPairs();
		findTriss();
	}
	
	private int findPair(){
		
		for(int i = 0; i < Cards.size()-1;i++){
			if(Cards.get(i).getRank().getCode() == Cards.get(i+1).getRank().getCode()){
				return Cards.get(i).getRank().getCode();
			}
		}
		return 0;
	}
	
	private int findTwoPairs(){
		int pairRank = 0;
		boolean pairFound = false;
		
		for(int i = 0; i < Cards.size();i++){
			if(Cards.get(i).getRank().getCode() == Cards.get(i+1).getRank().getCode()){
				if(!pairFound){
					pairRank = Cards.get(i).getRank().getCode();
				}else{
					if(pairRank != Cards.get(i).getRank().getCode()){
						if(pairRank < Cards.get(i).getRank().getCode()){
							return Cards.get(i).getRank().getCode();
						}else{
							return pairRank;
						}
					}
				}
			}
		}

		return 0;
	}
	
	private int findTriss(){
		
		for(int i = 0; i < Cards.size()-2;i++){
			if(Cards.get(i).getRank().getCode() == Cards.get(i+1).getRank().getCode()){
				if(Cards.get(i+1).getRank().getCode() == Cards.get(i+2).getRank().getCode()){
					return Cards.get(i).getRank().getCode();
				}			
			}
		}
		return 0;
	}

	
	

}
 