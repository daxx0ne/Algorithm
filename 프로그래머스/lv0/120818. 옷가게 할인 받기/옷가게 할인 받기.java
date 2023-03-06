class Solution {
    public int solution(int price) {
        if(100000 <= price && price < 300000){
            return (price * 95) / 100;
        }
        else if(300000 <= price && price < 500000){
            return (price * 90) / 100;
        }
        else if(500000 <= price){
            return (price * 80) / 100;
        }        
        else{
            return price;
        }
    }
}