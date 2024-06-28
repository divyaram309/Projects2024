package interViewQest;

public class FindLowerUpperCount {
    public static void main(String[] args) {
        String data ="DIvya Sree";

        int lower= 0;
        int upper =0;
        for(int i=0;i< data.length();i++){
            char ch= data.charAt(i);
            if(ch>=65&&ch<=90){
                upper++;
            }
            else {
                lower++;
            }
            System.out.println("up"+upper);
            System.out.println("lo"+lower);
        }
    }
}
