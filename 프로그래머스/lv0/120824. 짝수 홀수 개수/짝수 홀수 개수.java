class Solution {
    public int[] solution(int[] num_list) {
        
        int[] answer = new int [2];
        int evv=0;
        int odd=0;
        
        for(int i = 0; i < num_list.length; i++){
            
            if(num_list[i] % 2 == 0){
                
                evv++;
            }
            else{
                odd++;
            }
        }
        
        answer[0] = evv;
        answer[1] = odd;
        
        return answer;
    }
}