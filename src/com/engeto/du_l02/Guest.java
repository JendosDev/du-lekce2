import java.time.LocalDate;

public class Guest {
        private String name;
        private String lastname;
        private LocalDate bornDate;

        public Guest(String name, String lastname, LocalDate bornDate) {
            this.name = name;
            this.lastname = lastname;
            this.bornDate = bornDate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public LocalDate getBornDate() {
            return bornDate;
        }

        public void setBornDate(LocalDate bornDate) {
            this.bornDate = bornDate;
        }
    }
