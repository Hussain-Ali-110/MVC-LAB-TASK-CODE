/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc.modifed.example;
 import java.util.Scanner;

public class SDAModelViewController {

    public static class Model {
        private String name;
        private int id;
        private double cgpa;

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
    }

    public static class View {
        public void showMenu() {
            System.out.println("\nMenu:");
            System.out.println("1. Set Student Name");
            System.out.println("2. Set Student ID");
            System.out.println("3. Set Student CGPA");
            System.out.println("4. Get Student Details");
            System.out.println("5. Update View");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
        }

        public void printDetails(String name, int id, double cgpa) {
            System.out.println("\n--- Student Details ---");
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("CGPA: " + cgpa);
        }
    }

    public static class Controller {
        private Model model;
        private View view;

        public Controller(Model model, View view) {
            this.model = model;
            this.view = view;
        }

        public void setName(String name) {
            model.setName(name);
        }

        public void setId(int id) {
            if (id <= 0) {
                System.out.println("ID must be positive.");
            } else {
                model.setId(id);
            }
        }

        public void setCgpa(double cgpa) {
            if (cgpa < 0.0 || cgpa > 4.0) {
                System.out.println("CGPA must be between 0.0 and 4.0.");
            } else {
                model.setCgpa(cgpa);
            }
        }

        public String getName() {
            return model.getName();
        }

        public int getId() {
            return model.getId();
        }

        public double getCgpa() {
            return model.getCgpa();
        }

        public void updateView() {
            view.printDetails(model.getName(), model.getId(), model.getCgpa());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        int choice;
        do {
            view.showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    controller.setName(name);
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    controller.setId(id);
                    break;
                case 3:
                    System.out.print("Enter student CGPA: ");
                    double cgpa = scanner.nextDouble();
                    controller.setCgpa(cgpa);
                    break;
                case 4:
                    System.out.println("\n--- Fetching Student Details ---");
                    System.out.println("Name: " + controller.getName());
                    System.out.println("ID: " + controller.getId());
                    System.out.println("CGPA: " + controller.getCgpa());
                    break;
                case 5:
                    controller.updateView();
                    break;
                case 6:
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
