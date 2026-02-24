package unl.soc.sorting;

import java.util.Arrays;
import java.util.List;

/**
 * A collection of sorting algorithm implementations for Lists of
 * {@link Location} objects.
 *
 */
public class SortingAlgorithms {

	/**
	 * A basic implementation of
	 * <a href="https://en.wikipedia.org/wiki/Selection_sort">Selection Sort</a>.
	 * 
	 * @param locations
	 */
	public static void selectionSort(List<Location> locations) {
		for (int i = 0; i < locations.size(); i++) {
			int minIndex = i;
			for (int j = i + 1; j < locations.size(); j++) {
				if (locations.get(j).compareTo(locations.get(minIndex)) < 0) {
					minIndex = j;
				}
			}
			// swap
			Location temp = locations.get(i);
			locations.set(i, locations.get(minIndex));
			locations.set(minIndex, temp);
		}
	}

	/**
	 * A basic implementation of
	 * <a href="https://en.wikipedia.org/wiki/Insertion_sort">Insertion Sort</a>.
	 * 
	 * @param locations
	 */
	public static void insertionSort(List<Location> locations) {
		// TODO: implement insertion sort here
	}

	/**
	 * A parallelized version of merge sort in which each recursion is done in
	 * parallel asynchronously.
	 * 
	 * @param locations
	 */
	public static void parallelMergeSort(List<Location> locations) {

		// dump the list to an array
		Location[] locationArray = locations.toArray(Location[]::new);
		// sort it in parallel
		Arrays.parallelSort(locationArray);
		// clear the original list...
		locations.clear();
		// and put the now-sorted array back in
		locations.addAll(Arrays.asList(locationArray));
	}

	/**
	 * A recursive implementation of
	 * <a href="https://en.wikipedia.org/wiki/Quicksort">Quick Sort</a>.
	 * 
	 * @param locations
	 */
	public static void quickSort(List<Location> locations) {
		quickSortRecursive(locations, 0, locations.size() - 1);
	}

	/**
	 * Recursive call for the {@link #quickSort(List)} method.
	 * 
	 * @param locations
	 * @param low
	 * @param high
	 */
	private static void quickSortRecursive(List<Location> locations, int low, int high) {
		// TODO: implement the top-level quick sort method here
	}

	/**
	 * Swaps the locations in the given {@code List<Location>} identified by the
	 * indices {@code x, y}.
	 * 
	 * @param locations
	 * @param x
	 * @param y
	 */
	private static void swap(List<Location> locations, int x, int y) {
		Location temp = locations.get(x);
		locations.set(x, locations.get(y));
		locations.set(y, temp);
		return;
	}

	/**
	 * A partition method that partitions the given {@code List<Location>} around a
	 * pivot element (the last element is chosen as a pivot). Returns the
	 * <code>index</code> of the pivot element so that all elements
	 * <code>[begin ... index-1]</code> are less than the pivot element and all
	 * elements <code>[index + 1 ... end]</code> are grater than the pivot element.
	 * 
	 * @param locations
	 * @param begin
	 * @param end
	 * @return index of the pivot element
	 */
	private static int partition(List<Location> locations, int begin, int end) {
		// use the last element as our pivot element
		Location pivotElement = locations.get(end);
		int i = (begin - 1);

		for (int j = begin; j < end; j++) {
			// if the j-th location is less than or equal to the pivot...
			if (locations.get(j).compareTo(pivotElement) <= 0) {
				i++;
				// swap the ith and jth element
				Location temp = locations.get(i);
				locations.set(i, locations.get(j));
				locations.set(j, temp);
			}
		}

		// swap (i+1)th and the end
		Location temp = locations.get(i + 1);
		locations.set(i + 1, locations.get(end));
		locations.set(end, temp);

		return i + 1;
	}
}
