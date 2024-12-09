import dto.RecordDTO;
import enums.Currency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import runtimeterror.personaltracker.enums.Currency;

import java.time.LocalDateTime;

public class RecordParamTest {
    @Test
    public void functionalTest(){
        Assertions.assertDoesNotThrow(() -> new RecordDTO("name", 10, Currency.CZK, LocalDateTime.now(), "note"));
    }

    @Test
    public void negativeValueTest(){
        Assertions.assertDoesNotThrow(() -> new RecordDTO("name", -10, Currency.CZK, LocalDateTime.now(), "note"));
    }

    @Test
    public void nameTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new RecordDTO("", 1, Currency.CZK, LocalDateTime.now(), "note"));
    }

    @Test
    public void zeroValueTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new RecordDTO("name", 0, Currency.CZK, LocalDateTime.now(), "note"));
    }
}
