package java8.ex07;

import org.junit.Test;

import java.time.*;
import java.util.Calendar;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Exercice 07 - Instant
 */
public class DateAndTime_07_Test {

    @Test
    public void test_date_to_localdate() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, Calendar.FEBRUARY, 12);
        // TODO Créer une date Java 1 (12/02/2017)
        Date date = calendar.getTime();

        // TODO transformer la date en Instant
        Instant instant = date.toInstant();

        // TODO transformer la date en LocalDate
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
        LocalDate result = localDateTime.toLocalDate();

        // TODO valoriser les différentes variables afin de rendre le test passant

        assertThat(result.getYear(), is(2017));
        assertThat(result.getMonth(), is(Month.FEBRUARY));
        assertThat(result.getDayOfMonth(), is(12));

    }
}
