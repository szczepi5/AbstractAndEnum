package com.sdajava.Egzamin;

/**
 * Created by RENT on 2017-02-27.
 */
public class Student extends FinalExam {

    public Student(String examTime, ExamStatus status) {
        super(examTime, status);
    }




    @Override
    public void examResults() {

        String student = "Student 1";
        String studentResult = "85%";

        System.out.println("To jest student: " + student + " z wynikiem: " + studentResult +"%" + " status: "
        + getStatus() + " w czasie: " + getExamTime());

    }
}
