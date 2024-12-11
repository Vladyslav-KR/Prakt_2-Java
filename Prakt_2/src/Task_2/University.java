package Task_2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class University  {   // Поле для назви університету
    private String name;

    // Внутрішній клас Department
    public class Department {
        private String departmentName;
        private List<String> professors;

        public Department(String departmentName) {
            this.departmentName = departmentName;
            this.professors = new ArrayList<>();
        }

        public void addProfessor(String professor) {
            professors.add(professor);
        }

        public void showProfessors() {
            System.out.println("Professors in " + departmentName + ": " + professors);
        }
    }

    // Статичний вкладений клас Helper
    public static class Helper {
        // Статичний метод для обчислення середнього балу
        public static double calculateAverageGrade(int[] grades) {
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            return (double) sum / grades.length;
        }

        // Інший статичний метод для перевірки наявності кафедри
        public static boolean hasDepartment(String departmentName) {
            return departmentName != null && !departmentName.isEmpty();
        }
    }

    // Конструктор класу University
    public University(String name) {
        this.name = name;
    }

    // Метод для перегляду кафедри
    public void showDepartment() {
        // Створимо кафедру та додамо викладачів
        Department department = new Department("Computer Science");
        department.addProfessor("Dr. Smith");
        department.addProfessor("Prof. Johnson");
        department.showProfessors();
    }

    // Метод для організації подій (наприклад, конференцій)
    public void manageEvents() {
        // Використовуємо анонімний клас для обробки події
        EventOrganizer eventOrganizer = new EventOrganizer() {
            @Override
            public void organizeEvent(String eventName) {
                System.out.println("Organizing event: " + eventName);
            }
        };
        eventOrganizer.organizeEvent("Science Conference");
    }

    // Основний метод для взаємодії з користувачем
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Створення об'єкта університету
        University university = new University("XYZ University");

        // Запит користувача на введення середніх оцінок
        System.out.println("Enter grades for students (comma separated): ");
        String input = scanner.nextLine();
        String[] gradeStrings = input.split(",");
        int[] grades = new int[gradeStrings.length];

        for (int i = 0; i < gradeStrings.length; i++) {
            grades[i] = Integer.parseInt(gradeStrings[i].trim());
        }

        // Обчислення середнього балу за допомогою статичного методу Helper
        double avgGrade = Helper.calculateAverageGrade(grades);
        System.out.println("Average Grade: " + avgGrade);

        // Перевірка наявності кафедри за допомогою статичного методу Helper
        String departmentName = "Computer Science";
        boolean departmentExists = Helper.hasDepartment(departmentName);
        System.out.println("Department exists: " + departmentExists);

        // Перегляд кафедри
        university.showDepartment();

        // Організація подій
        university.manageEvents();
    }

    // Інтерфейс для організації подій
    interface EventOrganizer {
        void organizeEvent(String eventName);
    }
}

