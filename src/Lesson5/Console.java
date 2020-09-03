package Lesson5;

public class Console {
    private static int SIZE = 5;
    private static int CHECK_AGE = 40;
    public static void main(String[] args) {
        Employee[] employee = new Employee[SIZE];
        employee[0] = new Employee(1, "Сергей", "Сергеевич", "Сергеев", "Инженер",
                "sergeev@mail.ru", "+7(901) 101-25-25", 30, 30000);
        employee[1] = new Employee(2, "Дмитрий", "Дмитриевич", "Дмитриев", "Технолог",
                "dmitriev@mail.ru", "+7(901) 101-25-26", 40, 25000);
        employee[2] = new Employee(3, "Иван", "Сергеевич", "Иванов", "Начальник ПТО",
                "ivanov@mail.ru", "+7(901) 101-25-27", 45, 45000);
        employee[3] = new Employee(4, "Сергей", "Иванович", "Петров", "Диспетчер",
                "petrov@mail.ru", "+7(901) 101-25-28", 35, 25000);
        employee[4] = new Employee(5, "Николай", "Семенович", "Смирнов", "Гл. инженер",
                "smirnov@mail.ru", "+7(901) 101-25-29", 48, 50000);

        for(int i = 0; i < employee.length; i ++){
            if(employee[i].age > CHECK_AGE){
                employee[i].printConsole();
                System.out.println("----------------------------");
            }
        }

    }
}
