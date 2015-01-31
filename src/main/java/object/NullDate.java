package object;

import npe1.stubs.Student;

import java.util.Date;

public class NullDate {

    public static final Date NULL_DATE = new Date(Long.MIN_VALUE);

    public Date process(Student s) {
        Date d = s.getRegdate();
        return null == d ? NULL_DATE : d;
    }
}
