package _30_producer;

import _10_model.data.DASData;
import _80_utils.IdGenerator;

import java.util.List;

public class Producer {

    private String producerId ;

    public Producer() {
        this.producerId = new IdGenerator().generateIdKey("Prd ");
    }

/*    //for calculations
    public Producer(int i, DASData<Producer> producersData) {
        this.producerId = new IdGenerator().generateIdKey("Prd ");
        this.producerScope = producersData.getData().get(i).getProducerScope();
        this.producerTime = producersData.getData().get(i).getProducerTime();
    }

    public Producer(int i, List<Producer> producers) {
        this.producerId = new IdGenerator().generateIdKey("Prd ");
        this.producerScope = producers.get(i).getProducerScope();
        this.producerTime = producers.get(i).getProducerTime();
    }

    //for manual data input
    public Producer( ProducerScope producerScope, ProducerTime producerTime) {
        this.producerId = new IdGenerator().generateIdKey("Prd ");
        this.producerScope = producerScope;
        this.producerTime = producerTime;
    }*/


//    public Producer( String producerId, ProducerScope producerScope, ProducerTime producerTime) {
//        this.producerId = producerId;
//        this.producerScope = producerScope;
//        this.producerTime = producerTime;
//    }

    public String getProducerId() {
        return producerId;
    }

    public void setProducerId(String producerId) {
        this.producerId = producerId;
    }

//    public ProducerScope getProducerScope() {
//        return producerScope;
//    }
//
//    public void setProducerScope(ProducerScope producerScope) {
//        this.producerScope = producerScope;
//    }
//
//    public ProducerTime getProducerTime() {
//        return producerTime;
//    }
//
//    public void setProducerTime(ProducerTime producerTime) {
//        this.producerTime = producerTime;
//    }
}

// TODO: Stage2
//    //price
//    private double materialCost; //
//    private double programmingRate; //
//    private double machineUsageRate; //
//    private double handlingCost; //
//    private double deliveringCost;  //