public class CountNoOfEven {
    public static int countEvens(int[] numbers) {
        int sum=0;
        int i;
        for(i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                sum ++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("[1, 2, 3, 4, 5] → " + 
            countEvens(new int[]{1, 2, 3, 4, 5}));    // 2
            
        System.out.println("[2, 4, 6, 8] → " + 
            countEvens(new int[]{2, 4, 6, 8}));       // 4
            
        System.out.println("[1, 3, 5, 7] → " + 
            countEvens(new int[]{1, 3, 5, 7}));       // 0
            
        System.out.println("[] → " + 
            countEvens(new int[]{}));                 // 0
            
        System.out.println("[0, 11, 22, 33] → " + 
            countEvens(new int[]{0, 11, 22, 33}));    // 2
    }
}

