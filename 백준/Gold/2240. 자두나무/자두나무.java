import java.util.Arrays;
        import java.util.Scanner;

public class Main{
    static int c;
    static int d;
    static int[][][] memo;
    static int[] arr;
    public static int dp(int index, int location, int count){ 
        if(index == c || count==d+1){ 
            return 0;
        }
        if(memo[index][location][count] != -1) return memo[index][location][count];

        int temp = 0;
        if(location == arr[index]) temp = Math.max(dp(index+1, location, count)+1, temp);
        else temp = Math.max(dp(index+1, location, count), temp);

        if(location == 2){
            if(location == arr[index]) temp = Math.max(dp(index+1, 1, count+1)+1, temp);
            else temp = Math.max(dp(index+1, 1, count+1), temp);
        }

        //1번위치 -> 2번 위치
        if(location == 1){
            if(location == arr[index]) temp = Math.max(dp(index+1, 2, count+1)+1, temp);
            else temp = Math.max(dp(index+1, 2, count+1), temp);
        }
        memo[index][location][count] = temp;
        return memo[index][location][count];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        c = scan.nextInt(); 
        d = scan.nextInt(); 
        memo = new int[c][3][31];
        arr = new int[c];
        for(int i=0; i<c; i++) arr[i] = scan.nextInt();

        for(int[][] a : memo){
            for(int[] b : a) Arrays.fill(b, -1);
        }

        int max = 0;
        max = Math.max(dp(0, 1, 0), max); 
        max = Math.max(dp(0,2,1),max); 
        System.out.println(max);

    }
}