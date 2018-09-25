package _80_utils.timeUtils;

import _30_producer.ProducerTime;
import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
import static org.junit.Assert.*;

public class EarlyFinishDateCalculatorTest {

    @Test
    public void calculateEarlyFinish() {

        EarlyFinishDateCalculator earlyFinishDateCalculator = new EarlyFinishDateCalculator();

        ProducerTime producer = new ProducerTime("0","2018-09-01","2001-01-01","0","0");
        Duration productionDuration1 = Duration.ofHours(23L);
        Duration productionDuration2 = Duration.ofHours(25L);
        LocalDateTime earlyFinish1 = (LocalDateTime.of(LocalDate.parse("2018-09-01"), LocalTime.of(23,00)));
        LocalDateTime earlyFinish2 = (LocalDateTime.of(LocalDate.parse("2018-09-02"), LocalTime.of(01,00)));


        /**
         * EarlyFinish =  availableStart.plus(productionDuration)
         */
        assertEquals (earlyFinish1, earlyFinishDateCalculator.calculateEarlyFinish(producer,productionDuration1));
        assertEquals (earlyFinish2, earlyFinishDateCalculator.calculateEarlyFinish(producer,productionDuration2));

    }
}