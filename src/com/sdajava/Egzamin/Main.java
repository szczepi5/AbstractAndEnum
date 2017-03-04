package com.sdajava.Egzamin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");

        Date date =new Date();
        String examTime = dateFormat.format(date);

        System.out.println("Data: " + examTime);

        Student student1 = new Student(examTime, FinalExam.ExamStatus.FAILED);
        student1.examResults();


        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        date = new Date();
        examTime = dateFormat.format(date);
        Student student2 = new Student(examTime, FinalExam.ExamStatus.FAILED);
        student2.examResults();

    }
}
