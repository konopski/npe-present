package object;


import npe1.stubs.Student;
import npe1.stubs.StudentFacade;

import java.util.Collections;
import java.util.Set;

public class Singleton {

    Set<Student> getStudent(String username){
        Student student = StudentFacade.getStudentByUsername(username);
        if(null == student) {
            return Collections.emptySet();
        }
        return Collections.singleton(student);
    }

    void process(){
        for(Student name : getStudent("any")) {
            name.getFname();
        }
    }
}
