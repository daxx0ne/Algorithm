class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        for(int i = 0; i < sizes.length; i++){
            int Arr_max = Math.max(sizes[i][0], sizes[i][1]);
            int Arr_min = Math.min(sizes[i][0], sizes[i][1]);
            
            if(Arr_max > max) {max = Arr_max;}
            if(Arr_min > min) {min = Arr_min;}
        }
        int answer = max * min;
        return answer;
    }
}