package iterator_pattern;

import iterator_pattern.common.Iterator;

import java.util.NoSuchElementException;

public class ClassRoomIterator implements Iterator<Student> {

    private ClassRoom classRoom;
    private int index;

    public ClassRoomIterator(ClassRoom classRoom){
        this.classRoom = classRoom;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < classRoom.getLength();
    }

    @Override
    public Student next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }

        Student student = classRoom.getStudent(index);
        index++;
        return student;
    }
}
