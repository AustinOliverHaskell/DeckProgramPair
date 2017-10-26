import java.util.*;

public class Deck
{
	private ArrayList<Card> deck;
	

	Deck()
	{
		deck = new ArrayList<Card>();

		fill();

	}

	public void fill()
	{
		for (int value = 1; value <= 13; value++)
		{
			for (Card.suits suit : Card.suits.values())
			{
				deck.add(new Card(suit, value));
			}
		}
	}
	public int getSize()
	{
		return deck.size();
	}
	public void shuffle()
	{
		Random randNum = new Random();
		
		for(int i =0; i < deck.size(); i++)
		{
			Collections.swap(deck, i, randNum.nextInt(52));
		}
	}
	public void print()
	{
		for(int i =0; i< deck.size(); i++)
		{
			System.out.println(deck.get(i).toString());
		}
	}
	public Card dealACard()
	{
		return deck.remove(deck.size()-1);
	}
	public ArrayList<Card> dealAHand(int numCards)
	{
		ArrayList<Card> hand = new ArrayList<Card>();

		for (int i = 0; i < numCards; i++)
		{
			hand.add(dealACard());
		}

		return hand;
	}
}