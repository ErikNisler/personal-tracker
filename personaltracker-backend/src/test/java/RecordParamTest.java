import enums.Currency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class RecordParamTest {
    @Test
    public void functionalTest(){
        Assertions.assertDoesNotThrow(() -> new Record("name", 10, Currency.CZK, LocalDateTime.now(), "note"));
    }

    @Test
    public void negativeValueTest(){
        Assertions.assertDoesNotThrow(() -> new Record("name", -10, Currency.CZK, LocalDateTime.now(), "note"));
    }

    @Test
    public void nameTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Record("", 1, Currency.CZK, LocalDateTime.now(), "note"));
    }

    @Test
    public void zeroValueTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Record("name", 0, Currency.CZK, LocalDateTime.now(), "note"));
    }
}
