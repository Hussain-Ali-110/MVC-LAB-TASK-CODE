# MVC-LAB-TASK-CODE 
package CONTROLLER;

import MODEL.Student;
import VIEW.StudentView;

public class StudentController {
    private Student model;
    private StudentView view;
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public int getStudentId() {
        return model.getId();
    }

    public void setStudentId(int id) {
        model.setId(id);
    }

    public double getStudentCgpa() {
        return model.getCgpa();
    }

    public void setStudentCgpa(double cgpa) {
        model.setCgpa(cgpa);
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getId(), model.getCgpa());
    }
}




package MODEL;



public class Student {
    private String name;
    private int id;
    private double cgpa;

    // Constructor
    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }


    @Override
    public String toString() {
        return "Student [Name: " + name + ", ID: " + id + ", CGPA: " + cgpa + "]";
    }
}




package VIEW;

public class StudentView {
   
    public void printStudentDetails(String name, int id, double cgpa) {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
    }
}

