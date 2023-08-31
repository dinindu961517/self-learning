public class HasTheTwoArraysGotSameMethod {
    public static void main(String[] args) {
        int[] input1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] input2 = new int[]{8, 25, 45, 8, 9, 7};
        System.out.println(hasSameElements(input1,input2));

    }

    public static boolean hasSameElements(int[] input1, int[] input2) {
        for (int i : input1) {
            for (int i1 : input2) {
                if (i==i1) return true;
            }
        }
        return false;
    }
}
