class Solution {
    public long solution(long n) {
        long answer = (long)Math.sqrt(n);
        if(Math.pow(answer, 2) == n) 
            return (long) Math.pow(answer+1, 2);
        else return answer = -1;
	}
}