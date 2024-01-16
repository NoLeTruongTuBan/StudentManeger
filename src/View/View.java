/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Modol.Student;
import Modol.CountRP;
import java.util.List;

/**
 *
 * @author Admin
 */
public class View {
    public void MainView(){
        String [] Choice ={	"Create","Find and Sort","Update/Delete","Report", "Exit"};
        int i = 0;
        System.out.println("WELCOME TO STUDENT MANAGEMENT");
        for (String S: Choice){
            i++;
            System.out.println(i+"." + S);
        }
        System.out.print("Please choose: " );
    }
    
    public void printSTList(List<Student> SL){
        if(SL.isEmpty()) System.out.println("Can not find");
        for(Student S: SL){
            System.out.println(S.toString());
        }
    }
    public void printRP(List<CountRP> Rp){
        if(Rp.isEmpty()) System.out.println("List is empty");
        for(CountRP S: Rp){
            System.out.println(S.toString());
        }
    }
}
