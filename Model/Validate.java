package Model;

public class Validate {

	public boolean validateFrom(String from)
	{
		String fra [] = {"Reykjavík","Akureyri","Ísafjörður","Egilsstaðir"};
		boolean check = false;
		
		for(int i=0;i<fra.length;i++)
		{
			check = check || ( from == fra[i] );
	    }

		
		return check;
	}
	
	public boolean validateTo(String To)
	{
		String til [] = {"Reykjavík","Akureyri","Ísafjörður","Egilsstaðir"};
		boolean check = false;
		
		for(int i=0;i<til.length;i++)
		{
			check = check || ( To == til[i] );
	    }

		
		return check;
	}
	
}
