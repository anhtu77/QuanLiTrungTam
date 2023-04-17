/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "document")
@XmlAccessorType(XmlAccessType.FIELD)
public class Document implements Serializable {
    private static final long serialVersionUID = 1L;
    @XmlElementWrapper(name = "classes")
    @XmlElement(name = "class")
    private List<Class> classes = new ArrayList<>();
    @XmlElementWrapper(name = "students")
    @XmlElement(name = "student")
    private List<Student> students = new ArrayList<>();
    @XmlElementWrapper(name = "teachers")
    @XmlElement(name = "teacher")
    private List<Teacher> teachers = new ArrayList<>();

    public Document() {
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    
    
}
