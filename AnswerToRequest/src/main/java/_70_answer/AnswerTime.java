package _70_answer;

import _10_model.data.DASData;
import _30_producer.Producer;
import _50_request.Request;
import _60_proposal.Proposal;
import _80_utils.timeUtils.ProducerAvailabilityCalculator;
import _80_utils.timeUtils.ProductionDurationCalculator;

import java.time.Duration;
import java.util.List;


public class AnswerTime extends Answer{


    @Override
    public List<Proposal> makeListOfProposals(Request request, DASData<Producer> producersList) {
        ProductionDurationCalculator productionDurationCalculator = new ProductionDurationCalculator();
        ProducerAvailabilityCalculator producerAvailabilityCalculator = new ProducerAvailabilityCalculator();


        return null;
    }
}
