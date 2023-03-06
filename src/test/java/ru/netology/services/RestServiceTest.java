package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {
    
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")
    public void shouldCalcMonthsExact(int expected, int income, int expenses, int threshold) {
        RestService service = new RestService();
        int actual = service.restMonthsCalc(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
