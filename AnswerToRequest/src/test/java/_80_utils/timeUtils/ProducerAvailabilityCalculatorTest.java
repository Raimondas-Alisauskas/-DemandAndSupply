package _80_utils.timeUtils;

import _30_producer.ProducerTime;
import org.junit.Test;

import java.time.Duration;

import static org.junit.Assert.*;

public class ProducerAvailabilityCalculatorTest {

    @Test
    public void calculateProducerAvailability() {
        ProducerAvailabilityCalculator producerAvailabilityCalculator = new ProducerAvailabilityCalculator();

        ProducerTime producerTime = new ProducerTime( "2", "2018-09-01",
                "2018-09-02","2", "2");
        Duration productionDuration1 = Duration.ofHours(23L);
        Duration productionDuration2 = Duration.ofHours(24L);

        /**
         * ProducerAvailability is true if availableStart.plus(productionDuration).isBefore(availableFinish)
         */
        assertTrue(producerAvailabilityCalculator.calculateProducerAvailability(producerTime, productionDuration1));
        assertFalse(producerAvailabilityCalculator.calculateProducerAvailability(producerTime, productionDuration2));

    }
}