package Employeewageproblem;

import java.util.Scanner;

public class EmployeeWage {
        public static void main(String[] args) {
            System.out.println("***** WELCOME TO EMPLOYEE WAGE CPMPUTATION ***** ");
            System.out.println("ENTER THE KEY VALUE \n");
            Scanner sc = new Scanner(System.in);
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    int present = 1;
                    double check = Math.floor(Math.random() * 10) % 2;

                    if (check == present)
                        System.out.println("\n\t employee present \n ");
                    else
                        System.out.println("\n\temployee absent \n");
                    break;
                case 2:
                    int fdhr = 8, wphr = 20;
                    int total_wage = fdhr * wphr;
                    System.out.println("\n\t DAILY WAGE OF EMPLOYEE IS :: \t $" + total_wage);
                    break;
                case 3:
                    int fdhr1 = 8, whr = 20;
                    int total_wage1 = fdhr1 * whr;
                    System.out.println("\n\t DAILY WAGE OF PART TIME EMPLOYEE IS :: \t $"+total_wage1);
                    break;

                case 4:
                    int fdhr2 = 8, wphr1 = 20;
                    int t_wage = fdhr2 * wphr1 ;
                    int monthly_wage = t_wage * 20 ;
                    System.out.println("\n\t MONTHLY WAGE OF EMPLOYEE IS :: \t $"+monthly_wage);
                    break;

                case 5:
                    System.out.println("Enter the total working hours \n");
                    Scanner sc1 = new Scanner(System.in);
                    int monthly_hr = sc1.nextInt();

                    if (monthly_hr <=100 ){
                        int total_wage2 = monthly_hr * 20;
                        System.out.println("total wage is :: $"+total_wage2 );
                    }
                    else{
                        System.out.println("OOPS! the maximum value of working hour is 100 ");
                    }
                    break;
                default:
                    System.out.println("\n INVALID KEY ");

            }
        }
    }

