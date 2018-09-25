package test.java;

import _10_model.data.DASData;
import _10_model.data.ProducersDBFactory;
import _30_producer.Producer;
import _30_producer.ProducerTime;


public class TestDataPopulator {

    DASData<ProducerTime> producersTimeData;
    DASData<Producer> producersDASData;


    public TestDataPopulator() {
        //       this.producersTimeData = ProducersDBFactory.getDbInstance();
        this.producersDASData = ProducersDBFactory.getDbInstance();

//        producersDASData.getData().add(new Producer
//                (new ProducerScope("200", "100", "100", "2"),
//                        new ProducerTime("2", "2018-09-01", "2018-10-15", "24")));
//        producersDASData.getData().add(new Producer
//                (new ProducerScope("100", "100", "100", "2"),
//                        new ProducerTime("2", "2018-09-01", "2018-10-15", "12")));
//        producersDASData.getData().add(new Producer
//                (new ProducerScope("300", "50", "50", "2"),
//                        new ProducerTime("2", "2018-09-01", "2018-10-15", "24")));
//        producersDASData.getData().add(new Producer
//                (new ProducerScope("50", "50", "50", "1"),
//                        new ProducerTime("2", "2018-10-01", "2018-11-15", "24")));
//        producersDASData.getData().add(new Producer
//                (new ProducerScope("100", "50", "50", "1"),
//                        new ProducerTime("2", "2018-09-01", "2018-09-15", "24")));

    }
}

