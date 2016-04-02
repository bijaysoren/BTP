import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FlightClass implements Cloneable	{
	public String origin;
	public String destination;
	public Date d1;
	public Date d2;
	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    public String name;
    
    public FlightClass (String origin ,String destination,String date,String date2,String name){
    	this.origin=origin;
    	this.destination=destination;
    	this.name=name;
    	try {
			this.d1=format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	try {
			this.d2=format.parse(date2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public FlightClass (FlightClass given){
		this.origin=given.origin;
		this.destination=given.destination;
		this.name=given.name;
		this.d1 = given.d1;
		this.d2 = given.d2;
	}


    
    
    public void setdate(String date){
    	try {
			this.d1=format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


    }
    
    
    
    
}
