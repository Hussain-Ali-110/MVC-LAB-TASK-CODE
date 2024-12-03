 package sda.model.view.controller;

public class SDAModelViewController {

   
    public static class View {
        public void printData(String data) {
            System.out.println("Data: " + data);
       
    }
   
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.setData("Hello, MVC!");
        controller.updateView();
    }
    }}

