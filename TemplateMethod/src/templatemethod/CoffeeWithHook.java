package templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
    @Override
    void brew() {
        System.out.println("필터로 커피 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("우유와 설탕 추가하는 중");
    }

    //훅 메서드를 오버라이드 해서 원하는 기능을 넣는다
    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        else{
            return false;
        }
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("커피에 우유와 설탕을 넣을까요?");
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
