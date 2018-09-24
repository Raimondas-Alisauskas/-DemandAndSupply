package _80_utils.timeUtils;

import _30_producer.Producer;
import _50_request.Request;

import java.time.Duration;

public class ProductionDurationCalculator {

    public Duration calcProductionDuration(Request request, Producer producer) {

        long volumeUnit = request.getRequestTime().getVolumeCM3();
        long processingSpeedUnitpH = producer.getProducerScope().getProcessingSpeedCM3pH();
        Duration preparationTime = producer.getProducerTime().getProgrammingTimeH();
        Duration deliveringTime = producer.getProducerTime().getDeliveringTimeH();

        Duration executionTime = calcExecutionDuration(processingSpeedUnitpH, volumeUnit);

        return preparationTime.plus(executionTime.plus(deliveringTime));
    }


    private Duration calcExecutionDuration(long processingSpeedUnitpH, long volumeUnit) {

        long processingTimeH = volumeUnit / processingSpeedUnitpH;
        return Duration.ofHours(processingTimeH);








    }



}
