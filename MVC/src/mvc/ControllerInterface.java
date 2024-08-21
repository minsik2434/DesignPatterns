package mvc;

public interface ControllerInterface {
    //시작
    void start();
    //중지
    void stop();
    //BPM 증가
    void increaseBPM();
    //BPM 감소
    void decreaseBPM();
    //BPM 설정
    void setBPM(int bpm);
}
