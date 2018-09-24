package _50_request;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class RequestTime {

    private long volumeCM3;
    private LocalDateTime deadline;

    public RequestTime(long volumeCM3, LocalDateTime deadline) {
        this.volumeCM3 = volumeCM3;
        this.deadline = deadline;
    }


    public long getVolumeCM3() {
        return volumeCM3;
    }

    public void setVolumeCM3(long volumeCM3) {
        this.volumeCM3 = volumeCM3;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }



}
