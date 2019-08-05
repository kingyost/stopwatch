package stopwatch;

import java.util.Timer;
import java.util.TimerTask;

public class UuuggghhhLearning {
	
	Timer timer;
	
	
	public UuuggghhhLearning(int sec){
		
	timer = new Timer();
	timer.schedule(new Goodbye(), sec * 1000);
	}
	
	class Goodbye extends TimerTask{
		public void run() {
			System.out.println("Goodbye!");
			timer.cancel();
		}
	}



//	public static void main(String[] args) {
//		
//		new UuuggghhhLearning(5);
//		System.out.println("START!!");
//		
//	}

}
