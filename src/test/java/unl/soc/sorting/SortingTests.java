package unl.soc.sorting;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Timeout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTests {

	/**
	 * Tests {@link SortingAlgorithms#insertionSort(List)} on a small (5) randomly
	 * selected list of {@link Location} instances.
	 * 
	 * Test will time out after a maximum of 5 seconds. If code takes longer than 5
	 * seconds it is likely stuck in an infinite loop.
	 * 
	 * This test allows you to more easily troubleshoot with a smaller sample.
	 */
	@Timeout(5)
	public void insertionSortTest01() {
		List<Location> locations = LocationUtils.getRandomList(5);
		List<Location> actual = new ArrayList<>(locations);
		List<Location> expected = new ArrayList<>(locations);
		Collections.sort(expected);
		SortingAlgorithms.insertionSort(actual);

		assertEquals(expected, actual, "Insertion sort did not match the expected sort order for the given list");
	}

	/**
	 * Repeatedly (10 times) tests {@link SortingAlgorithms#insertionSort(List)} on
	 * a small (100) randomly selected list of {@link Location} instances.
	 * 
	 * Each test will time out after a maximum of 5 seconds. If code takes longer
	 * than 5 seconds it is likely stuck in an infinite loop.
	 */
	@RepeatedTest(10)
	@Timeout(5)
	public void insertionSortTest() {
		List<Location> locations = LocationUtils.getRandomList(100);
		List<Location> actual = new ArrayList<>(locations);
		List<Location> expected = new ArrayList<>(locations);
		Collections.sort(expected);
		SortingAlgorithms.insertionSort(actual);

		assertEquals(expected, actual, "Insertion sort did not match the expected sort order for the given list");
	}

	/**
	 * Tests {@link SortingAlgorithms#quickSort(List)} on a small (5) randomly
	 * selected list of {@link Location} instances.
	 * 
	 * Test will time out after a maximum of 5 seconds. If code takes longer than 5
	 * seconds it is likely stuck in an infinite loop.
	 * 
	 * This test allows you to more easily troubleshoot with a smaller sample.
	 */
	@Timeout(5)
	public void quickSortTest01() {
		List<Location> locations = LocationUtils.getRandomList(5);
		List<Location> actual = new ArrayList<>(locations);
		List<Location> expected = new ArrayList<>(locations);
		Collections.sort(expected);
		SortingAlgorithms.quickSort(actual);

		assertEquals(expected, actual, "Quick sort did not match the expected sort order for the given list");
	}

	/**
	 * Repeatedly (10 times) tests {@link SortingAlgorithms#quickSort(List)} on a
	 * small (100) randomly selected list of {@link Location} instances.
	 * 
	 * Each test will time out after a maximum of 5 seconds. If code takes longer
	 * than 5 seconds it is likely stuck in an infinite loop.
	 */
	@RepeatedTest(10)
	@Timeout(5)
	public void quickSortTest() {
		List<Location> locations = LocationUtils.getRandomList(100);
		List<Location> actual = new ArrayList<>(locations);
		List<Location> expected = new ArrayList<>(locations);
		Collections.sort(expected);
		SortingAlgorithms.quickSort(actual);

		assertEquals(expected, actual, "Quick sort did not match the expected sort order for the given list");
	}

}
