public class CardTest
{
	public CardTest()
	{
		assert test(new Card(Card.suits.HEARTS, 12),  "Queen of Hearts");
		assert test(new Card(Card.suits.SPADES, 1),  "Ace of Spades");
		assert test(new Card(Card.suits.HEARTS, 30),  "Queen of Hearts");
		assert test(new Card(Card.suits.HEARTS, -1),  "Queen of Hearts");
	}

	public boolean test(Card card, String testCase)
	{
		boolean retVal = false; 

		
			retVal = card.toString().equals(testCase);
			System.out.println(retVal);
		

		return retVal;
	}
}