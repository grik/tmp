package tmp;

public class timer {
	static public tools.Timer timer = new tools.Timer(1 * 10);

	public static void main(String[] args) throws Exception {
		timer.setDaemon(true);
		timer.start();
		System.out.println("timer start");
		
		int i = 0;
		
		while(true){
			i++;
			System.out.println(i + " i");

			Thread.sleep(1000);
		}
	}

}
