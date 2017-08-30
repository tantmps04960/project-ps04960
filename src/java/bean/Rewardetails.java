package bean;
// Generated Jun 2, 2017 8:37:06 PM by Hibernate Tools 4.3.1



import java.util.Date;

/**
 * Rewardetails generated by hbm2java
 */
public class Rewardetails  implements java.io.Serializable {


     private int rewdtId;
     private Employee employee;
     private Reward reward;
     private String reason;
     private Date date;

    public Rewardetails() {
    }

	
    public Rewardetails(int rewdtId, Employee employee, Reward reward) {
        this.rewdtId = rewdtId;
        this.employee = employee;
        this.reward = reward;
    }
    public Rewardetails(int rewdtId, Employee employee, Reward reward, String reason, Date date) {
       this.rewdtId = rewdtId;
       this.employee = employee;
       this.reward = reward;
       this.reason = reason;
       this.date = date;
    }
   
    public int getRewdtId() {
        return this.rewdtId;
    }
    
    public void setRewdtId(int rewdtId) {
        this.rewdtId = rewdtId;
    }
    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Reward getReward() {
        return this.reward;
    }
    
    public void setReward(Reward reward) {
        this.reward = reward;
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


