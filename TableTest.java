public class TableTest
{
	public TableTest()
	{
		assert test(new Table(3),  3);
		assert test(new Table(10),  10);
		try
		{
			Table T = new Table(10);
			T.deal(10);

			// Shouldnt be able to deal 70 cards
			assert fail();
		}
		catch(Exception error)
		{

		}
	}
	public boolean test(Table table, int playerNum)
	{
		boolean retVal = false; 

		if(table.numPlayers()==playerNum)
		{
			retVal = true;
		}

	
		return retVal;
	}


	private boolean fail()
	{
		// Dont have the junit framework installed
		System.out.println("Failed Test");
		return false;
	}
}