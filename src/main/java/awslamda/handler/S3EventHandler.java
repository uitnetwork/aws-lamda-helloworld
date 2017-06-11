package awslamda.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.event.S3EventNotification;
import com.amazonaws.services.s3.event.S3EventNotification.S3EventNotificationRecord;

/**
 * Created by ninhdoan on 6/11/17.
 */
public class S3EventHandler {

    public void handleRequest(S3Event s3Event, Context context) {
        context.getLogger().log("Called with input: " + s3Event);
        context.getLogger().log("Event Type: " + s3Event.getRecords().size());
        s3Event.getRecords().stream().forEach(s3EventNotificationRecord -> this.printRecord(s3EventNotificationRecord, context));
    }

    private void printRecord(S3EventNotificationRecord s3EventNotificationRecord, Context context) {
        context.getLogger().log("EventName: " + s3EventNotificationRecord.getEventName());
        context.getLogger().log("Name: " + s3EventNotificationRecord.getS3().getBucket().getName());
        context.getLogger().log("UserIdentity: " + s3EventNotificationRecord.getUserIdentity());
        context.getLogger().log("ObjectKey: " + s3EventNotificationRecord.getS3().getObject().getKey());
        context.getLogger().log("ObjectSize: " + s3EventNotificationRecord.getS3().getObject().getSizeAsLong());
        context.getLogger().log("Owner: " + s3EventNotificationRecord.getS3().getBucket().getOwnerIdentity());
    }

}
