public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean positive = (a > 0) && (b > 0) && (c > 0);

        long aa = (long) a * (long) a;
        long bb = (long) b * (long) b;
        long cc = (long) c * (long) c;

        boolean pyth = (aa + bb == cc) || (aa + cc == bb) || (bb + cc == aa);

        System.out.println(positive && pyth);
    }
}