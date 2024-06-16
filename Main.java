import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

        public class Main {

            public static class PaymentRecord {
                private Date paymentDate;
                private double amount;

                public PaymentRecord(Date paymentDate, double amount) {
                    this.paymentDate = paymentDate;
                    this.amount = amount;
                }

                // Getters and setters
                public Date getPaymentDate() {
                    return paymentDate;
                }

                public double getAmount() {
                    return amount;
                }

                public void setPaymentDate(Date paymentDate) {
                    this.paymentDate = paymentDate;
                }

                public void setAmount(double amount) {
                    this.amount = amount;
                }
            }

            public static class SubscriptionType {
                private String name;
                private Date startDate;
                private Date endDate;

                public SubscriptionType(String name) {
                    this.name = name;
                }

                // Getters and setters
                public String getName() {
                    return name;
                }

                public Date getStartDate() {
                    return startDate;
                }

                public Date getEndDate() {
                    return endDate;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public void setStartDate(Date startDate) {
                    this.startDate = startDate;
                }

                public void setEndDate(Date endDate) {
                    this.endDate = endDate;
                }
            }

            public static class Student {
                private String name;
                private String universityId;
                private String program;
                private SubscriptionType subscriptionType;
                private List<PaymentRecord> paymentRecords;

                public Student(String name, String universityId, String program, SubscriptionType subscriptionType) {
                    this.name = name;
                    this.universityId = universityId;
                    this.program = program;
                    this.subscriptionType = subscriptionType;
                    this.paymentRecords = new ArrayList<>();
                }

                public void addPaymentRecord(PaymentRecord paymentRecord) {
                    paymentRecords.add(paymentRecord);
                }

                // Getters and setters
                public String getName() {
                    return name;
                }

                public String getUniversityId() {
                    return universityId;
                }

                public String getProgram() {
                    return program;
                }

                public SubscriptionType getSubscriptionType() {
                    return subscriptionType;
                }

                public List<PaymentRecord> getPaymentRecords() {
                    return paymentRecords;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public void setUniversityId(String universityId) {
                    this.universityId = universityId;
                }

                public void setProgram(String program) {
                    this.program = program;
                }

                public void setSubscriptionType(SubscriptionType subscriptionType) {
                    this.subscriptionType = subscriptionType;
                }

                public void setPaymentRecords(List<PaymentRecord> paymentRecords) {
                    this.paymentRecords = paymentRecords;
                }
            }

            private static void implementationWithFileBackup() throws IOException {
                // Create a sample student
                Student student = new Student("John Doe", "123456", "Computer Science", new SubscriptionType("Monthly"));

                // Set start and end dates for the subscription
                Calendar calendar = Calendar.getInstance();
                calendar.set(2024, Calendar.JANUARY, 1);
                Date startDate = calendar.getTime();
                calendar.set(2024, Calendar.JANUARY, 31);
                Date endDate = calendar.getTime();
                student.getSubscriptionType().setStartDate(startDate);
                student.getSubscriptionType().setEndDate(endDate);

                // Add payment records
                PaymentRecord paymentRecord1 = new PaymentRecord(new Date(), 10.0);
                PaymentRecord paymentRecord2 = new PaymentRecord(new Date(), 20.0);
                student.addPaymentRecord(paymentRecord1);
                student.addPaymentRecord(paymentRecord2);

                // Save student details to a file
                saveStudentToFile(student, "student_details.txt");

                // You can still implement other operations here with file backup
            }

            private static void saveStudentToFile(Student student, String filePath) throws IOException {
                try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
                    // Write student details to the file
                    writer.println("Name: " + student.getName());
                    writer.println("University ID: " + student.getUniversityId());
                    writer.println("Program: " + student.getProgram());
                    writer.println("Subscription Type: " + student.getSubscriptionType().getName());

                    writer.println("Payment Records:");
                    for (PaymentRecord paymentRecord : student.getPaymentRecords()) {
                        writer.println("  Payment Date: " + paymentRecord.getPaymentDate() +
                                ", Amount: " + paymentRecord.getAmount());
                    }
                }
            }

            public static void main(String[] args) {
                try {
                    // Sample implementation with file backup
                    implementationWithFileBackup();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            private static class DateUtils {
                public static Date parseDateString(String dateString) {
                    try {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        return dateFormat.parse(dateString);
                    } catch (ParseException e) {
                        throw new RuntimeException("Error parsing date: " + dateString, e);
                    }
                }
            }
        }