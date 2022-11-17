package main;

public class Card {

/**
 * Card name.
 */	
private String name;
/**
 * Card type.
 */
private String cardType;



/**
 * Card constructor.
 * @param name Card name.
 * @param type Card type.
 */


public Card(String name,String cardType)
{
	this.name = name;
	this.cardType = cardType;
}

public String getName() {
	return name;
}

public String getImageLoc()
{
	return "res/"+name.toLowerCase()+".jpg";
}

/**
 * Plays card                           
 * @param            
 * @return 
 */
public void play()
{
	
}


/**
 * Sends card to Discard pile                           
 * @param            
 * @return 
 */
public void discard()
{
	
}


/**
 * Sends card back to Deck                           
 * @param            
 * @return 
 */
public void reshuffle()
{
	
}
}
