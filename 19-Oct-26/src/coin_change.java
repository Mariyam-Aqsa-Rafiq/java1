public class coin_change {

    static int num_of_ways(int coins[],int amount)
    {
        int dp[]=new int[amount+1];
        dp[0]=1;

        for (int coin:coins)
        {
            for (int i=0;i<=amount;i++)
            {
                dp[i]=dp[i]+dp[i-coin];
            }
        }
        return dp[amount];
    }
    public static void main(String[] args) {
        int coins[]={1,2,5};
        int amount=5;

    }
}
