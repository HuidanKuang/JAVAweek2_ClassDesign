import java.util.Scanner;

public class CardExperiment {
    public static void main(String[] args) {
        //Datatype,variable name, calling the constructor and passing in System.in.
        Scanner keyboard = new Scanner(System.in);
        Card aceOfSpace = new Card("ace","spades");
        Card jesseOfMid = new Card("Jesse","diamonds");

        jesseOfMid.setSuit("Hearts");

        System.out.println(aceOfSpace);
        System.out.println(jesseOfMid);

    }
}
