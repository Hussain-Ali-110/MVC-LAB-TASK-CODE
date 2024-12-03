/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import MODEL.Student;
import VIEW.StudentView;

public class StudentController {
    private Student model;
    private StudentView view;

    // Constructor
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Getters and setters for model data
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
