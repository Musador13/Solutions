public class Ten {

    public static void main(String[] args) {

    }

    static class Play1 {

        private int x, y;

        public void foo(int x1, int y1) {
            x = x1;
            y = y1;
        }

        public int[] get(int x1, int y1) {
            return new int[]{x1 - x, y1 - y};
        }
    }

    static final class Play2 extends Play1 {

        public void ff(int x1, int y1, int z1) {
            foo(x1, y1);
        }

        public int[] get(int x1, int y1, int z1) {
            return new int[]{};
        }
    }
}
