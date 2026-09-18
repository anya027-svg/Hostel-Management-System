public class Complaint {

    private int studentId;
    private String complaintText;
    private String complaintDate;
    private String status;

    public Complaint(
            int studentId,
            String complaintText,
            String complaintDate) {

        this.studentId = studentId;
        this.complaintText = complaintText;
        this.complaintDate = complaintDate;
        this.status = "Pending";
    }

    public int getStudentId() {
        return studentId;
    }

    public String getComplaintText() {
        return complaintText;
    }

    public String getComplaintDate() {
        return complaintDate;
    }

    public String getStatus() {
        return status;
    }

    public void resolveComplaint() {

        status = "Resolved";
    }

    public void displayComplaint() {

        System.out.println("----------------------------");
        System.out.println("Student ID     : " + studentId);
        System.out.println("Complaint      : " + complaintText);
        System.out.println("Complaint Date : " + complaintDate);
        System.out.println("Status         : " + status);
        System.out.println("----------------------------");
    }
}
