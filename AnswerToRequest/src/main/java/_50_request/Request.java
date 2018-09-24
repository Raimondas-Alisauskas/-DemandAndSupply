package _50_request;

import _80_utils.IdGenerator;

public class Request {

    private String requestId;
    private String clientId;

    //empty Request
    public Request() {
        this.requestId = new IdGenerator().generateIdKey("Rkw ");
    }


    //getset
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

}


//    todo  Stage2
//    Create new Client if Client is new
//    //price
//    private double maxPrice; //
//
//    //priorities
//    private double prioritiesTime; //
//    private double prioritiesPrice;  //




