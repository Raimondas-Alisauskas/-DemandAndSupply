package _10_model.input;

public class RequestInput {

    //id
    private String clientId;
    //scope
    private String maxHeightMM;
    private String maxLengthMM;
    private String maxWidthMM;
    //time
    private String volumeCM3;
    private String deadline;


    public RequestInput() {
        clientId = "Client";
        maxHeightMM = "100";
        maxLengthMM = "100";
        maxWidthMM = "50";
        volumeCM3 = "100";
        deadline = "2018-09-15";
    }

    //getset

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getMaxHeightMM() {
        return maxHeightMM;
    }

    public void setMaxHeightMM(String maxHeightMM) {
        this.maxHeightMM = maxHeightMM;
    }

    public String getMaxLengthMM() {
        return maxLengthMM;
    }

    public void setMaxLengthMM(String maxLengthMM) {
        this.maxLengthMM = maxLengthMM;
    }

    public String getMaxWidthMM() {
        return maxWidthMM;
    }

    public void setMaxWidthMM(String maxWidthMM) {
        this.maxWidthMM = maxWidthMM;
    }

    public String getVolumeCM3() {
        return volumeCM3;
    }

    public void setVolumeCM3(String volumeCM3) {
        this.volumeCM3 = volumeCM3;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}

// TODO: Stage2
//    //price
//    private String maxPrice;
//
//    //priorities
//    private String timePriority;
//    private String pricePriority;

//        maxPrice = "200";
////        timePriority = "30";
////        pricePriority = "70";