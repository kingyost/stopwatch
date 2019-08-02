package stopwatch;

import java.io.FileWriter;
import java.io.IOException;

public class printer {
	
	public void printOut(int m, int h, int d)
	{
		String time = d + " days, "+ h + " hrs, " + m + "min";
		try {
			FileWriter writer = new FileWriter("timer.txt");
			writer.write(time);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
