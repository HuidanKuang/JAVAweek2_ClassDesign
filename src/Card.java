import java.util.Arrays;
import java.util.List;

public class Card {
    private String faceName;
    private String suit;

    /**
     * This constructor takes 2 arguments, one for the face name and one for the suit. The value of the card assumes that aces are high and will dynamically establish the card value when the getCardValue() method is run.
     */
    public Card(String faceName, String suit)
    {
        setFaceName(faceName);
        setSuit(suit);
    }



    public String getFaceName() {
        return faceName;
    }

    public static List<String> getFaceNames(){
        return Arrays.asList("two","three","four","five","six","seven","eight","nine","ten","jack","queen","king","ace");
    }

    /**
     * This method will validate that the argument is in the collection of "two","three","four","five","six","seven","eight","nine","ten","jack","queen","king","ace" and set the instance variable
     * @param faceName - this is a String to represent the name of the card.
     */
    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();
        List<String> faceNames = getFaceNames();
        if (faceNames.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName + " is not valid. Use one of " + faceNames);

    }

    public String getSuit() {
            return suit;
    }

    public static List<String> getSuits()
    {
        return Arrays.asList("hearts","diamonds","spades","clubs");
    }

    /**
     * This method will validate that the argument is in the collection of "hearts","diamonds","spades","clubs".
     * @param suit - this is a String to represent the suit of the card.
     */

    public void setSuit(String suit) {
        suit = suit.toLowerCase();
        List<String> validSuits = getSuits();
        if (validSuits.contains((suit)))
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " is not valid. Use one of " + validSuits);
    }

    /**
     * This method will return the String "red" if the card's suit is hearts or diamonds,
     * black otherwise.
     * @return
     */

    public String getCardColour()
    {
        return (suit.equals("hearts") || suit.equals("diamonds")?"red":"black");
    }

    /**
     * This method will return the value of the card. 2 = 2, 3 = 3 ... jack = 11, queen = 12, king = 13, ace = 1.
     * @return
     */

    public int getFaceValue()
    {
        return getFaceNames().indexOf(faceName) + 2;
    }

    public String toString()
    {
        return faceName + " of " + suit;
    }
}
