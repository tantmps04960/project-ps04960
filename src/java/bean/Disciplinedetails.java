package bean;
// Generated Jun 2, 2017 8:37:06 PM by Hibernate Tools 4.3.1



import java.util.Date;

/**
 * Disciplinedetails generated by hbm2java
 */
public class Disciplinedetails  implements java.io.Serializable {


     private int disdtId;
     private Discipline discipline;
     private Employee employee;
     private String reason;
     private Date date;

    public Disciplinedetails() {
    }

	
    public Disciplinedetails(int disdtId, Discipline discipline, Employee employee) {
        this.disdtId = disdtId;
        this.discipline = discipline;
        this.employee = employee;
    }
    public Disciplinedetails(int disdtId, Discipline discipline, Employee employee, String reason, Date date) {
       this.disdtId = disdtId;
       this.discipline = discipline;
       this.employee = employee;
       this.reason = reason;
       this.date = date;
    }
   
    public int getDisdtId() {
        return this.disdtId;
    }
    
    public void setDisdtId(int disdtId) {
        this.disdtId = disdtId;
    }
    public Discipline getDiscipline() {
        return this.discipline;
    }
    
    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }




}


