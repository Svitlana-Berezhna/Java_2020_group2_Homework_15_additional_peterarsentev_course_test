package ua.testing.task_020;

import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * <h1>Combine</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class Combine {
    private static final Logger log = getLogger(Combine.class);

    private final int[] values;

    public Combine(final int[] values) {
        this.values = values;
    }

    public List<List<Integer>> generate() {
        return transposition(this.values, this.values.length, null);
    }

    private List<List<Integer>> transposition(int[] arr, int length, List<List<Integer>> allTranspositions) {
        List<Integer> oneTransposition = new ArrayList<>();
        if (allTranspositions == null)
            allTranspositions = new ArrayList<>();
        if (length < 2) {
            for (int value : arr)
                oneTransposition.add(value);
            allTranspositions.add(oneTransposition);
        } else for (int i = 0; i < length; i++) {
            swap(arr, i, length - 1);
            transposition(arr, length - 1, allTranspositions);
            swap(arr, length - 1, i);
        }
        return allTranspositions;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
