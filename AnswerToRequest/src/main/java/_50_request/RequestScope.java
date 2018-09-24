package _50_request;

public class RequestScope {

    private long maxHeightMM;
    private long maxLengthMM;
    private long maxWidthMM;



    //for calculations
    public RequestScope(long maxHeightMM, long maxLengthMM, long maxWidthMM) {
        this.maxHeightMM = maxHeightMM;
        this.maxLengthMM = maxLengthMM;
        this.maxWidthMM = maxWidthMM;
    }

    //for manual input
    public RequestScope( String maxHeightMM, String maxLengthMM, String maxWidthMM) {
        this.maxHeightMM = Long.valueOf(maxHeightMM);
        this.maxLengthMM = Long.valueOf(maxLengthMM);
        this.maxWidthMM = Long.valueOf(maxWidthMM);
    }

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
