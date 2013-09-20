package kata2;


import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class Student {

    public final static long MILLISECONDS_PER_YEAR = (long) (60 * 60 * 24 * 1000 * 365.25);
    
    private String name;
    private Date dateBirth;

    public Student(String name, Date dateBirth) {
        this.name = name;
        this.dateBirth = dateBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    
    public int getAge() {
        Date today = new Date();
        long millisecondsFromBirthDate = today.getTime() - dateBirth.getTime();
        return  (int) (millisecondsFromBirthDate / MILLISECONDS_PER_YEAR);
    }
    
}
