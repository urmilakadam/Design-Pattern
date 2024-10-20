package creational.builder;

public class BuilderMain {

    public static void main(String[] args) {
        User user = new User.UserBuilder("Jack", "Reacher")
                .address("Fake address 1234")
                .phone("345678345")
                .age(23)
                .build();

        User user1 = new User.UserBuilder("Tom", "Molar")
                .address("Fake address 5678")
                .age(23)
                .build();

        System.out.println(user);
        System.out.println(user1);

    }
}
