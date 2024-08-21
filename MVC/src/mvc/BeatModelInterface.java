package mvc;

public interface BeatModelInterface {
    //컨트롤러가 모델에게 사용자 입력을 전달할때 사용하는 메서드 initialize(), on() setBPM()
    void initialize();
    void on();
    void off();
    void setBPM(int bpm);

    //뷰와 컨트롤러가 상태를 알아내거나 옵저버로 등록할 때 사용하는 메서드
    int getBPM();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
