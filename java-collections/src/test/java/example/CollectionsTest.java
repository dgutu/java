package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CollectionsTest {

	private String[] strings = { "unu", "doi", "trei", "patru", "cinci", "sase", "sapte",
			"opt", "noua", "zece" };

	private int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	private int[] b = { 11, 12, 13, 14, 15 };
	private Integer c[] = new Integer[10];

	@Before
	public void Before() {
		// copy array a to c
		System.arraycopy(a, 0, c, 0, a.length);
	}

	@Test
	public void test1() throws Exception {
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(strings));

		for (String string : arrayList) {
			System.out.println(string);
		}
	}

	@Test
	public void test2() throws Exception {
		ArrayList<String> arrayList = new ArrayList<String>();

		for (String string : arrayList) {
			System.out.println(string);
		}

		ArrayList<Integer> integers = new ArrayList<Integer>(Arrays.asList(c));

		for (Iterator<Integer> iterator = integers.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}

}
