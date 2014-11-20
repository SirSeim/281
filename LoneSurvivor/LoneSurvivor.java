public class LoneSurvivor {
    public static void main (String[] args) {
        CircularList circle = new CircularList();

        if (args.length < 2) {
            throw new IllegalArgumentException();
        }

        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        if (k > n) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < n; i++) {
            circle.add(i);
        }

        circle.goNext();

        while (circle.size() > 1) {
            for (int i = 0; i < k; i++) {
                circle.goNext();
            }
            circle.remove();
        }

        System.out.println(circle.getCurrent());
    }
}