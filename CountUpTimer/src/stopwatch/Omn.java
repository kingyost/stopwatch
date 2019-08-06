package stopwatch;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.text.SimpleDateFormat;  


public class Omn{

	Timer timer;
	printer print = new printer();
	
	int min = 0; //minutes
	int hrs = 0; //hours
	int day = 0; //days
	int maxDays = 3; // maximum time the timer will run
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();
    String d = "";
	
	
	public Omn(int sec) {
		timer = new Timer();
		long period = sec * 60 * 1000; //5 min interval - 5 *60 *1000
		//long period = sec*1000;  //test line
		timer.schedule(new timestamp(), period, period);
		d = formatter.format(date);
	}
	
	
	class timestamp extends TimerTask{
		public void run() {
			min += 5;
			if (min == 60)
			{
				min = 0;
				hrs +=1;
				if (hrs == 24)
				{
					hrs = 0;
					day += 1;
				}
			}

			print.printOut(d, min, hrs, day);  //calls print class to print to a txt file
			System.out.println(day +":"+hrs +":"+ min);
			
			if(day == maxDays)
			{
				timer.cancel();
			}
		}
	}
	
	public int GetMin()
	{
		return min;
	}
	public int getHrs() {
		return hrs;
	}

	public int getDay() {
		return day;
	}
	
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMin(int min) {
		this.min = min;
	}
}
