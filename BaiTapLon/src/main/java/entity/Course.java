/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "course")
@XmlAccessorType(XmlAccessType.FIELD)
public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    @XmlElement
    private int id;
    @XmlElement
    private String name;
    @XmlElement
    private float credits;
    @XmlElement(name = "teacher")
    private Teacher teacher;
    
    public Course(){
        
    }

    public Course(int id, String name, float credits, Teacher teacher) {
        super();
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCredits() {
        return credits;
    }

    public void setCredits(float credits) {
        this.credits = credits;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    
    
}




