package _10_model.data;

import _70_answer.Answer;

public class AnswersDBFactory {

    private static DASData<Answer> dbInstance = null;

    public static DASData<Answer> getDbInstance(){


        if (dbInstance == null) {
            dbInstance = creteDbInstance();
        }
        return dbInstance;
    }

    private static DASData<Answer> creteDbInstance() {
        //config mode
        int mode = 0;//For static data mode

        switch (mode) {
            case 0:
                return new AnswersStaticDASData();
            default:
                break;
        }
        throw new RuntimeException("Not existing mode type");
    }
}
