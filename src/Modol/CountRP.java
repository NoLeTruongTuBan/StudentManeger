/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modol;


public class CountRP {
    String name;
    String course;
    int count;

    public CountRP(String name, String course, int count) {
        this.name = name;
        this.course = course;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getcount() {
        return count;
    }

    public void setcount(int i) {
        this.count = i;
    }

    @Override
    public String toString() {
        return   name + " | " + course + " | " + count;
    }
    
    
}
