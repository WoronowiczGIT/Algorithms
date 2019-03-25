package SDA.UserCompare;

import SDA.ToDoList.Priority;

import java.util.LinkedList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        ////#################### USEZRY ###################
        List<User> listaUserow = new LinkedList<>();
        listaUserow.add(new User(Priority.HIGH,24,"adas",11));
        listaUserow.add(new User(Priority.MED,84,"bartek",22));
        listaUserow.add(new User(Priority.LOW,32,"darek",3));
        listaUserow.add(new User(Priority.HIGH,85,"zenon",43));
        listaUserow.add(new User(Priority.MED,5,"cezary",5));

        for (User x: listaUserow
             ) {
            System.out.println(x.toString());
        }
        listaUserow.sort(new UserComparator().compareByName);
        listaUserow.sort(new UserComparator().compareById);
        System.out.println();
        for (User x: listaUserow
        ) {
            System.out.println(x.toString());
        }
    }
}
