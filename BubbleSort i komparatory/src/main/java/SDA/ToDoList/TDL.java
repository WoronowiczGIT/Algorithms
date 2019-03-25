package SDA.ToDoList;

import SDA.ToDoList.Task;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class TDL {
    List<Task> toDoList = new LinkedList<>();

    public void printAll(){
        for (Task x: toDoList
             ) {
            System.out.println(x.toString());
        }
    }

    public void sortListDefault(){
        toDoList.sort(Task::compareTo);
    }

    public void addTask(Task newTask){
        toDoList.add(newTask);
    }
    public List<Task> getSortedByPriority (Comparator comparator){
        toDoList.sort(comparator);
        return toDoList;
    }

    public List<Task> getSortedByName (Comparator<Task> comparator){
        toDoList.sort(comparator);
        return toDoList;
    }
    public List<Task> getSortedNyName2(Comparator comp, String DESC){
        if(DESC=="DESC"){
            toDoList.sort(comp.reversed());
        }else
            toDoList.sort(comp);

        return toDoList;
    }

}
