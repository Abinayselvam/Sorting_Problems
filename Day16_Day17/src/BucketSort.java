import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

        public static void bucketSort(float[] arr) {

            int n = arr.length;

            ArrayList<Float>[] buckets =
                    new ArrayList[n];

            for (int i = 0; i < n; i++) {

                buckets[i] = new ArrayList<>();
            }

            // Put elements into buckets
            for (float num : arr) {

                int index = (int) (num * n);

                buckets[index].add(num);
            }

            // Sort buckets
            for (ArrayList<Float> bucket : buckets) {

                Collections.sort(bucket);
            }

            // Merge buckets
            int index = 0;

            for (ArrayList<Float> bucket : buckets) {

                for (float num : bucket) {

                    arr[index++] = num;
                }
            }
        }
}
