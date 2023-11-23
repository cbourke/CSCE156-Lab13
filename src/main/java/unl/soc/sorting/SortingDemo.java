package unl.soc.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * An ad-hoc tester/demonstration that allows you to run, troubleshoot and debug
 * your sorting algorithms.
 * 
 *
 */
public class SortingDemo {

	public static void main(String args[]) {

		List<Location> locations = new ArrayList<>(LocationUtils.LOCATIONS.subList(0, 10));

		System.out.println("Original Locations: ");
		for (Location loc : locations) {
			System.out.println(loc);
		}

		// change the call to whichever sorting method you want to test/troubleshoot
		SortingAlgorithms.selectionSort(locations);

		System.out.println("Sorted Locations:");
		for (Location loc : locations) {
			System.out.println(loc);
		}

	}
}
