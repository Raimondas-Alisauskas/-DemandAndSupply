
import _10_model.data.*;
import _30_producer.Producer;
import _30_producer.ProducerTime;
import _50_request.Request;
import _70_answer.Answer;

import java.lang.reflect.Field;

public class TestRun {

    public static void main(String[] args) throws IllegalAccessException {

        DASData<Request> requestData = RequestsDBFactory.getDASInstance();
        DASData<Producer> producersData = ProducersDBFactory.getDbInstance();
        DASData<Answer> answersData = AnswersDBFactory.getDbInstance();

        test.java.TestDataPopulator testDataPopulator;
        testDataPopulator = new test.java.TestDataPopulator();

        App app = new App(requestData, producersData, answersData);
        app.runApp();

        for (int i = 0; i < requestData.getData().size(); i++) {
            System.out.println("Request:" );
            Request request = requestData.getData().get(i);
            printVariables(request);
//            RequestScope requestScope = requestData.getData().get(i).getRequestScope();
//            printVariables(requestScope);
//            RequestTime requestTime = requestData.getData().get(i).getRequestTime();
//            printVariables(requestTime);
//        }
//
//        List<Proposal> proposalsInAnswer = answersData.getData().get(0).getProposalsInAnswer();
//        for (int i = 0; i < proposalsInAnswer.size(); i++) {
//            System.out.println();
//            System.out.println("Proposal " + (i + 1) +" in Answer:" );
//            Proposal proposal = proposalsInAnswer.get(i);
//            printVariables(proposal);
//            ProposalTime proposalTime = proposalsInAnswer.get(i).getProposalTime();
//            printVariables(proposalTime);
//
//            System.out.println();
//            System.out.println("Producer in Proposal " + (i + 1) + ":" );
//            String producerId = proposalsInAnswer.get(i).getProducerId();
//            int index = 1 + producersData.getData().indexOf(producerId);
//            Producer producer = producersData.getData().get(index);
//            printVariables(producer);
//            ProducerScope producerScope = producersData.getData().get(index).getProducerScope();
//            printVariables(producerScope);
//            ProducerTime producerTime = producersData.getData().get(index).getProducerTime();
//            printVariables(producerTime);

        }

    }


    public static void printVariables (Object foo) throws IllegalAccessException {
        for (Field field : foo.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = field.get(foo);
            System.out.printf("%s: %s%n", name, value);
        }
    }


}


