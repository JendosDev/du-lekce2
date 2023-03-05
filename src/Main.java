    import com.engeto.du_l02.Booking;
    import com.engeto.du_l02.Guest;
    import com.engeto.du_l02.Room;

    import java.time.LocalDate;
    import java.util.ArrayList;
    import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Guest> guestList = new ArrayList<>();
        guestList.add(new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13)));
        guestList.add(new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5)));

        System.out.println("Popis hostů:");
        System.out.println("Adéla Malíková je náš dlouhodobý a nejnávštěvovanější zákazník.");
        System.out.println("Jan Dvořáček jezdí každé léto k nám kvůli moři.\n");

        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(1));
        rooms.add(new Room(2));
        rooms.add(new Room(3));

        System.out.println("Popis pokojů:");
        System.out.println("pokoj číslo 1 a pokoj číslo 2 jsou jednolůžkové za cenu 1000 Kč/noc, s balkonem a výhledem na moře.");
        System.out.println("pokoj číslo 3 je trojlůžkový za cenu 2400 Kč/noc, bez balkónu, s výhledem na moře.\n");

        List<Booking> bookings = new ArrayList<>();
        bookings.add(new Booking(1, "Adéla Malíková", "", LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26)));
        bookings.add(new Booking(3, "Adéla Malíková", "Jan Dvořák", LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14)));
        System.out.println("Seznam rezervací:");
        System.out.println("pro Adélu na pokoj č. 1 od 19. do 26. 7. 2021.");
        System.out.println("pro oba (společná rezervace) na pokoj č. 3 od 1. do 14. 9. 2021.");
    }
}