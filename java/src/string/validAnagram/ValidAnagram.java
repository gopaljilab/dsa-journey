package string.validAnagram;

import java.util.Arrays;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        // Use your custom sorting method
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        /*// Use external sorting method
        sortCharArray(chars1, 0, chars1.length-1);
        sortCharArray(chars2, 0, chars2.length-1);*/

        String newString1 = Arrays.toString(chars1);
        String newString2 = Arrays.toString(chars2);
        return newString1.equals(newString2);
    }

    private void sortCharArray(char[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sortCharArray(arr, left, mid);
            sortCharArray(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(char[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        char[] L = new char[n1];
        char[] R = new char[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}
