import java.util.Scanner;

public class AppointmentBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Clinic Appointment Booking ===");

        System.out.print("Enter Patient Name: ");
        String patientName = sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        String doctorName = sc.nextLine();

        System.out.print("Enter Appointment Time: ");
        String time = sc.nextLine();

        System.out.println("\nAppointment Booked Successfully!");
        System.out.println("Patient : " + patientName);
        System.out.println("Doctor  : " + doctorName);
        System.out.println("Time    : " + time);

        sc.close();
    }
}