public class ReportsManager {

    private RoomManager roomManager;
    private PaymentManager paymentManager;
    private ComplaintManager complaintManager;

    public ReportsManager(
            RoomManager roomManager,
            PaymentManager paymentManager,
            ComplaintManager complaintManager) {

        this.roomManager = roomManager;
        this.paymentManager = paymentManager;
        this.complaintManager = complaintManager;
    }

    public void occupancyReport() {
        System.out.println("\n===== OCCUPANCY REPORT =====");
        roomManager.viewRooms();
    }

    public void paymentReport() {
        System.out.println("\n===== PAYMENT REPORT =====");
        paymentManager.viewPaymentHistory();
    }

    public void complaintReport() {
        System.out.println("\n===== COMPLAINT REPORT =====");
        complaintManager.viewComplaints();
    }
}