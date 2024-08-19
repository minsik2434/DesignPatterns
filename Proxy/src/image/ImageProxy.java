package image;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon{
    //imageIcon 은 이미지 로딩이 끝났을때 실제 이미지를 화면에 표시하는 진짜 아이콘 객체이다
    volatile ImageIcon imageIcon;
    final URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    //이미지의 URL을 생성자에게 전달한다 로딩이 끝나면 이 URL에 있는 이미지를 화면에 표시한다
    public ImageProxy(URL url){
        imageURL = url;
    }

    //이미지가 로딩중이면 기본 넓이(800)반환하고 로딩되면 로딩된 이미지 넓이 반환
    @Override
    public int getIconWidth(){
        if(imageIcon != null){
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    //이미지가 로딩중이면 기본 높이(600)반환하고 로딩되면 로딩된 이미지 높이 반환
    @Override
    public int getIconHeight(){
        if(imageIcon != null){
            return imageIcon.getIconHeight();
        } else{
            return 600;
        }
    }

    //아이콘이 로딩됬으면 로딩된 이미지를 출력하고 아니면 텍스트를 반환
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if(imageIcon != null){
            imageIcon.paintIcon(c,g,x,y);
        }
        else{
            g.drawString("앨범 커버를 불러오는중입니다 잠시만 기다려주세요 " , x+300, y+190);
            //이미지 로딩 중이 아니면
            if(!retrieving){
                retrieving = true; //이미지 로딩 작업을 시작한다


                //진짜 아이콘 이미지를 로딩하는 부분, IcomImage를 사용해서 이미지를 로딩하는 과정은 동기화 되어 진행된다
                //로딩이 끝나기전까지 ImageIcon 생성자에서 아무것도 리턴하지 않는다 따라서 화면을 갱신할 수 없고 출력할 수 없으므로 비동기 방식으로
                //작업을 처리해야한다
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            setImageIcon(new ImageIcon(imageURL, "Album Cover"));
                            c.repaint();
                        } catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }
    //ImageIcon 은 2 개의 서로 다른 쓰레드에서 사용한다 따라서 변수를 volatile로 선언하면서 동기화된 세터 메서드를 사용한다
    synchronized void setImageIcon(ImageIcon imageIcon){
        this.imageIcon = imageIcon;
    }
}
