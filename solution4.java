
class Solution {

    public static void reverseArray(int arr[]) {
        // code here
        int i = 0;
        int j = (arr.length - 1);
        while (i <= j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
