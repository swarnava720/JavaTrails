class Selectionsort {
    void select(int arr[]) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {

            int x = i;
            for (int j = i + 1; j < len ; j++) {
                if (arr[x] < arr[j]) {
                    x = j;
                }
                int temp = arr[x];
                arr[x] = arr[i];
                arr[i] = temp;
            }
        }
    }

}
