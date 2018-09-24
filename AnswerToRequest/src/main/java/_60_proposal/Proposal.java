package _60_proposal;

import _30_producer.Producer;
import _50_request.Request;
import _80_utils.IdGenerator;

import java.util.List;

public abstract class Proposal {


    private String proposalId;
    private String requestId;
    private String producerId;

    public Proposal() {
        this.proposalId =  new IdGenerator().generateIdKey("Prp ");
    }

    public abstract void makeProposal(Request request, Producer producer);



    public String getProposalId() {
        return proposalId;
    }

    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getProducerId() {
        return producerId;
    }

    public void setProducerId(String producerId) {
        this.producerId = producerId;
    }

}
// TODO: Stage2
// list of dates for availableTime;
//    //price
//    private double proposalPrice;
//    //score
//    private int score;