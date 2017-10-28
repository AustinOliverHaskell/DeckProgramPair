public class CardTest
{
	public CardTest()
	{
		try
		{
		assert test(new Card(Card.suits.HEARTS, 12),  "Queen of Hearts");
		assert test(new Card(Card.suits.SPADES, 1),  "Ace of Spades");
		new Card(Card.suits.HEARTS, 30);
		assert fail();
		
		} catch(Exception error)
		{

		}
		try
		{
			new Card(Card.suits.HEARTS, -1);
			assert fail();		}
		catch(Exception error)
		{

		}
		
	}

	public boolean test(Card card, String testCase)
	{
		boolean retVal = false; 

		retVal = card.toString().equals(testCase);
	
		return retVal;
	}
	public boolean fail()
	{
		System.out.println("Test Failed");
		return false;
	}
}