package awslamda.handler;

import awslamda.model.Request;
import awslamda.model.Response;
import com.amazonaws.services.lambda.runtime.Context;

/**
 * Created by ninhdoan on 6/10/17.
 */
public class HttpHelloWorldHandler {

    public Response handleRequest(Request request, Context context) {

        String message = "Hi. I'm Ninh. Nice to meet you, " + request.getName();

        return new Response(message);
    }
}
