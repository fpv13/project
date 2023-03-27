public class PersonModClasses {

        private String firstName;
        private String lastName;

        public PersonModClasses(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        protected String getFirstName() {
            return firstName;
        }

        String getLastName() {
            return lastName;
        }

        protected String getFullName(){
            return firstName + " " + lastName;
        }
    }


