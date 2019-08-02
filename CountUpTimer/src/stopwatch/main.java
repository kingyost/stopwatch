package stopwatch;

import java.util.Timer;
import java.util.TimerTask;

public class main {

	public static void main(String[] args) {
		
		long period = 300000;
		
		int min = 0;
		int hrs = 0;
		int day = 0;
		
		Timer time = new Timer();
		Omn omn = new Omn();
		printer print = new printer();
		
		time.schedule(run(), period, period);
		
	}
	
	public static TimerTask run() {
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
		print.printOut(min, hrs, day);
	}
	
}
