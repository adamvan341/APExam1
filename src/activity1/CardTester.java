package activity1;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *
     * @param args is not used.
     */
    public static void main(String[] args) {
        Card c1, c2, c3;

        c1 = new Card("Q", "Hearts", 10);
        c2 = new Card("5", "Spades", 5);
        c3 = new Card("Q", "Hearts", 10);

        System.out.println(c1);

        if (c1.matches(c3)) {
            System.out.println("Cards 1 and 3 match");
        }
        if (c1.matches(c2)) {
            System.out.println("Cards 1 and 2 match");
        }
    }
}
