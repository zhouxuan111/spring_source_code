package com.zx.circular;

/**
 * @author zhouxuan
 * @date 2020/6/30 20:27
 */
public class Student {

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    private Teacher teacher;

    public Student() {
    }

    public void learn() {
        System.out.println("student learn");
    }

}
