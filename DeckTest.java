public class DeckTest
{
	public DeckTest()
	{
		try
		{
	        Deck deck = new Deck();
	        assert(deck.getSize()==52);
	        deck.dealACard();
	        assert(deck.getSize() == 51);
	        deck.dealAHand(5).toString();
	        assert(deck.getSize() == 46);

        	//deck.dealAHand(55);
    	}
    	catch (DeckException error)
    	{
    		error.printStackTrace();
    	}

	}
	
}