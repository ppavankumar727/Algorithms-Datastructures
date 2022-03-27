class GuessNumberHigherOrLower{
    public static int pick =  1702766719;
    public static void main(String []args){
        System.out.println(guessNumber(2126753390));
    }
    public static int guessNumber(int n) {
        long low = 1,high = n;
        long mid;
        while(low<=high){
            mid = (((long)low) + ((long)high))/2;
            if(guess((int)mid)==0){
                return (int)mid ;
            }else if(guess((int)mid )== 1){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;

    }
    public static int guess(int n){
        if (n==pick){
            return 0;
        }
        if(n<pick){
            return 1;
        }
        else {
            return -1;
        }
    }
}