package _80_utils.scopeUtils;

import _10_model.data.DASData;
import _30_producer.Producer;
import _30_producer.ProducerScope;
import _30_producer.ProducerScopeTime;
import _50_request.Request;
import _50_request.RequestScope;
import _50_request.RequestScopeTime;

import java.util.ArrayList;
import java.util.List;


public class ProposalScopeEvaluator {

    private RequestScopeTime request;
    private Producer producer;
    private ProducerScope producerScope;
    private long requestMaxHeightMM;
    private long requestMaxLengthMM;
    private long requestMaxWidthMM;
    private long producerMaxHeightMM;
    private long producerMaxLengthMM;
    private long producerMaxWidthMM;
    private boolean producerFitToScope;
    private List<Producer> fitToScopeProducersList;


    public List<Producer> getScopeFitProducers(RequestScopeTime request, DASData<Producer> producersList) {
        this.request = request;
        fitToScopeProducersList = new ArrayList<>();

        for (int i = 0; i < producersList.getData().size(); i++) {
            producer = producersList.getData().get(i);

            checkIsProducerFitToScope();

            if (producerFitToScope) {
                putProducerToFitToScopeProducersList();
            }
        }
        return fitToScopeProducersList;
    }


    private void checkIsProducerFitToScope() {
        requestMaxHeightMM = request.getRequestScope().getMaxHeightMM();
        requestMaxLengthMM = request.getRequestScope().getMaxLengthMM();
        requestMaxWidthMM = request.getRequestScope().getMaxWidthMM();
        producerMaxHeightMM = producerScope.getMaxHeightMM();
        producerMaxLengthMM = producerScope.getMaxLengthMM();
        producerMaxWidthMM = producerScope.getMaxWidthMM();

        producerFitToScope =
                (requestMaxHeightMM <= producerMaxHeightMM)
                        && (requestMaxLengthMM <= producerMaxLengthMM)
                        && (requestMaxWidthMM <= producerMaxWidthMM);
    }


    private void putProducerToFitToScopeProducersList() {
        fitToScopeProducersList.add(producer);
    }
}
