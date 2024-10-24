package task1;

public class Flows {

    public void methodA(String input) {
        System.out.println("j");
        if (!input.equals("start")) {
            System.out.println("b");
            methodB("start");
        } else {
            System.out.println("a");


        }
        System.out.println("v");
    }

    public void methodB(String start) {
        System.out.println("c");
    }

    public void methodC(String input) {
        System.out.println("v");

    }

    public void methodD(int number) {
        System.out.println("a");
        if (number > 5) {
            System.out.println("e");
        }
        System.out.println("r");
        System.out.println("s");
        System.out.println("j");
        System.out.println("o");
        System.out.println("v");
        System.out.println("t");

    }


}