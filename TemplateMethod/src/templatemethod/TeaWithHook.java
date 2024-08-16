package templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TeaWithHook extends CaffeineBeverageWithHook{
    @Override
    void brew() {
        System.out.println("찻잎을 우려냅다");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬을 추가한다");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        } else{
            return false;
        }
    }

    private String getUserInput(){
        String answer = null;

        System.out.println("홍차에 레몬을 넣을까요");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        } catch (IOException e){
            System.out.println(e);
        }

        if(answer == null){
            return "no";
        }
        return answer;
    }
}
