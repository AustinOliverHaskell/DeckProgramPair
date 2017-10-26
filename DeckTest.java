public class DeckTest
{
	public DeckTest()
	{
        Deck deck = new Deck();
        assert(deck.getSize()==52);
        deck.dealACard();
        assert(deck.getSize() == 51);
        deck.dealAHand(5).toString();
        assert(deck.getSize() == 46);

	}
	public boolean test(Deck deck)
	{
		boolean retVal = false; 

	
		return retVal;
	}
}