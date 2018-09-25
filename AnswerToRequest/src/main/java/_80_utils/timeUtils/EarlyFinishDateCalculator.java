package _80_utils.timeUtils;

import _30_producer.ProducerTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class EarlyFinishDateCalculator {


    public LocalDateTime calculateEarlyFinish(ProducerTime producer, Duration productionDuration) {

        LocalDateTime availableStart = producer.getAvailableStart();

        return availableStart.plus(productionDuration);
    }


}

