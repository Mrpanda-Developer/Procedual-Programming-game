package Game;
/* this class wil handle the animations*/
public class Animation {
    public static void bossDefeated() {
        //yes I am that petty to add the fibonacci sequence, because last year
        //I failed your programming exam because I didn't know it :)
        int[] fib = {1, 1, 2, 3, 5, 8, 13}; 

        System.out.println("\nThe Golden Ratio spiral forms before your eyes...\n");
        //size of the grid
        int size = fib[fib.length - 1] * 2;
        char[][] grid = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = ' ';
            }
        }

        // place the arcs
        int x = size / 2;
        int y = size / 2;
        int dir = 0; // 0=right, 1=down, 2=left, 3=up

        for (int n : fib) {
            drawArc(grid, x, y, n, dir);
            // change centrum
            switch (dir) {
                case 0 -> x += n;   // to the right
                case 1 -> y += n;   // down
                case 2 -> x -= n;   // to the left
                case 3 -> y -= n;   // up
            }
            dir = (dir + 1) % 4; // change direction
        }

        // print grid
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        // ASCII Victory Banner
        System.out.println("\n\n" +
                "██    ██  ██████  ██     ██     ██     ██  ███    ██ \n" +
                " ██  ██  ██    ██ ██     ██     ██     ██  ████   ██ \n" +
                "  ████   ██    ██ ██  █  ██     ██     ██  ██ ██  ██ \n" +
                "   ██    ██    ██ ██ ███ ██     ██     ██  ██  ██ ██ \n" +
                "   ██     ██████   ███ ███       ███████   ██   ████ \n" +
                "\n                Y O U   W O N !\n");
    }

    // draw a quarter circle arc
    private static void drawArc(char[][] grid, int cx, int cy, int r, int dir) {
        for (int angle = 0; angle <= 90; angle += 5) {
            double rad = Math.toRadians(angle);
            int x = 0, y = 0;
            switch (dir) {
                case 0 -> { // right
                    x = cx + (int) Math.round(r * Math.cos(rad));
                    y = cy + (int) Math.round(r * Math.sin(rad));
                }
                case 1 -> { // down
                    x = cx - (int) Math.round(r * Math.sin(rad));
                    y = cy + (int) Math.round(r * Math.cos(rad));
                }
                case 2 -> { // left
                    x = cx - (int) Math.round(r * Math.cos(rad));
                    y = cy - (int) Math.round(r * Math.sin(rad));
                }
                case 3 -> { // up
                    x = cx + (int) Math.round(r * Math.sin(rad));
                    y = cy - (int) Math.round(r * Math.cos(rad));
                }
            }
            if (y >= 0 && y < grid.length && x >= 0 && x < grid[0].length) {
                grid[y][x] = '*';
            }
        }
    }
}
