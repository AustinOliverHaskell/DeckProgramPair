public class Card
{
	public static enum suits
	{
		HEARTS,
		SPADES,
		CLUBS,
		DIAMONDS
	}

	private suits suit;
	private int   value;

	public Card(suits suit, int value)
	{
		this.suit = suit;
		this.value = value;
	}


	@Override
	public String toString()
	{
		String retVal;
		String s[] = {"Hearts", "Spades", "Clubs", "Diamonds"};

		retVal = valueToString();
		retVal += " of ";
		retVal += s[this.suit.ordinal()];
		System.out.println(retVal);

		return retVal;
	}
	
	private String valueToString()
	{
		String retVal;
		String faces[] = {"Jack", "Queen", "King"};
		if(value >= 11)
		{
			retVal = faces[value-11];
		} else if(value ==1)
		{
			retVal = "Ace";
		} else
		{
			retVal = Integer.toString(value);
		}
		return retVal;


	}
}