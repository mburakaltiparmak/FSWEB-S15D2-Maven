package org.example.entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }
    public Set<Task> getTasks(String task){
        if(Objects.equals(task, "ann")){
            return annsTasks;
        }
        else if(Objects.equals(task, "bob")){
            return bobsTasks;
        }
        else if(Objects.equals(task, "carol")){
            return carolsTasks;
        }
        else if(Objects.equals(task, "all")){
            return unassignedTasks;
        }
        else {
            return null;
        }
    }
    public Set<Task> getUnion(Set<Task> set1,Set<Task> set2){
        Set<Task> union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);
        return union;
    }
    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2){
        Set<Task> copySet1 = new HashSet<>(set1);
        copySet1.retainAll(set2);
        return copySet1;
    }
    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2){
        Set<Task> copySet1 = new HashSet<>(set1);
        copySet1.removeAll(set2);
        return copySet1;
    }
}
