package lesson_5;

public class Employee {
    private String nameSurname;
    private String position;
    private String eMail;
    private String telNumber;
    private int salary;
    private int age;

    private Employee(String nameSurname, String position, String eMail, String telNumber, int salary, int age) {
        this.nameSurname = nameSurname;
        this.position = position;
        this.eMail = eMail;
        this.telNumber = telNumber;
        this.salary = salary;
        this.age = age;
    }

    private static void printInfo(Employee person) {
        System.out.printf("Имя сотрудника: %s\nДолжность: %s\nЗарплата: %d\nВозраст: %d\nТелефон: %s\ne-mail: %s\n\n",
                person.nameSurname, person.position, person.salary, person.age, person.telNumber, person.eMail);
    }

    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Иванов Иван Иванович", "директор",
                "ivanov@mail.ru", "89162326852", 300000, 50);
        empArray[1] = new Employee("Козодоев Сергей Геннадьевич", "заместитель директора",
                "kozodoev@mail.ru", "89162526855", 250000, 41);
        empArray[2] = new Employee("Сидорова Ольга Петровна", "секретарь",
                "sidorova@mail.ru", "89162526857", 100000, 29);
        empArray[3] = new Employee("Самыкин Олег Пафнутьевич", "инженер-конструктор",
                "pafnut@mail.ru", "89162526859", 200000, 45);
        empArray[4] = new Employee("Пикина Евгения Сергеевна", "инженер-технолог",
                "lisa@mail.ru", "89162526860", 100000, 25);
        for (int i = 0;i<empArray.length;i++){
            if(empArray[i].age>=40){
                printInfo(empArray[i]);
            }
        }
    }
}
