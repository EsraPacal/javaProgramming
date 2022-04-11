package day31_Constructors;

public class Offer {

    public String location, companyName, jobTitle;
    public double salary;
    public boolean hasBenefit, hasPTO, isWFH,isFullTime;
                      // pay time off// work from home====> remoote

    // attributes
    public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;     //
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {    //  toString is a building method that helps to generate all the attributes of setInfo class
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }   // when we don't pass the toString, we will get a hashcode
}
