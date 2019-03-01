public class Main {

    //Questions
    /**
     * What is memoization
     * What is time complexity of recursive algorithm
     *
     */


    public static void main(String[] args) {
//        System.out.println(fib2(5));
//        System.out.println(fact(5));
//        System.out.println(starSeparated("Star separated"));
//        System.out.println(nestedParanthesis("(())"));
//        System.out.println(fib3(5));
        towersOfHenoi(3, 1, 3);
    }

    public static int fib2(int n) {
        if (n == 0 || n == 1) return 1;
        return fib2(n - 1) + fib2(n - 2);
    }

    public static int fact(int n) {
        if (n == 1) return 1;
        return n * fact(n - 1);
    }

    public static String starSeparated(String str) {
        if (str.length() == 1) return str;
        return str.charAt(0) + "*" + starSeparated(str.substring(1));
    }

    public static boolean nestedParanthesis(String str) {
        if (str.equals("()")) {
            return true;
        } else if (str.length() < 2) {
            return false;
        } else {
            return nestedParanthesis(str.substring(1, str.length() - 1));
        }
    }

    /*
    n  "((()))))"
    n  "(())))"
    n  "()))"
    n  "))"
    n  ""
    */

    public static int fib3(int n) {
        if (n == 0) return 1;
        if (n == 1) return 2;
        if (n == 2) return 3;
        return fib3(n - 1) + fib3(n - 2) + fib3(n - 3);
    }

    public static void towersOfHenoi(int rings, int start, int end) {
        if (rings == 1) {
            System.out.println(start + " --> " + end);
        }
        System.out.println(rings);
        towersOfHenoi(rings - 1, start, 3 - start - end);
    }




}
