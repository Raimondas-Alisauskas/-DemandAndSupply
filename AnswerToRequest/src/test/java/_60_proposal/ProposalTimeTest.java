package _60_proposal;

import _30_producer.Producer;
import _30_producer.ProducerTime;
import _50_request.Request;
import _50_request.RequestTime;
import _80_utils.timeUtils.EarlyFinishDateCalculator;
import _80_utils.timeUtils.ProducerAvailabilityCalculator;
import _80_utils.timeUtils.ProductionDurationCalculator;

import java.time.Duration;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class ProposalTimeTest {

    @org.junit.Test
    public void makeProposal() {

        Request requestTime = new RequestTime("6","2018-09-20");
        Producer producerTime = new ProducerTime("2","2018-09-01","2018-09-03","8","3");


        ProposalTime proposalTime = new ProposalTime();

        proposalTime.makeProposal(requestTime, producerTime);


    }
}