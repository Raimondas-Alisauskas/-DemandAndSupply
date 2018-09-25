package _80_utils.timeUtils;

import _30_producer.ProducerTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class ProducerAvailabilityCalculator {

    // availability evaluated for 24/7 ProducerTime's worktime
    public boolean calculateProducerAvailability(ProducerTime producer, Duration productionDuration) {

        LocalDateTime availableStart = producer.getAvailableStart();
        LocalDateTime availableFinish = producer.getAvailableFinish();

        return availableStart.plus(productionDuration).isBefore(availableFinish);
    }

}
