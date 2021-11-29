package com.pavithra.service;

import java.util.Scanner;

import com.pavithra.model.Employee;

public class DriverClass{
    public static void main(String[] args){
        Employee employee = new Employee("Pavithra", "Ragoubady");
        CredentialService cs = new CredentialService();
        String generatedEmail;
        char[] generatedPassowrd;

        System.out.println("Please enter the department from the following");
        System.out.println("1.Technical");
        System.out.println("2.Admin");
        System.out.println("3.Human Resource");
        System.out.println("4.Legel");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 1: {
                generatedEmail = cs.generateEmailAdress(employee.getfirstName().toLowerCase(),employee.getlastName().toLowerCase(),"tech");
                generatedPassowrd = cs.generatePassword();
                cs.showCredential(employee, generatedEmail, generatedPassowrd);
                break;
            }
            case 2: {
                generatedEmail = cs.generateEmailAdress(employee.getfirstName().toLowerCase(),employee.getlastName().toLowerCase(),"adm");
                generatedPassowrd = cs.generatePassword();
                cs.showCredential(employee, generatedEmail, generatedPassowrd);
                break;
            }
            case 3: {
                generatedEmail = cs.generateEmailAdress(employee.getfirstName().toLowerCase(),employee.getlastName().toLowerCase(),"hr");
                generatedPassowrd = cs.generatePassword();
                cs.showCredential(employee, generatedEmail, generatedPassowrd);
                break;
            }
            case 4: {
                generatedEmail = cs.generateEmailAdress(employee.getfirstName().toLowerCase(),employee.getlastName().toLowerCase(),"lgl");
                generatedPassowrd = cs.generatePassword();
                cs.showCredential(employee, generatedEmail, generatedPassowrd);
                break;
            }
            default: {
                System.out.println("Enter valid option");
                break;
            }
        }
        sc.close();
    }

}