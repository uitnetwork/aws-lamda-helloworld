package awslamda.model;

import static java.time.LocalDateTime.now;

import java.time.LocalDateTime;

/**
 * Created by ninhdoan on 6/10/17.
 */
public class Response {

    private String message;

    private String time;

    public Response(String message) {
        this.message = message;
        this.time = now().toString();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
