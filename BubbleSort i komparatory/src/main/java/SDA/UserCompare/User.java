package SDA.UserCompare;

import SDA.ToDoList.Priority;

public class User {
    Priority priorytet;
    int id;
    int age;
    String name;

    User(Priority priorytet, int age, String name, int id) {
        this.priorytet = priorytet;
        this.age = age;
        this.name = name;
        this.id =id;

    }


    public Priority getPriorytet() {
        return priorytet;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "priorytet=" + priorytet +
                ", id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
