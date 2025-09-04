public class ShortestPath {
    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.println("Shortest Path: " + CalculateShortestPath(path));
    }

    public static float CalculateShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            switch (direction) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float)Math.sqrt(x2 + y2);
    }
}
