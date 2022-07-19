import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.Dz_5_1.service.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource (files = "src/test/resources/numberSqr.csv")
    public void enterTheBorder(int expected, int lowerBound, int upperBound) {
        SQRService service = new SQRService();
        int actual = service.numberOfSqr(lowerBound, upperBound);
        Assertions.assertEquals(expected, actual);
    }
    /*
    @Test
    public void enterTheBorder() {
        int expected = 3;
        SQRService service = new SQRService();
        int actual = service.numberOfSqr(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notEnterTheBorder() {
        int expected = 0;
        SQRService service = new SQRService();
        int actual = service.numberOfSqr(10, 99);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void allEnterTheBorder() {
        int expected = 90;
        SQRService service = new SQRService();
        int actual = service.numberOfSqr(100, 9801);
        Assertions.assertEquals(expected, actual);
    }
    */
}
