package chapter3_lambda.chapter3_6.method_reference.trifunction;

import java.util.Objects;

public class User {
    private String name;
    private int age;
    private String address;

    public User() {}

    public User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", address='" + address + '\'' +
            '}';
    }
}
