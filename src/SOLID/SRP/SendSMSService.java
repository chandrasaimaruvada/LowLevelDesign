package SOLID.SRP;

public class SendSMSService {

    public void sendSMS(Patient patient){
        // Send SMS
        System.out.println("SMS sent to family for " + patient.getName());
    }
}
