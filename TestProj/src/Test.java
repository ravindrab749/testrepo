import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(1, 10).map(x -> x*2).sum();
		System.out.printf("Sum of even numbers from 2 to 20 is: %d", sum);
	}

}
