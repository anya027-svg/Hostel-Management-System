import java.util.ArrayList;

public class PaymentManager{

    private ArrayList<Payment> payments = new ArrayList<>();

    public void recordPayment(Payment payment) {

        payments.add(payment);

        System.out.println("Payment recorded successfully!");
    }

    public void viewPaymentHistory() {

        if (payments.isEmpty()) {

            System.out.println("No payment records found.");
            return;
        }

        System.out.println("\n===== PAYMENT HISTORY =====");

        for (Payment payment : payments) {

            payment.displayPayment();
        }
    }

    public void searchPayment(int studentId) {

        boolean found = false;

        for (Payment payment : payments) {

            if (payment.getStudentId() == studentId) {

                payment.displayPayment();
                found = true;
            }
        }

        if (!found) {

            System.out.println(
                    "No payment record found for Student ID: " + studentId
            );
        }
    }
}
