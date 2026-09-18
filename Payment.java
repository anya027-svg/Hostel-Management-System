public class Payment {

    private int studentId;
    private double amount;
    private String paymentDate;
    private String paymentMode;

    public Payment(int studentId, double amount, String paymentDate, String paymentMode) {

        this.studentId = studentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void displayPayment() {

        System.out.println("----------------------------");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Amount       : ₹" + amount);
        System.out.println("Payment Date : " + paymentDate);
        System.out.println("Payment Mode : " + paymentMode);
        System.out.println("----------------------------");
    }
}