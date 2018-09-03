package _60_proposal;

import _80_utils.IdGenerator;

import java.time.LocalDateTime;

public class ProposalTime {

    private LocalDateTime availableStart;
    private LocalDateTime availableFinish;
    private LocalDateTime earlyFinish;

    public ProposalTime() {
    }

    public ProposalTime(LocalDateTime availableStart, LocalDateTime availableFinish, LocalDateTime earlyFinish) {
        this.availableStart = availableStart;
        this.availableFinish = availableFinish;
        this.earlyFinish = earlyFinish;
    }

    //getset
    public LocalDateTime getAvailableStart() {
        return availableStart;
    }

    public void setAvailableStart(LocalDateTime availableStart) {
        this.availableStart = availableStart;
    }

    public LocalDateTime getAvailableFinish() {
        return availableFinish;
    }

    public void setAvailableFinish(LocalDateTime availableFinish) {
        this.availableFinish = availableFinish;
    }

    public LocalDateTime getEarlyFinish() {
        return earlyFinish;
    }

    public void setEarlyFinish(LocalDateTime earlyFinish) {
        this.earlyFinish = earlyFinish;
    }
}
// TODO: Stage2
// list of dates for availableTime;
//    //price
//    private double proposalPrice;
//    //score
//    private int score;