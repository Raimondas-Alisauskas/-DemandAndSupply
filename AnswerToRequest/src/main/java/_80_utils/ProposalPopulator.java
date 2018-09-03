package _80_utils;

import _30_producer.Producer;
import _50_request.Request;
import _60_proposal.Proposal;

public class ProposalPopulator {

    public Proposal fillProposal(Proposal proposal, Request request, Producer producer) {
        proposal.setRequestId(request.getRequestId());
        proposal.setProducerId(producer.getProducerId());
        proposal.getProposalTime().setAvailableStart(producer.getProducerTime().getAvailableStart());
        proposal.getProposalTime().setAvailableFinish(producer.getProducerTime().getAvailableFinish());
        return proposal;
    }

}
