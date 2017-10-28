import java.util.*;
public class Table
{

	private ArrayList<ArrayList<Card>> players;
	private Deck deck;

	public Table(int playerNum)
	{
		players = new ArrayList<ArrayList<Card>>();
		deck = new Deck();
		for(int i = 0; i < playerNum; i++)
		{
			players.add(new ArrayList<Card>());
		}
	}
	public void deal(int numCards) throws DeckException
	{
		try
		{
			for(int i= 0; i < players.size();i++)
			{
				players.set(i, deck.dealAHand(numCards));
			}
		}
		catch(DeckException error)
		{
			throw error;
		}

	}
	public int numPlayers()
	{
		return players.size();
	}


}