/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modol;



/**
 *
 * @author Admin
 */
public class Student implements Comparable<Student>{
    private String Id;
    private String name;
    private int semester;
    private String cour_name;
    
    public Student(String Id, String name, int semester, String cour_name){
        this.Id = Id;
        this.name= name;
        this.semester = semester;
        this.cour_name = cour_name;
    }
    
    

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCour_name() {
        return cour_name;
    }

    public void setCour_name(String cour_name) {
        this.cour_name = cour_name;
    }

    @Override
    public String toString() {
        return name + " | "+ semester+" | " + cour_name ;
    }

    
    

     @Override
    public int compareTo(Student otherStudent) {
        int namecom = this.name.compareTo(otherStudent.getName());
        if(namecom == 0){
            return this.cour_name.compareTo(otherStudent.getCour_name());
        }
        return namecom;
    }
        
        
}
    
    
    

