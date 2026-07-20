package polymorphism;

public class Test17_MOVL_TC3_7 {

    //  static void m1(int i) {
    //      System.out.println("int-param i: " + i);
    //  }

    // static void m1(long l) {
    //     System.out.println("long-param l: " + l);
    // }

    // static void m1(float f) {
    //     System.out.println("float-param f: " + f);
    // }

    // static void m1(double d) {
    //     System.out.println("double-param d: " + d);
    // }

    // static void m1(Integer io) {
    //     System.out.println("Integer-param io: " + io);
    // }

    // static void m1(Long l) {
    //     System.out.println("Long-param l: " + l);
    // }

    // static void m1(Number n) {
    //     System.out.println("Number-param n: " + n);
    // }

    // static void m1(Object o) {
    //     System.out.println("Object-param o: " + o);
    // }

    // static void m1(int... iva) {
    //     System.out.println(
    //         "int var arg-param iva: " + iva + " -> "
    //         + java.util.Arrays.toString(iva)
    //     );
    // }

    // static void m1(long... lva) {
    //     System.out.println(
    //         "long var arg-param lva: " + lva + " -> "
    //         + java.util.Arrays.toString(lva)
    //     );
    // }

    // static void m1(float... fva) {
    //     System.out.println(
    //         "float var arg-param fva: " + fva + " -> "
    //         + java.util.Arrays.toString(fva)
    //     );
    // }

    // static void m1(double... dva) {
    //     System.out.println(
    //         "double var arg-param dva: " + dva + " -> "
    //         + java.util.Arrays.toString(dva)
    //     );
    // }

    // static void m1(Integer... i) {
    //     System.out.println(
    //         "Integer var arg-param i: " + i + " -> "
    //         + java.util.Arrays.toString(i)
    //     );
    // }

    // static void m1(Long... l) {
    //     System.out.println(
    //         "Long var arg-param l: " + l + " -> "
    //         + java.util.Arrays.toString(l)
    //     );
    // }

    // static void m1(Number... n) {
    //     System.out.println(
    //         "Number var arg-param n: " + n + " -> "
    //         + java.util.Arrays.toString(n)
    //     );
    // }

    static void m1(Object... o) {
        System.out.println(
            "Object var arg-param o: " + o + " -> "
            + java.util.Arrays.toString(o)
        );
    }

    public static void main(String[] args) {
        m1(Integer.valueOf(5));
    }
}