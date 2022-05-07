public class OneDMaze {
    public static void main(String[] args) {
        int[] maze = {1,1,1,1,1,1,1,1};
        int[] maze2 = {1,2,5,1,1,1,1,1};
        int[] solution = solveMaze(maze);
        System.out.println("Maze input: ");
        printArray(maze);
        System.out.println("======================");
        System.out.println("Solution: ");
        printArray(solution);
    }

    public static int[] solveMaze(int[] maze) {
        int[] empty = {};
        if (maze.length == 1) {
            return maze;
        } else if (maze.length == 0) {
            return empty;
        }
        int[] result = new int[maze.length];
        boolean[] visited = new boolean[maze.length];
        // while (true) {
        //     break;
        // }
        return result;
    }

    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.print("]\n");
    }
}