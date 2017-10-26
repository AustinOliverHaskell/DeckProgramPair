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
		if ((value <= 13) && (value > 0))
		{
			this.value = value;
		}
		else
		{
			this.value = 1;
		}

		this.suit = suit;
	}


	@Override
	public String toString()
	{
		String retVal;
		String s[] = {"Hearts", "Spades", "Clubs", "Diamonds"};

		retVal = valueToString();
		retVal += " of ";
		retVal += s[this.suit.ordinal()];
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