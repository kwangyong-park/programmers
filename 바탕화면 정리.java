class Solution {
    public int[] solution(String[] wallpaper) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        
        for(int i = 0; i < wallpaper.length; i++) {
            char[] row = wallpaper[i].toCharArray();
            for(int j = 0; j < row.length; j++) {
                if(row[j] == '#') {
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }
        }

        if (minX == Integer.MAX_VALUE) {
            return new int[]{0, 0, 0, 0};
        }

        return new int[]{minX, minY, maxX + 1, maxY + 1};
    }
}
