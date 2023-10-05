public class Gride_ways {

    public static int count_ways(int i, int j, int n, int m) { // (source, total)
        if (i == n - 1 && j == m - 1) { // last cell
            return 1;
        } else if (i == n || j == m) { // boundary condition
            return 0;
        }

        int w1 = count_ways(i + 1, j, n, m);
        int w2 = count_ways(i, j + 1, n, m);
        return w1 + w2;
    }
    public static void main(String args[]) {
        int n = 5, m = 5;
        System.out.println(count_ways(0, 0, n, m));
    }
}
