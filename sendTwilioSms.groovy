@Grab(group='com.twilio.sdk', module='twilio-java-sdk', version='3.4.6')
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

// Find your Account Sid and Token at twilio.com/user/account
ACCOUNT_SID = args[0]
AUTH_TOKEN = args[1]

client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

// Build a filter for the MessageList
params = new ArrayList<NameValuePair>();
params.add(new BasicNameValuePair("Body", "Hey!"));
params.add(new BasicNameValuePair("To", "+18594567890"));
params.add(new BasicNameValuePair("From", "+18594567890"));

messageFactory = client.getAccount().getMessageFactory();
message = messageFactory.create(params);
println message.getSid();
