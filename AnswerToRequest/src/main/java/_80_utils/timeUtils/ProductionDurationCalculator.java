package _80_utils.timeUtils;

import _30_producer.Producer;
import _30_producer.ProducerTime;
import _50_request.Request;
import _50_request.RequestTime;

import java.time.Duration;

public class ProductionDurationCalculator {

    public Duration calcProductionDuration(RequestTime request, ProducerTime producer) {

        long volumeUnit = request.getVolumeCM3();
        long processingSpeedUnitpH = producer.getProcessingSpeedCM3pH();
        Duration preparationTime = producer.getProgrammingTimeH();
        Duration deliveringTime = producer.getDeliveringTimeH();

        Duration executionTime = calcExecutionDuration(processingSpeedUnitpH, volumeUnit);

        return preparationTime.plus(executionTime.plus(deliveringTime));
    }


    private Duration calcExecutionDuration(long processingSpeedUnitpH, long volumeUnit) {

        long processingTimeH = volumeUnit / processingSpeedUnitpH;
        return Duration.ofHours(processingTimeH);








    }



}
