package SDA.ToDoList;

import java.time.LocalDate;

public class Task implements Comparable<Task> {
    Priority priority;
    String name;
    String opis;
    Status status;
    LocalDate data;

    Task(Priority priority, String name, String opis, Status status) {
        this.priority = priority;
        this.name = name;
        this.opis = opis;
        this.status = status;
        this.data = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Task{" +
                "priority=" + priority +
                ", name='" + name + '\'' +
                ", opis='" + opis + '\'' +
                ", status=" + status +
                ", data=" + data +
                '}';
    }

    @Override
    public int compareTo(Task o) {
        //int resault = this.name.compareTo(o.name);
        // return resault;
        // Sortowanie priority->name->description->status

        if(this.priority.compareTo(o.priority)!=0){
            return this.priority.compareTo(o.priority);
        }else return (this.status.compareTo(o.status));
    }



}
