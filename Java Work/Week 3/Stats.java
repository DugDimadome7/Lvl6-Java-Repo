import java.util.Arrays;


public class Stats {

    private final int[] numbers;
    private int count;


    /**
     * Allows for continuous appending of specified or unspecified amount of
     * values to an array in the driver.
     *
     * @param value accepts an integer as the parameter, this integer is used to add the specified integer
     *              into an array and continue appending itself up to a specified capacity.
     */
    public void addValue(int value) {
        numbers[count] = value;
        count++;
    }

	/**
	 * Gets the length of a variable;
	 *
	 * @return numbers.length returns number of indexes in array.
	 */
    public int getCount() {
        return numbers.length;
    }

	/**
	 *
	 * @return
	 */
    public int getMaximum() {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }

        return max;
    }

	/**
	 *
	 * @return
	 */
    public int getMinimum() {
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }

        return min;
    }

    public int getTotal() {
        int total = 0;

        // total all values within the array
        for (int number : numbers) {
            total += number;
        }

        return total;
    }

    public double getAverage() {
        int min = 0;

        for (int number : numbers) {
            min += number;
        }

        return min / (double) numbers.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }

    // Constructor to hold array of printed numbers in driver.
    public Stats(int capacity) {
        numbers = new int[capacity];
    }
}
