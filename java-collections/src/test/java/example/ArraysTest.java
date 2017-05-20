package example;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArraysTest {

	private String[] strings = { "unu", "doi", "trei", "patru", "cinci", "sase", "sapte",
			"opt", "noua", "zece" };

	private int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	private int[] b = { 11, 12, 13, 14, 15 };
	private Integer c[] = new Integer[10];
	private int d[] = new int[10];

	@Before
	public void Before() {
		// copy array a to d
		System.arraycopy(a, 0, d, 0, a.length);

		// copy array a to c
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
	}

	@Test
	public void test1() {
		System.out.println(strings);

		for (String string : strings) {
			System.out.println(string);
		}

		for (int i : a) {
			System.out.println(i);
		}

		for (int i : b) {
			System.out.println(i);
		}

		assertTrue(strings.length == 10);
	}

	@Test
	public void testStreamAndLambda() {
		List<Integer> list = Arrays.asList(c);
		System.out.println(list.stream().count());
		System.out.println(list.stream().mapToInt((s) -> s).sum());
		System.out.println(list.stream().filter(n -> n > 5).count());
		System.out.println(
				list.stream().filter(n -> n > 5).reduce((s1, s2) -> s1 + s2).orElse(0));
	}

	@Test
	public void testArrayToString() {

		String toString = Arrays.toString(a);

		System.out.println(toString);
		assertTrue(toString.contains("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]"));
		assertTrue(toString.equals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]"));
	}

}
