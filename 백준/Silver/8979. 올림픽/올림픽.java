import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt(); //나라 수
        int k=scan.nextInt(); //알고싶은 나라 번호
        int result=1;
        int[][] medals = new int[n][4];
        long[][] score_medals = new long[n][2];//가중치 점수 부여된 배열

        for(int i=0;i<n;i++) {
            for(int j=0;j<4;j++){
            medals[i][j]=scan.nextInt(); //국가들의 메달 정보를 저장
            }
        }

        for(int i=0;i<n;i++) {
            score_medals[i][0]=medals[i][0]; //국가 번호는 그냥 복붙
            score_medals[i][1]=(medals[i][1]*1000000000000L)+(medals[i][2]*1000000)+(medals[i][3]*1); //score_medals[국가번호][1]위치에 각 국가의 점수를 저장
        }

        /*
        //출력 잘되나 확인
        for(int i=0;i<n;i++) {
            for(int j=0;j<2;j++){
            System.out.print(score_medals[i][j]+", ");
            }
            System.out.println("");
        }

        */    

        for(int i=0;i<n;i++) {
            if(score_medals[i][0]==k){
                for(int j=0;j<n;j++){
                    if(score_medals[i][1]<score_medals[j][1])
                        result++;
                }
                break;
            }
        }

        //k나라 순위 알려주기
            System.out.println(result); 
        }
    }