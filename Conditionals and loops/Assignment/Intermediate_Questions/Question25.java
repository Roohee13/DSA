public class Question25 {
    public static void main(String[] args) {
        int aug= 31;
        int count=0;
        for(int i=2;i<=aug;i++){
           if(i%2==0){
            count++;
           } 
        }

        System.out.println("kunal can go out for "+ count+" days in the month of august.");
        
    }
}
