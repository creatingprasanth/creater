import java.time.LocalDate;
import java.time.Period;

public class Agecal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agecal cal = new Agecal();
		  cal.cal1();
		  cal.cal2();
	}
     private void cal2() {
	// TODO Auto-generated method stub
    	  	     
      LocalDate dob = LocalDate.of(1988, 12, 13);  //obtains an instance of LocalDate from a year, month and date
    	   
      LocalDate curDate = LocalDate.now();  //obtains the current date from the system clock  
    	  
      Period period = Period.between(dob, curDate);   //calculates the difference between two dates  
    	   
      //prints the differnce in years, months, and days  
       System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());  
       }  
    	    
	
	private void cal1() {
	// TODO Auto-generated method stub
       LocalDate today = LocalDate.now();
       LocalDate Dob = LocalDate.of(1998, 9,24);
       int years = Period.between(Dob,today).getYears();
           
           
           System.out.println(today);
           System.out.println(Dob);
           System.out.println(years);
	}
	}


