/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sda.model.view.controller;

/**
 *
 * @author DEEBYTE COMPUTERS
 */
   public class Controller {
        private Model model;
        private SDAModelViewController.View view;

        public Controller(Model model, SDAModelViewController.View view) {
            this.model = model;
            this.view = view;
        }

        public void setData(String data) {
            model.setData(data);
        }

        public String getData() {
            return model.getData();
        }

        public void updateView() {
            view.printData(model.getData());
        }

   
    }
