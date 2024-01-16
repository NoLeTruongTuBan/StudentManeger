
package View;

import java.util.Scanner;
import Controler.StudentList;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        View V = new View();
        StudentList SL = new StudentList();
        int a = 0;
        String key,Subkey = "N";
       
        SL.AStudentList();
        while( a!=5){
            
            if(Subkey.equalsIgnoreCase("Y")) a = 1;
            else{
                V.MainView();
                a = sc.nextInt(6);
                sc.nextLine();  
                    }
            switch (a){
                case 1:
                    for(int i = 0; i<10; i ++) SL.Addstu();
                    System.out.println("Do you want to continue?? (Y/N)");
                    Subkey = sc.nextLine();
                    break;
                case 2: 
                    SL.Sorted();
                    System.out.print("Enter name: ");
                    key = sc.nextLine();
                    V.printSTList(SL.Find(key));
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    key = sc.nextLine();
                    SL.Update(key);
                    break;
                case 4:
                    V.printRP(SL.Report());
                    break;
                case 5:
                    break;
            }
        }
    }
}
