package _50_request;

public class RequestScopeTime extends Request{

    private RequestScope requestScope;
    private RequestTime requestTime;

//getset
    public RequestScope getRequestScope() {
        return requestScope;
    }

    public void setRequestScope(RequestScope requestScope) {
        this.requestScope = requestScope;
    }

    public RequestTime getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(RequestTime requestTime) {
        this.requestTime = requestTime;
    }
}
