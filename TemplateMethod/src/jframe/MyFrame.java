package jframe;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300,300);
        this.setVisible(true);
    }

    // JFrame의 update()알고리즘은 paint()를 호출한다
    // 기본적으로 paint()는 아무것도 하지않는 훅 메서드이다 paint()를 오버라이드해서 메시지를 그릴 수 있다
    public void paint(Graphics graphics){
        super.paint(graphics);
        String msg = "good";
        graphics.drawString(msg, 100,100);
    }

    public static void main(String[] args){
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
