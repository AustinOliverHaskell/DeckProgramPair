public class CardTest
{
	public CardTest()
	{
		assert test(new Card(Card.suits.HEARTS, 12),  "Queen of Hearts");
		assert test(new Card(Card.suits.SPADES, 1),  "Ace of Spades");
		assert test(new Card(Card.suits.HEARTS, 30),  "Ace of Hearts");
		assert test(new Card(Card.suits.HEARTS, -1),  "Ace of Hearts");
	}

	public boolean test(Card card, String testCase)
	{
		boolean retVal = false; 

		retVal = card.toString().equals(testCase);
	
		return retVal;
	}
}