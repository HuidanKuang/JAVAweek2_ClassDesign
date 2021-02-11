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
    }
}
