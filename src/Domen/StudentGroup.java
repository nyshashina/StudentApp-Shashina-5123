package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> group;
    private int groupId;
    public StudentGroup(List<Student> group, int groupId){
        this.group = group;
        this.groupId = groupId;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
    @Override
    public String toString() {
        return String.format("StudentGroup = %d", groupId);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);
    }
}
