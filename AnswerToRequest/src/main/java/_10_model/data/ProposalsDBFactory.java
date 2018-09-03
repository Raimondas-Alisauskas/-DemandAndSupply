package _10_model.data;

import _60_proposal.Proposal;

public class ProposalsDBFactory  {

    private static DASData<Proposal> dbInstance = null;

    public static DASData<Proposal> getDbInstance(){


        if (dbInstance == null) {
            dbInstance = creteDbInstance();
        }
        return dbInstance;
    }

    private static DASData<Proposal> creteDbInstance() {
        //config mode
        int mode = 0;//For static data mode

        switch (mode) {
            case 0:
                return new ProposalsStaticDASData();
            default:
                break;
        }
        throw new RuntimeException("Not existing mode type");
    }
}
