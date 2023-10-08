package iterator_pattern;

import iterator_pattern.common.Iterator;

public class IteratorPatternMain {
    public static void iteratorPatternMainStatic() {
        ClassRoom classRoom = new ClassRoom();
        classRoom.addStudent(new Student("Taro"));
        classRoom.addStudent(new Student("Hana"));
        classRoom.addStudent(new Student("田中清"));

        Iterator<Student> it = classRoom.iterator();
        while(it.hasNext()){
            Student student = it.next();
            System.out.println(student.getName());
        }

    }
}
