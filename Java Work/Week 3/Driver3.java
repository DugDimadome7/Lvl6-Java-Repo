import java.util.Random;

public class Driver3 {
	public static void main(String[] args) {
		// Final int used to keep list of numbers at 10.
		final int VALUES = 10;

		//Sets up the stats constructor using final VALUES as its parameter.
        Stats stats = new Stats(VALUES);

		Random random = new Random();

		/*
		Iterates over each index in the constructed stats array, until it reaches VALUES,
		adds random value to each index in the stats array.
		 */
        for (int i = 0; i < VALUES; i++) {
			stats.addValue(random.nextInt(100));
				}

		System.out.println("Numbers stored : ");

		System.out.println(stats);

		System.out.println("Average = " + stats.getAverage());

		System.out.println("Count = " + stats.getCount());

		System.out.println("Total = " + stats.getTotal());

		System.out.println("Minimum value = " + stats.getMaximum());

		System.out.println("Maximum value = " + stats.getMinimum());
	}
}
