package _70_answer;

import _10_model.data.DASData;
import _30_producer.Producer;
import _50_request.Request;
import _60_proposal.Proposal;
import _80_utils.IdGenerator;

import java.util.List;

public abstract class Answer {

    private String answerId = new IdGenerator().generateIdKey("Ans ");
    private List<Proposal> ProposalsInAnswer;

    public abstract List<Proposal> makeListOfProposals(Request request, DASData<Producer> producersList);


    public List<Proposal> getProposalsInAnswer() {
        return ProposalsInAnswer;
    }

    public void setProposalsInAnswer(List<Proposal> proposalsInAnswer) {
        this.ProposalsInAnswer = proposalsInAnswer;
    }
}
