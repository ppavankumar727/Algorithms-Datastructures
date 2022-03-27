/*source = https://leetcode.com/problems/guess-number-higher-or-lower/
374. Guess Number Higher or Lower
Easy

We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.
*/
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