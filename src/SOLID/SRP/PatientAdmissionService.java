package SOLID.SRP;

public class PatientAdmissionService {

    private final SendSMSService sendSMSService;

    public PatientAdmissionService(SendSMSService sendSMSService) {
        this.sendSMSService = sendSMSService;
    }

    public void admitPatient(Patient patient) {

        // Admission logic
        System.out.println(patient.getName() + " admitted to hospital in " + patient.getHospital());

        sendSMSService.sendSMS(patient);

    }
}
