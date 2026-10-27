class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;

        // Loop through pairs of consecutive points
        for (int i = 0; i < points.length - 1; i++) {
            int currentX = points[i][0];
            int currentY = points[i][1];
            
            int nextX = points[i + 1][0];
            int nextY = points[i + 1][1];

            // Calculate absolute difference in X and Y directions
            int diffX = Math.abs(nextX - currentX);
            int diffY = Math.abs(nextY - currentY);

            // Time needed between two points is max(diffX, diffY)
            totalTime += Math.max(diffX, diffY);
        }

        return totalTime;
    }
}