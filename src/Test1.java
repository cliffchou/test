class Test1 {

    public static void main(String[] args){
        int[] piles = {5,3,4,5};
        System.out.print(stoneGame(piles));
    }

    public static boolean stoneGame(int[] piles) {
        if(piles.length < 2)
            return true;
        int i = 0;
        int j = piles.length - 1;
        int sum = 0;
        int target = 0;
        for(int m = 0; m < piles.length; m++){
            target += piles[m];
        }

        while(i < j){
            //李选大
            if(piles[i] > piles[j]){
                sum += piles[i];
                i++;
            }else{
                sum += piles[j];
                j--;
            }

            //亚选小
            if(piles[i] < piles[j]){
                i++;
            }else{
                j--;
            }
        }
        if(sum * 2 > target){
            return true;
        }else{
            return false;
        }
    }
}