import java.util.Arrays;

public class Main {
public static void main (String [] args) {
    BonusService service = new BonusService();
    int expected = 50;
    long actual = service.calculate (5000, false) ;
    System.out.println("1test "+ expected + "==?==" + actual);
    System.out.println();
    int expected2 = 150;
    long actual2 = service.calculate(5000, true);
    System.out.println("2test " + expected2 + "==?==" + actual2);
}
}
