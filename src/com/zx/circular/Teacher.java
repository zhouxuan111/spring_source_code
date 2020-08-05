package com.zx.circular;

/**
 * @author zhouxuan
 * @date 2020/6/30 20:27
 */
public class Teacher {

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    private Student student;

    public Teacher() {
    }

    public void teach() {
        System.out.println("teach");
        student.learn();
    }
}
