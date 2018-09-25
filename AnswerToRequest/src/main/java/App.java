import _10_model.data.AnswersDBFactory;
import _10_model.data.DASData;
import _10_model.data.ProducersDBFactory;
import _10_model.data.RequestsDBFactory;
import _10_model.input.RequestInput;
import _30_producer.Producer;
import _50_request.Request;
import _50_request.RequestScopeTime;
import _50_request.RequestTime;
import _60_proposal.Proposal;
import _70_answer.Answer;
import _80_utils.RequestPopulator;
import _80_utils.scopeUtils.ProposalScopeEvaluator;
import _70_answer.AnswerTime;


import java.util.List;

class App {

    private DASData<Request> requestsData;
    private DASData<Producer> producersData;
    private DASData<Answer> answersData;

    //for tests
    App(DASData<Request> requestsData, DASData<Producer> producersData, DASData<Answer> answersData) {

        this.requestsData = requestsData;
        this.producersData = producersData;
        this.answersData = answersData;
    }

    // for general run
    App() {

        requestsData = RequestsDBFactory.getDASInstance();
        producersData = ProducersDBFactory.getDbInstance();
        answersData = AnswersDBFactory.getDbInstance();
    }

    void runApp() {

        //Receiving Request for production: Create RequestInput
        RequestInput requestInput = new RequestInput();

//        //Create empty Request
//        RequestTime request = new RequestTime();

        //fill the Request
        RequestPopulator requestPopulator = new RequestPopulator();
        RequestTime request = requestPopulator.fillTimeRequest(requestInput);

        //Put the Request in to requestsData
        requestsData.getData().add(request);

//        //Get scopeFitProposals
//        ProposalScopeEvaluator proposalScopeEvaluator = new ProposalScopeEvaluator();
//        List<Producer> scopeFitProducers = proposalScopeEvaluator.getScopeFitProducers(request, producersData);


        //Get timeFitProposals list which meets Request's time requirements
        AnswerTime answerTime = new AnswerTime(request, (List<Producer>) producersData);
//        List<Proposal> timeFitProposals = answerTime.makeListOfProposals(request, scopeFitProducers);

//        //Put timeFitProposals to Answer
//        Answer answer = new Answer();
//        answer.setProposalsInAnswer(timeFitProposals);

        //Put Answer to AnswersData
        answersData.getData().add(answerTime);


    }
}

// TODO: Stage1
//exeptions
//tests
// TODO:Stage2
//       check Producers for max dimmensions
//       Sort ProposalsStaticDASData acording to earlyFinish
//        If Client is new, create new Client id, put in to ClientDatabase
//        Create OutputToClient put Producer name, availale time, earlyFinish
//Give id to Answer
//       todo Stage3:
//        Receive ProducerInput
//        Check validity
//        Create ProducerId
//        Put to ProducersStaticDASData
//
//        Active/NotActive Producer, ProposalsStaticDASData