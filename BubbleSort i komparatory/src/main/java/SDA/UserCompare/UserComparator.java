package SDA.UserCompare;

import SDA.UserCompare.User;

import java.util.Comparator;

public class UserComparator {
    //klasa anonimowa!!
    Comparator<User> compareById = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            //compareTo -> NIE OBSLUGUJE TYPOW PRYMITYWNYCH
            return o1.getId()- (o2.getId());
        }
    };
    Comparator<User> compareByName = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            //compareTo -> NIE OBSLUGUJE TYPOW PRYMITYWNYCH
            return o1.getName().compareTo(o2.getName());
        }
    };


}
