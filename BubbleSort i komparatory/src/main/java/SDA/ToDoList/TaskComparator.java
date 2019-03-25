package SDA.ToDoList;

import SDA.ToDoList.Task;

import java.util.Comparator;

public class TaskComparator {

    Comparator<Task> compTaskByPriority = new Comparator<Task>() {
        @Override
        public int compare(Task o1, Task o2) {
            return o1.priority.compareTo(o2.priority);
        }
    };

    Comparator<Task> compTaskByName = new Comparator<Task>() {
        @Override
        public int compare(Task o1, Task o2) {
            return o1.name.compareTo(o2.name);
        }
    };
}
