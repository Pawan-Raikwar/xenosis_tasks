package XENOSIS_internship;

//: CREATE A SIMPLE CLASS PERSON WITH PROPERTIES NAME
//AND AGE, AND A METHOD TO DISPLAY THE DETAILS
class Person{
     String name;
     int age;


       // display method
       public static void  displayDetails(String name,int age){

           System.out.println("This name is  --> "+name);
           System.out.println("This is age is -->"+age);
       }

 }

public class Assignment4 {
    public static void main(String[] args) {
        Person person=new Person();
        person.displayDetails("pawan",20);

    }
}
