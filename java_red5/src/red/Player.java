package red;

import java.util.SortedMap;

public class Player {
	Card[] card = new Card[25];

	public Card[] getCard() {
		return card;
	}

	public void setCard(Card[] card) {
		this.card = card;
	}
	
	public Player(SortedMap<Integer,String> people) {
		int i;
		for(i=0;i<25;i++){
			card[i] = new Card(people.lastKey(),people.get(people.lastKey()));
			people.remove(people.lastKey());
		}
	}
}
