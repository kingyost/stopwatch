package stopwatch;

import java.util.TimerTask;

public class Omn extends TimerTask{

	printer print = new printer();
	
	int min = 0;
	int hrs = 0;
	int day = 0;
	
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
		
		print.printOut(min, hrs, day);
	}
	
	
	
}
