package iterator_pattern;

import iterator_pattern.common.Iterable;
import iterator_pattern.common.Iterator;

import java.util.ArrayList;

public class ClassRoom implements Iterable<Student> {

    private final ArrayList<Student> studentList;

    public ClassRoom(){
        this.studentList = new ArrayList<Student>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public int getLength(){
        return studentList.size();
    }

    public Student getStudent(int index){
        return studentList.get(index);
    }

    @Override
    public Iterator<Student> iterator(){
        return new ClassRoomIterator(this);
    }
}
