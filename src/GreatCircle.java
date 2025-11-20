public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double phi1 = Math.toRadians(x1);
        double lambda1 = Math.toRadians(y1);
        double phi2 = Math.toRadians(x2);
        double lambda2 = Math.toRadians(y2);

        double a = Math.pow(Math.sin((phi2 - phi1) / 2.0), 2.0)
                 + Math.cos(phi1) * Math.cos(phi2) * Math.pow(Math.sin((lambda2 - lambda1) / 2.0), 2.0);

        double r = 6371.0;
        double distance = 2.0 * r * Math.asin(Math.sqrt(a));

        System.out.println(distance + " kilometers");
    }
}
