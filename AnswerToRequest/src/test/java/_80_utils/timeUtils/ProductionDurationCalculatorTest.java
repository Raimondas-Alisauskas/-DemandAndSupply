package _80_utils.timeUtils;

import _10_model.input.RequestInput;
import _30_producer.ProducerTime;
import _50_request.Request;
import _50_request.RequestTime;
import _80_utils.RequestPopulator;
import org.junit.Test;

import java.time.Duration;

import static org.junit.Assert.*;

public class ProductionDurationCalculatorTest {

    @Test
    public void calcProductionDuration() {
        ProductionDurationCalculator productionDurationCalculator = new ProductionDurationCalculator();
        RequestPopulator requestPopulator = new RequestPopulator();
        RequestTime requestTime;
        requestTime = requestPopulator.fillTimeRequest(new RequestInput(" "," ",
                "","","6","2018-01-02"));


        ProducerTime producerTime = new ProducerTime( "2", "2018-01-01",
                "2018-01-02" ,"2" ,"3" );

        assertEquals( Duration.ofHours(6/3 + 2 + 2), productionDurationCalculator.calcProductionDuration(requestTime, producerTime));

    }
}