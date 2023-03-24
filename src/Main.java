    import com.engeto.du_l02.Booking;
    import com.engeto.du_l02.Guest;
    import com.engeto.du_l02.Room;

    import java.math.BigDecimal;
    import java.time.LocalDate;
    import java.util.*;

    import static com.engeto.du_l02.ListOfBookings.bookingList;

    public class Main {
        public static void main(String[] args) {
            // vytvoření hostů (Guest)
            Guest adelaMalik = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
            Guest janDvoracek = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
            System.out.println("Popis hostů:");
            System.out.println("Adéla Malíková je náš dlouhodobý a nejnávštěvovanější zákazník.");
            System.out.println("Jan Dvořáček jezdí každé léto k nám kvůli moři.\n");

            // vytvoření pokojů (Room)
            Room room1 = new Room(1, 1, true, true, BigDecimal.valueOf(1000));
            Room room2 = new Room(2, 1, true, true, BigDecimal.valueOf(1000));
            Room room3 = new Room(2, 1, true, true, BigDecimal.valueOf(2400));
            System.out.println("Popis pokojů:");
            System.out.println("pokoj číslo 1 a pokoj číslo 2 jsou jednolůžkové za cenu 1000 Kč/noc, s balkonem a výhledem na moře.");
            System.out.println("pokoj číslo 3 je trojlůžkový za cenu 2400 Kč/noc, bez balkónu, s výhledem na moře.\n");

            // Rezervace
            Booking booking1 = new Booking(
                    room1, adelaMalik, janDvoracek, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), true);
            Booking booking2 = new Booking(
                    room2, adelaMalik, null, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), false);
            List<Booking> listOfBookings = new ArrayList<>();
            listOfBookings.add(booking1);
            listOfBookings.add(booking2);

            for (Booking booking : listOfBookings) {
                System.out.println(booking1.getRoom().getRoomNumber() + ", "
                        + booking1.getGuest().getName() + ", " + booking1.getOtherGuests().getName() + ", " + booking1.getArrivalDate() + ", " + booking1.getDepartureDate() + ", " + booking1.isCompanyStay());
                System.out.println(
                        booking2.getRoom().getRoomNumber() + ", "
                                + booking2.getGuest().getName() + ", " + booking2.getArrivalDate() + ", " + booking2.getDepartureDate() + ", " + booking2.isCompanyStay()+"\n");
            }
                bookingList();
        }
    }