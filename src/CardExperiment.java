import java.util.ArrayList;
import java.util.Scanner;

public class CardExperiment {
    public static void main(String[] args) {
        //Datatype,variable name, calling the constructor and passing in System.in.
        Scanner keyboard = new Scanner(System.in);
        Card aceOfSpades = new Card("ace","spades");
        Card jesseOfMid = new Card("ten","diamonds");

        //jesseOfMid.setSuit("ace");
        System.out.println(aceOfSpades.getCardColour());

        //System.out.println(aceOfSpace);
        //System.out.println(jesseOfMid);
        System.out.printf("%s is a %s card with a value of %d.\n", aceOfSpades, aceOfSpades.getCardColour(), aceOfSpades.getFaceValue());
        System.out.printf("%s is a %s card with a value of %d.%n", jesseOfMid, jesseOfMid.getCardColour(), jesseOfMid.getFaceValue());

        //little experiment showing why we put datatype into our Lists or other data structure.
        ArrayList genericArrayList = new ArrayList();
        genericArrayList.add(1234);
        genericArrayList.add("Fred");
        genericArrayList.add(aceOfSpades);
        //it assumes that the datatype to be "Object".
        for (int i=0; i< genericArrayList.size(); i++)
            System.out.println(genericArrayList.get(i).getClass());

        ArrayList<Card> cardArrayList = new ArrayList<>();
        cardArrayList.add(aceOfSpades);
        cardArrayList.add(jesseOfMid);
        for (Card card: cardArrayList)
            System.out.println(card.getCardColour());

        //Create an instance of a DeckOfCards
        DeckOfCards deck = new DeckOfCards();
    }
}
