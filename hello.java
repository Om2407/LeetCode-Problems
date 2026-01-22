public class array9 {
    // same as array5 Q but the element with max frequency
    //which element is repeated max no. of times
    public static void main(String args[]) {
        int arr[] = { 1, 1, 1, 2, 2, 3, 4, 5, 2, 3, 1, 5, 23, 45, 1 };
        int n = arr.length;
        boolean visited[] = new boolean[n];

        int maxcount = 0;
        int maxElement = arr[0];

        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    visited[j] = true;
                }
            }
            if (count > maxcount) {
                maxcount = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Element with the fmax fqy : " + maxElement);
        System.out.println("Frequency = : " + maxcount);
    }
}
