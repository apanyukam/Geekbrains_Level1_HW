package Lesson5;

import org.w3c.dom.ls.LSOutput;

public class Employee {

    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String position;
    private String mail;
    private String telephoneNumber;
    public int age;
    private int wages;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

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
