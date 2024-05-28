class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            // 가로, 세로 중 더 긴쪽을 가로로 둠.
            if (size[0] < size[1]) {
                int temp = size[0];
                size[0] = size[1];
                size[1] = temp;
            }

            if (maxWidth < size[0])
                maxWidth = size[0];

            if (maxHeight < size[1])
                maxHeight = size[1];
        }

        return maxWidth * maxHeight;
    }
}