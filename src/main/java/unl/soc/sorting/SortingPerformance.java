package unl.soc.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A benchmark suite that runs several sorting algorithms on a set of data to
 * demonstrate efficiency.
 */
public class SortingPerformance {

	public static void main(String args[]) {

		long start, end, elapsedTimeNs;
		int sizes[] = { 100, 1000, 10000, 20000, 40000, 80000 };

		System.out.printf("%12s%12s%12s%12s%12s%12s\n", "Size", "Selection", "Parallel", "Insertion", "Quick",
				"Timsort");

		// for each size...
		for (int n : sizes) {

			System.out.printf("%12d", n);

			// get n random locations
			List<Location> locations = LocationUtils.getRandomList(n);
			List<Location> copy;

			// get a *deep copy* of the list *for each experiment* so as not
			// to bias the performance
			copy = new ArrayList<>(locations);
			// start the timer
			start = System.nanoTime();
			// call the sorting method
			SortingAlgorithms.selectionSort(copy);
			// end the timer
			end = System.nanoTime();
			// report the time
			elapsedTimeNs = (end - start);
			System.out.printf("%12.4f", (elapsedTimeNs / 1000000000.0));

			// parallel
			copy = new ArrayList<>(locations);
			start = System.nanoTime();
			SortingAlgorithms.parallelMergeSort(copy);
			end = System.nanoTime();
			elapsedTimeNs = (end - start);
			System.out.printf("%12.4f", (elapsedTimeNs / 1000000000.0));

			// insertion
			copy = new ArrayList<>(locations);
			start = System.nanoTime();
			SortingAlgorithms.insertionSort(copy);
			end = System.nanoTime();
			elapsedTimeNs = (end - start);
			System.out.printf("%12.4f", (elapsedTimeNs / 1000000000.0));

			// quick
			copy = new ArrayList<>(locations);
			start = System.nanoTime();
			SortingAlgorithms.quickSort(copy);
			end = System.nanoTime();
			elapsedTimeNs = (end - start);
			System.out.printf("%12.4f", (elapsedTimeNs / 1000000000.0));

			// timsort
			copy = new ArrayList<>(locations);
			start = System.nanoTime();
			Collections.sort(copy);
			end = System.nanoTime();
			elapsedTimeNs = (end - start);
			System.out.printf("%12.4f", (elapsedTimeNs / 1000000000.0));

			System.out.printf("\n");

		}

	}
}
