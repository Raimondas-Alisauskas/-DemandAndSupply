package _80_utils.timeUtils;

import _30_producer.ProducerTime;
import _50_request.RequestTime;
import _60_proposal.Proposal;
import _60_proposal.ProposalTime;
import _80_utils.ProposalPopulator;

import java.time.LocalDateTime;
import java.util.List;

public class TimeListManager {

    public List<Proposal> addProposalToTimeFitProposalsList(List<Proposal> timeFitProposalsList, RequestTime request, ProducerTime producerTime, LocalDateTime earlyFinishDate ) {

        ProposalTime proposal = new ProposalTime();
        ProposalPopulator proposalPopulator = new ProposalPopulator();

        proposal.setEarlyFinishDate(earlyFinishDate);
        proposal = proposalPopulator.fillProposal(proposal, request, producerTime);

        timeFitProposalsList.add(proposal);

        return timeFitProposalsList;
    }
}
