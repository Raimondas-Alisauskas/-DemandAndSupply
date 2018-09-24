package _80_utils;

import _10_model.input.RequestInput;
import _50_request.Request;
import _50_request.RequestScope;
import _50_request.RequestTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class RequestPopulator {

    public Request fillRequest(RequestInput requestInput, Request request) {
        try {
            request.setClientId(requestInput.getClientId());
            long maxHeightMM = Long.valueOf(requestInput.getMaxHeightMM());
            long maxLengthMM = Long.valueOf(requestInput.getMaxLengthMM());
            long maxWidthMM = Long.valueOf(requestInput.getMaxWidthMM());
            long volumeCM3 = Long.valueOf(requestInput.getVolumeCM3());
            LocalDateTime deadline = (LocalDateTime.of(LocalDate.parse(requestInput.getDeadline()), LocalTime.MIDNIGHT));

            request.setRequestScope(new RequestScope(maxHeightMM, maxLengthMM, maxWidthMM));
            request.setRequestTime(new RequestTime(volumeCM3, deadline));

        } catch (NumberFormatException e) {
            System.out.println("Please do not leave empty requestInput data");
            throw e;
        } catch (DateTimeParseException e) {
            System.out.println("Please fill right date format in requestInput");
            throw e;
        }
        return request;
    }

}
