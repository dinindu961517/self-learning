package pack1;

import java.util.ArrayList;

public class MethodSignature {
    public static void main(String[] args) {

    }
    public void myMethod1(int x, int y, short z) {
        //
    }

    public void myMethod1(int x, short y, int z) {
        //
    }

//    protected void myMethod1(int x, int y, short z) {
//
//    }
    final void myMethod1(int x, int y, short z) {

    }
    int myMethod1(int x, int y, short z) {
        return -1;
    }
//
    private boolean myMethod1(int x, int y, short z) {
        return false;
    }
    public boolean myMethod2(int x, int y, short z) {
        return false;
    }
//
    public void myMethod1(ArrayList<Integer> myArray) {

    }

    public void myMethod1(ArrayList<String> myArray) {

    }
    public void myMethod1(ArrayList<Double> myArray) {

    }
}
