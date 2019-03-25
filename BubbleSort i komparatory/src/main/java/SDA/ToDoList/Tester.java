package SDA.ToDoList;

public class Tester {
    public static void main(String[] args) {

//###################### TASKI ##########################
        TDL b = new TDL();
        b.toDoList.add(new Task(Priority.HIGH, "zakupy", "kup jablka", Status.NOWE));
        b.toDoList.add(new Task(Priority.LOW, "anna", "idz do szkoly", Status.WTRAKCIE));
        b.toDoList.add(new Task(Priority.HIGH, "baba", "ugotuj obiad", Status.WTRAKCIE));
        b.toDoList.add(new Task(Priority.MED, "prysznic", "wez prysznic", Status.ZAKONCZONE));
        TaskComparator porownaj = new TaskComparator();

        b.printAll();

        b.getSortedByName(porownaj.compTaskByName);
        b.getSortedByPriority(porownaj.compTaskByPriority);
        b.getSortedNyName2(porownaj.compTaskByName,"DESC");




        System.out.println();
        b.printAll();
    }
}
