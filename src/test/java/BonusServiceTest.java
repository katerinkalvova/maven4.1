import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @Test
    public void testNotRegisteredUnderLimit() {
        BonusService service = new BonusService();

        int expected = 50;
        long actual = service.calculate(5000, false);
        //System.out.println("1test "+ expected + "==?==" + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRegisteredUnderLimit() {
        BonusService service = new BonusService();

        int expected = 150;
        long actual = service.calculate(5000, true);
        //System.out.println("2test "+ expected + "==?==" + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRegisteredAboveLimit() {
        BonusService service = new BonusService();

        int expected = 500;
        long actual = service.calculate(50_000, true);
        //System.out.println("2test "+ expected + "==?==" + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNotRegisteredAboveLimit() {
        BonusService service = new BonusService();

        int expected = 500;
        long actual = service.calculate(50_000, false);
        //System.out.println("2test "+ expected + "==?==" + actual);
        Assertions.assertEquals(expected, actual);
    }

}
}
