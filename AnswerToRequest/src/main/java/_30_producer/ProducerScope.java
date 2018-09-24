package _30_producer;

public class ProducerScope extends Producer{


    private long maxHeightMM;
    private long maxLengthMM;
    private long maxWidthMM;


    //for manual data input
    public ProducerScope(String maxHeightMM, String maxLengthMM, String maxWidthMM) {
        this.maxHeightMM = Long.valueOf(maxHeightMM);
        this.maxLengthMM = Long.valueOf(maxLengthMM);
        this.maxWidthMM = Long.valueOf(maxWidthMM);

    }


/*
    //for calculations
    public ProducerScope(int i, DASData<Producer> producersData) {
        this.maxHeightMM = producersData.getData().get(i).getProducerScope().getMaxHeightMM();
        this.maxLengthMM = producersData.getData().get(i).getProducerScope().getMaxLengthMM();
        this.maxWidthMM = producersData.getData().get(i).getProducerScope().getMaxWidthMM();
        this.processingSpeedCM3pH = producersData.getData().get(i).getProducerScope().getProcessingSpeedCM3pH();
    }
*/

    public long getMaxHeightMM() {
        return maxHeightMM;
    }

    public void setMaxHeightMM(long maxHeightMM) {
        this.maxHeightMM = maxHeightMM;
    }

    public long getMaxLengthMM() {
        return maxLengthMM;
    }

    public void setMaxLengthMM(long maxLengthMM) {
        this.maxLengthMM = maxLengthMM;
    }

    public long getMaxWidthMM() {
        return maxWidthMM;
    }

    public void setMaxWidthMM(long maxWidthMM) {
        this.maxWidthMM = maxWidthMM;
    }


}
