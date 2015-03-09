package tmp;

//import lejos.nxt.LCD;
//import lejos.nxt.Motor;
//import lejos.nxt.NXT;
//import lejos.nxt.Sound;

public class tools {

	// time interval between ground scans and cognitive processes sum up
	// in milliseconds
	public static int time_tick_interval = 500;

	public static class Timer extends Thread { // to służy temu, aby robot nie
												// przekroczył czasu...

		private int time_left = 0;

		public Timer(int time_to_die) {
			time_left = time_to_die;
			System.out.println(time_to_die + " time_to_die");

		}

		// TODO: get time
		public void sztop() {
			time_left = 1000000;
			System.out.println(time_left + " time_left");

		}

		public void run() {
			while (time_left > 0) {
				try {
					time_left--;
					System.out.println(time_left + " time_left");

					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}

			koniec();
		}
	}

	public static void doWait(long wait_time) {
		try {
			Thread.sleep(wait_time);
		} catch (Exception e) {
		}
	}

	public static void koniec() {
		System.out.println("en fin");
		System.exit(1);
		// LCD.clearDisplay();
		// LCD.clear();
		//
		// PIN_2013.timer.sztop();
		// motors.pilot.stop();
		// motors.navigator.stop();
		// Motor.C.stop();
		// while (motors.pilot.isMoving()){}
		// while (motors.navigator.isMoving()){}
		// while (Motor.C.isMoving()){}
		// motors.pilot.stop();
		// motors.navigator.stop();
		// Motor.C.stop();
		// Sound.twoBeeps();
		// NXT.shutDown();
	}

}
