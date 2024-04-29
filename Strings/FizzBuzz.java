import java.util.*;
class Main{
    public static List<String> FizzBuzz(int n){
        List<Integer> answer = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                answer.add(Integer.valueOf("FizzBuzz"));
            }
            else if(i%3==0){
                answer.add(Integer.valueOf("Fizz"));
            }
            else if(i%5==0){
                answer.add(Integer.valueOf("Buzz"));
            }
            else{
                answer.add(Integer.valueOf(String.valueOf(i)));
            }
        }
        return answer;
    } 
}