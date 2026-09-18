import java.util.ArrayList;

public class ComplaintManager {

    private ArrayList<Complaint> complaints =
            new ArrayList<>();

    // Submit complaint
    public void submitComplaint(Complaint complaint) {

        complaints.add(complaint);

        System.out.println(
                "Complaint submitted successfully!"
        );
    }

    // View complaints
    public void viewComplaints() {

        if (complaints.isEmpty()) {

            System.out.println(
                    "No complaints found."
            );

            return;
        }

        System.out.println(
                "\n===== ALL COMPLAINTS ====="
        );

        for (Complaint complaint : complaints) {

            complaint.displayComplaint();
        }
    }

    // Search complaint
    public void searchComplaint(int studentId) {

        boolean found = false;

        for (Complaint complaint : complaints) {

            if (complaint.getStudentId() == studentId) {

                complaint.displayComplaint();

                found = true;
            }
        }

        if (!found) {

            System.out.println(
                    "No complaint found for Student ID: "
                            + studentId
            );
        }
    }

    // Resolve complaint
    public void resolveComplaint(int studentId) {

        boolean found = false;

        for (Complaint complaint : complaints) {

            if (complaint.getStudentId() == studentId) {

                complaint.resolveComplaint();

                System.out.println(
                        "Complaint resolved successfully!"
                );

                found = true;

                break;
            }
        }

        if (!found) {

            System.out.println(
                    "No complaint found for Student ID: "
                            + studentId
            );
        }
    }

    // Count complaints
    public int getComplaintCount() {

        return complaints.size();
    }
}