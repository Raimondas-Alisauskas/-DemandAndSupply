package _80_utils.timeUtils;

import _30_producer.Producer;
import _30_producer.ProducerTime;
import _50_request.RequestTime;
import _60_proposal.Proposal;
import _60_proposal.ProposalTime;
import _80_utils.ProposalPopulator;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProposalTimeEvaluator {

    private ProductionDurationCalculator productionDurationCalculator;
    private ProducerAvailabilityCalculator producerAvailabilityCalculator;
    private Duration productionDuration;
    private boolean producerIsAvailable;
    private Producer producer;
    private ProducerTime producerTime;
//    private Request request;
    private RequestTime request;
    private List<Proposal> timeFitProposalsList;
    private ProposalPopulator proposalPopulator;
    private LocalDateTime earlyFinishDate;
    private boolean productionIsOnTime;


    public List<Proposal> getTimeFitProposalsList(RequestTime request, List<Producer> producersList) {
        this.request = request;
        productionDurationCalculator = new ProductionDurationCalculator();
        producerAvailabilityCalculator = new ProducerAvailabilityCalculator();
        timeFitProposalsList = new ArrayList<>();
        proposalPopulator = new ProposalPopulator();

        for (int i = 0; i < producersList.size(); i++) {

            producer = producersList.get(i);

            checkProducerTimeAvailability();

            if (producerIsAvailable) {
                checkProductionIsOnTime();

                if (productionIsOnTime) {
                    putProposalToTimeFitProposalsList();
                }
            }
        }
        return timeFitProposalsList;
     }


    private void checkProducerTimeAvailability() {
        // calculate productionDuration
        productionDuration = productionDurationCalculator.calcProductionDuration(request, producerTime);

        // calculate availability
       producerIsAvailable = producerAvailabilityCalculator.calculateProducerAvailability(producerTime, productionDuration);
    }


    private void checkProductionIsOnTime() {

        //calculate earlyFinishDate date of ProposalTime
        EarlyFinishDateCalculator earlyFinishDateCalculator = new EarlyFinishDateCalculator();
        earlyFinishDate = earlyFinishDateCalculator.calculateEarlyFinish(producerTime, productionDuration);

        //check Request's deadline
        LocalDateTime deadline = request.getDeadline();

        productionIsOnTime = earlyFinishDate.isBefore(deadline);
    }


    private void putProposalToTimeFitProposalsList() {
        //create empty Proposal
        ProposalTime proposal = new ProposalTime();

        //fill ProposalTime
        proposal.setEarlyFinishDate(earlyFinishDate);
        proposal = proposalPopulator.fillProposal(proposal, request, producerTime);

        //put Proposal to timeFitProposalsList list
        timeFitProposalsList.add(proposal);
    }

}

