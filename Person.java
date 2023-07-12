package Test;
/*Create a class called Person with private properties like name, age, and address. 
Provide public getter and setter methods for these properties. Write a program that creates 
an instance of the Person class, sets values for its properties using the setter methods, and 
displays the values using the getter methods.*/

public class Person {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }  
}

class PersonMain{
    public static void main(String[] args) {
        Person per = new Person();

        per.setName("David");
        per.setAge(26);
        per.setAddress("House no.123,Main Street,Newyork");

        System.out.println("Name: " + per.getName());
        System.out.println("Age: " + per.getAge());
        System.out.println("Address: " + per.getAddress());
    }
}
