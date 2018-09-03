package _10_model.data;

import _50_request.Request;

public class RequestsDBFactory {

    private static DASData<Request> dbInstance = null;

    public static DASData<Request>  getDASInstance(){


        if (dbInstance == null) {
            dbInstance = creteDbInstance();
        }
        return dbInstance;
    }

    private static DASData<Request>  creteDbInstance() {
        //config mode
        int mode = 0;//For static data mode

        switch (mode) {
            case 0:
                return new RequestsStaticDASData();
            default:
                break;
        }
        throw new RuntimeException("Not existing mode type");
    }
}
