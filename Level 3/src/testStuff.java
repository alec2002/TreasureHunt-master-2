import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;


public class testStuff {
	int arr[] = {6,3,12,7,6};
	int arr2[] = {3,6,6,7,12};
	@Test
	public void test() {
		
		assertArrayEquals(arr2, sortArray(arr));
	}
	int sortArray(int[5]){
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
