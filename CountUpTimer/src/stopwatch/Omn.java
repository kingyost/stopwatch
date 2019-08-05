package stopwatch;

import java.util.Timer;
import java.util.TimerTask;


public class Omn{

	Timer timer;
	printer print = new printer();
	
	public Omn(int sec) {
		timer = new Timer();
		//long period = sec * 60 * 10000; //5 min interval - 5 *60 *1000
		long period = sec; //5 min interval - 5 *60 *1000
		System.out.println("Test4");
		timer.schedule(new timestamp(), period, period);
		System.out.println("Test3");
	}
	
	
	int min = 0; //minutes
	int hrs = 0; //hours
	int day = 0; //days
	
	//long period = secs * 60 * 10000; //5 min interval - 5 *60 *1000
	
	class timestamp extends TimerTask{
		public void run() {
			System.out.println("Test1");
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

			print.printOut(min, hrs, day);  //calls print class to print to a txt file
			System.out.println(day +":"+hrs +":"+ min);
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
