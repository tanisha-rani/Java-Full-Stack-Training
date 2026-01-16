package Inheritances;

import java.util.*;
public class Hospital{
     static class Person{
        String name;
        int age;
        Person(){

        }
        Person(String name, int age){
            this.name=name;
            this.age=age;
        }
        
        public void displayPerson(){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
        }

    }
     static class Staff extends Person{
        int staffID;
        String dept="Cardiology";
        Staff(){

        }
        Staff( String name, int age, int staffID, String dept){
            super(name, age);
            this.staffID=staffID;
            this.dept=dept;
        }
        public void displayStaff(){
            System.out.println("Staff ID: "+staffID);
            System.out.println("Department: "+dept);
        }
        
    }
     static class Doctor extends Staff{
        String specialization;

        Doctor(){

        }
        Doctor( String name, int age, int staffID, String dept , String specialization){
            super(name, age, staffID, dept);
            this.specialization= specialization;
        }
        public void treatPatient(){
            System.out.println("Specialization: "+specialization);
            System.out.println("Doctor is treating a patient");
        }
    }
    static  class Nurse extends Staff{
        String shift;
        Nurse(){

        }
        Nurse(String name, int age, int staffID, String dept, String shift){
            super(name, age, staffID, dept);
            this.shift=shift;
        }
        public void assistDoctor(){
            System.out.println("Shift: "+shift);
            System.out.println("Nurse is assisting the doctor");
        }
    }
    public static void main(String[] args){
        Doctor d1 = new Doctor("Dr. Karthik", 42, 301, "Cardiology", "Heart Surgery");
        d1.displayPerson();
        d1.displayStaff();
        d1.treatPatient();

        System.out.println();

        Nurse n1 = new Nurse("Suma", 29, 302, "Cardiology", "Night");
        n1.displayPerson();
        n1.displayStaff();
        n1.assistDoctor();
    }
}
