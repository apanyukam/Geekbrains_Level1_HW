package Lesson5;

import org.w3c.dom.ls.LSOutput;

public class Employee {

    public int id;
    public String firstName;
    public String middleName;
    public String lastName;
    public String position;
    public String mail;
    public String telephoneNumber;
    public int age;
    public int wages;

    public Employee(int id, String firstName, String middleName, String lastName, String position, String mail,
                    String telephoneNumber, int age, int wages){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.position = position;
        this.mail = mail;
        this.telephoneNumber = telephoneNumber;
        this.age = age;
        this.wages = wages;
    }

    public void printConsole(){
        System.out.println("ФИО:  " +  firstName + " " + middleName + " " + lastName);
        System.out.println("Должность: " + position);
        System.out.println("E-mail: " + mail);
        System.out.println("Телефон: " + telephoneNumber);
        System.out.println("Возраст: " + age);
        System.out.println("Заработная плата: " + wages);
    }

}
