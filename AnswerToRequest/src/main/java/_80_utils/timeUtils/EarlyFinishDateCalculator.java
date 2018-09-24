package _80_utils.timeUtils;

import _30_producer.Producer;
import _30_producer.ProducerTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class EarlyFinishDateCalculator {


    public LocalDateTime calculateEarlyFinish(ProducerTime producer, Duration productionDuration) {

        LocalDateTime availableStart = producer.getAvailableStart();
        Duration deliveringTime = producer.getDeliveringTimeH();

        return availableStart.plus(productionDuration).plus(deliveringTime);
    }


}

