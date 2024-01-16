package Controler;


import Modol.Student;
import Modol.CountRP;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class StudentList  {
    List<Student> SList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void AStudentList(){
        SList.add(new Student("D023", "FuFu", 2, "Java"));
        SList.add(new Student("D023", "FuFu", 1, ".Net"));
        SList.add(new Student("D023", "FuFu", 3, "Java"));
        SList.add(new Student("D088", "FuKu", 1, ".Net"));
        SList.add(new Student("D088", "FuKu", 1, " Java"));
    }
    public void Addstu(){
            System.out.println("Enter student ID: ");
            String ID = sc.nextLine();
            System.out.println("Enter student Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Semester: ");
            int semester = Integer.parseInt(sc.nextLine());
            String[] course = {" java "," .Net"," C/C++"};
            System.out.println("Chose a course");
            for(int i=0;i<course.length;i++){
                System.out.println(i + 1+ course[i]);
            }
            int choice =sc.nextInt(4);
             String courseName =course[choice-1];
            SList.add(new Student(ID, name, semester , courseName));
            sc.nextLine();
    }
    
    public List<Student> Sorted(){
         Collections.sort(SList);
         return SList;
    }
    
    public List<Student> Find(String name){
        List<Student> Result = new ArrayList<>();
        for(Student S: SList){
            if(S.getName().equalsIgnoreCase(name))  Result.add(S);
        }
        return Result;
    }
    public List<Student> FindID(String ID){
         List<Student> Result = new ArrayList<>();
         for(Student S: SList){
            if(S.getId().contains(ID))  Result.add(S);
        }
         return Result;
    }
    
    public void Update( String ID){
        List <Student> s= FindID(ID);
        if(s == null) {
            System.out.println("Can not find");
            return;
        }
        
        System.out.println("Do you want to update (U) or delete (D) student");
        String c = sc.nextLine();
        if(c.equalsIgnoreCase("D")) Del(ID);
        if(c.equalsIgnoreCase("U")) {
            for(Student S : s ){
                System.out.println(S.toString());
                System.out.println("Pass (P) or Update(U)");
                String p = sc.nextLine();
                if(p.equalsIgnoreCase("P")) continue;
                
                String[] course = {" java "," .Net"," C/C++"};
                System.out.println("Chose a course");
                for(int i=0;i<course.length;i++){
                System.out.println(i + 1+ course[i]);
                }
                int choice =sc.nextInt(4);
                sc.nextLine();
                String courseName =course[choice-1];
                S.setCour_name(courseName);
            }
            System.out.println("Update Succesful");
        }
    }
    
    public void Del(String ID){
        List <Student> s= FindID(ID);
        if(s== null){  
            System.out.println("ID do not exist");
        }
        else {
            SList.removeAll(s);
            System.out.println("Remove Succsessfully");
        }
    }
    public List<CountRP> Report (){
        Sorted();
        List <CountRP> Rp = new ArrayList<>();
        List <String> St = new ArrayList<>();
        int n=0;
        int i =0;
            for(Student S : SList){
                i++;
                String key = S.getName() +"/" +S.getCour_name();
                
                
                if(St.contains(key)) n++;
                else {
                    if(!St.isEmpty()){
                        String[] Split = St.getLast().split("/");
                        Rp.add (new CountRP(Split[0], Split[1], n));
                        }
                    n=1;
                    St.add(key);
                }
                if(i == SList.size()){
                    String[] Split = St.getLast().split("/");
                    Rp.add (new CountRP(Split[0], Split[1], n));
                }
            }
       return Rp;
    }
    
}
