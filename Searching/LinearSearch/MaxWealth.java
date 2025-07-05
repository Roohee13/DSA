public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts=  {{1,5} ,{7,3},
                            {3,5}    };
        System.out.println(maximumwealth(accounts));
    }

    static int maximumwealth(int[][] accounts){
        int max=0;

        for(int i=0;i<accounts.length;i++){
            int count=0;
            for(int j=0;j<accounts[i].length;j++){
                count= count + accounts[i][j];

                if(count> max){
                    max= count;
                }
            }
        }

        return max;
    }
}
