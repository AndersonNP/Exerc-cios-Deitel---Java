package capitulo10;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Employee implements Payable{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthDate;
    private double aditional;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    public Date getBirthDate(){
        return birthDate;
    }

    public double getAditional(){
        return aditional;
    }

    public void setAditional(double aditional){
        this.aditional = aditional;
    }

    @Override
    public String toString(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%s %s%nsocial secutity number: %s%nBirthDate: %s", getFirstName(), getLastName(), getSocialSecurityNumber(),formatter.format(getBirthDate()));
    }

}
