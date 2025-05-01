package SOLID.SRP;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Manipal", "ABC");
        SendSMSService sendSMSService = new SendSMSService();
        PatientAdmissionService patientAdmissionService = new PatientAdmissionService(sendSMSService);
        patientAdmissionService.admitPatient(patient);
    }
}
