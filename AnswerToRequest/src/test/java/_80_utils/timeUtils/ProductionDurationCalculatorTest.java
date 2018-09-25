package _80_utils.timeUtils;

import _30_producer.ProducerTime;
import _50_request.RequestTime;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.time.Duration;
import java.util.Collection;

import static org.junit.Assert.*;

public class ProductionDurationCalculatorTest {

    RequestTime requestTime;
    ProducerTime producerTime;

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void calcProductionDuration() {
        RequestTime requestTime = new RequestTime("100","2001-01-01");

        ProducerTime producerTime = new ProducerTime( "2", "2001-01-01",
                "2001-01-01" ,"8" ,"10" );

        ProductionDurationCalculator productionDurationCalculator = new ProductionDurationCalculator();

        /**
         *  executionTime = volumeUnit / processingSpeedUnitpH;
         *  productionDuration = preparationTime (programmingTime) + executionTime + deliveringTime
         *  2 + 100/10 + 8 = 20
         */
        assertEquals( Duration.ofHours( 2 + 100/10 + 8), productionDurationCalculator.calcProductionDuration(requestTime, producerTime));

    }
}