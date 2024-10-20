package creational.builder;

public class User {

    private final String firstname; //required
    private final String lastName; //required
    private final String address;
    private final String phone;
    private final int age;

    private User(UserBuilder builder) {
        this.firstname = builder.firstname;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "User: ["+this.firstname+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address+"]";
    }

    static class UserBuilder{
        private final String firstname;
        private final String lastName;
        private String address;
        private String phone;
        private int age;

        public UserBuilder(String firstname, String lastName){
            this.firstname = firstname;
            this.lastName = lastName;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
