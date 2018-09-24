package _80_utils;

import _10_model.input.RequestInput;
import _50_request.Request;
import _50_request.RequestScope;
import _50_request.RequestScopeTime;
import _50_request.RequestTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class RequestPopulator {


    public RequestScope fillScopeRequest(RequestInput requestInput) {
        RequestScope requestScope;
//        try {
        long maxHeightMM = Long.valueOf(requestInput.getMaxHeightMM());
        long maxLengthMM = Long.valueOf(requestInput.getMaxLengthMM());
        long maxWidthMM = Long.valueOf(requestInput.getMaxWidthMM());

        requestScope = new RequestScope(maxHeightMM, maxLengthMM, maxWidthMM);
        requestScope.setClientId(requestInput.getClientId());


//        } catch (NumberFormatException e) {
//            System.out.println("Please do not leave empty requestInput data");
//            throw e;
//        } catch (DateTimeParseException e) {
//            System.out.println("date format is not right in requestInput");
//            throw e;
//        }
        return requestScope;
    }


    public RequestTime fillTimeRequest(RequestInput requestInput) {
        RequestTime requestTime;
//        try {
        long volumeCM3 = Long.valueOf(requestInput.getVolumeCM3());
        LocalDateTime deadline = (LocalDateTime.of(LocalDate.parse(requestInput.getDeadline()), LocalTime.MIDNIGHT));

        requestTime = new RequestTime(volumeCM3, deadline);
        requestTime.setClientId(requestInput.getClientId());

//        } catch (NumberFormatException e) {
//            System.out.println("Please do not leave empty requestInput data");
//            throw e;
//        } catch (DateTimeParseException e) {
//            System.out.println("Please fill right date format in requestInput");
//            throw e;
//        }
        return requestTime;
    }
}
