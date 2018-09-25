package _70_answer;

import _30_producer.Producer;
import _30_producer.ProducerTime;
import _50_request.Request;
import _50_request.RequestTime;
import _60_proposal.Proposal;
import _80_utils.timeUtils.EarlyFinishDateCalculator;
import _80_utils.timeUtils.ProducerAvailabilityCalculator;
import _80_utils.timeUtils.ProductionDurationCalculator;
import _80_utils.timeUtils.TimeListManager;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AnswerTime extends Answer {

    private List<Proposal> timeFitProposalsList;

    public AnswerTime(Request request, List<Producer> producersList) {

        timeFitProposalsList = new ArrayList<>();
        RequestTime requestTime = (RequestTime) request;
        ProductionDurationCalculator productionDurationCalculator = new ProductionDurationCalculator();
        ProducerAvailabilityCalculator producerAvailabilityCalculator = new ProducerAvailabilityCalculator();
        EarlyFinishDateCalculator earlyFinishDateCalculator = new EarlyFinishDateCalculator();
        TimeListManager timeListManager = new TimeListManager();

        for (Producer producer : producersList) {

            ProducerTime producerTime = (ProducerTime) producer;

            Duration productionDuration = productionDurationCalculator.calcProductionDuration(requestTime, producerTime);
            boolean producerIsAvailable = producerAvailabilityCalculator.calculateProducerAvailability(producerTime, productionDuration);

            if (producerIsAvailable) {

                LocalDateTime earlyFinishDate = earlyFinishDateCalculator.calculateEarlyFinish(producerTime, productionDuration);
                LocalDateTime deadline = requestTime.getDeadline();
                boolean productionIsOnTime = earlyFinishDate.isBefore(deadline);

                if (productionIsOnTime) {
                    timeFitProposalsList = timeListManager.addProposalToTimeFitProposalsList(timeFitProposalsList, requestTime, producerTime, earlyFinishDate);
                }
            }
        }
    }

    @Override
    public List<Proposal> getProposalsList() {
        return timeFitProposalsList;
    }
}

