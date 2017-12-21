public class toBit {
    private static void intToBit (int userInt){
        int[] iArray = new int[32];
        int count = 0;
        for(int i=31; i>=0;i--){

           if(userInt/Math.pow(2,i)>=1){
               iArray[i]=1;
               userInt = (int) (userInt - Math.pow(2,i));

           }
           else{
               iArray[i] = 0;

           }
            System.out.print(iArray[i]);
           if (++count ==8){
               System.out.println("\n");
               count = 0;
           }

        }
    }



    public static void main(String[] args) {
       intToBit(405);
        String s = Integer.toString(405,2);

        while(s.length()!=31){
            s = "0"+s;
        }
        System.out.println(s);

    }
}
