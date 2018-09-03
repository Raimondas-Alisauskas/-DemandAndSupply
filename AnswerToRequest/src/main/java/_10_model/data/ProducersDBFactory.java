package _10_model.data;

import _30_producer.Producer;

public class ProducersDBFactory {

    private static DASData<Producer> dbInstance = null;

    public static DASData<Producer> getDbInstance(){


        if (dbInstance == null) {
            dbInstance = creteDbInstance();
        }
        return dbInstance;
    }

    private static DASData<Producer> creteDbInstance(){
        //config mode
        int mode = 0;//For static data mode

       switch (mode){
           case 0:
               return new ProducersStaticDASData();
           default:
               break;
        }
        throw new RuntimeException("Not existing mode type");
    }
}
