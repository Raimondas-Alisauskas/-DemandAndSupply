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

public class ProposalTime extends Proposal {


//    //Producer data
//    private Duration programmingTimeH;
//    private LocalDateTime availableStart;
//    private LocalDateTime availableFinish;
//    private Duration deliveringTimeH;
//
//    // Request data
//    private long volumeCM3;
//    private LocalDateTime deadline;

    //Inputs
    private ProducerTime producerTime;
    private RequestTime requestTime;

    //Calculations
    private Duration productionDuration;
    private LocalDateTime earlyFinishDate;
    private boolean producerIsAvailable;
    private boolean productionIsOnTime;


    public ProposalTime() {
    }


    @Override
    public void makeProposal(Request requestTime, Producer producerTime) {

        checkProducerTimeAvailability();

        if (producerIsAvailable) {
            checkProductionIsOnTime();

        }

    }


    private void checkProducerTimeAvailability() {
        // calculate productionDuration
        ProductionDurationCalculator productionDurationCalculator;
        productionDurationCalculator = new ProductionDurationCalculator();
        productionDuration = productionDurationCalculator.calcProductionDuration(requestTime, producerTime);

        // calculate availability
        ProducerAvailabilityCalculator producerAvailabilityCalculator;
        producerAvailabilityCalculator = new ProducerAvailabilityCalculator();
        producerIsAvailable = producerAvailabilityCalculator.calculateProducerAvailability(producerTime, productionDuration);
    }

    private void checkProductionIsOnTime() {

        //calculate earlyFinishDate date of ProposalTime
        EarlyFinishDateCalculator earlyFinishDateCalculator;
        earlyFinishDateCalculator = new EarlyFinishDateCalculator();
        earlyFinishDate = earlyFinishDateCalculator.calculateEarlyFinish(producerTime, productionDuration);

        //check Request's deadline
        LocalDateTime deadline = requestTime.getDeadline();

        productionIsOnTime = earlyFinishDate.isBefore(deadline);
    }


    //getset
    public Producer getProducerTime() {
        return producerTime;
    }

    public void setProducerTime(ProducerTime producerTime) {
        this.producerTime = producerTime;
    }

    public RequestTime getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(RequestTime requestTime) {
        this.requestTime = requestTime;
    }

    public Duration getProductionDuration() {
        return productionDuration;
    }

    public void setProductionDuration(Duration productionDuration) {
        this.productionDuration = productionDuration;
    }

    public LocalDateTime getEarlyFinishDate() {
        return earlyFinishDate;
    }

    public void setEarlyFinishDate(LocalDateTime earlyFinishDate) {
        this.earlyFinishDate = earlyFinishDate;
    }

    public boolean isProducerIsAvailable() {
        return producerIsAvailable;
    }

    public void setProducerIsAvailable(boolean producerIsAvailable) {
        this.producerIsAvailable = producerIsAvailable;
    }

    public boolean isProductionIsOnTime() {
        return productionIsOnTime;
    }

    public void setProductionIsOnTime(boolean productionIsOnTime) {
        this.productionIsOnTime = productionIsOnTime;
    }


//    public Duration getProgrammingTimeH() {
//        return programmingTimeH;
//    }
//
//    public void setProgrammingTimeH(Duration programmingTimeH) {
//        this.programmingTimeH = programmingTimeH;
//    }
//
//    public LocalDateTime getAvailableStart() {
//        return availableStart;
//    }
//
//    public void setAvailableStart(LocalDateTime availableStart) {
//        this.availableStart = availableStart;
//    }
//
//    public LocalDateTime getAvailableFinish() {
//        return availableFinish;
//    }
//
//    public void setAvailableFinish(LocalDateTime availableFinish) {
//        this.availableFinish = availableFinish;
//    }
//
//    public Duration getDeliveringTimeH() {
//        return deliveringTimeH;
//    }
//
//    public void setDeliveringTimeH(Duration deliveringTimeH) {
//        this.deliveringTimeH = deliveringTimeH;
//    }
//
//    public long getVolumeCM3() {
//        return volumeCM3;
//    }
//
//    public void setVolumeCM3(long volumeCM3) {
//        this.volumeCM3 = volumeCM3;
//    }
//
//    public LocalDateTime getDeadline() {
//        return deadline;
//    }
//
//    public void setDeadline(LocalDateTime deadline) {
//        this.deadline = deadline;
//    }
}
