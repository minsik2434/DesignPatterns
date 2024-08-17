package arrays;

//서브 클래스를 만들어서 쓰는 대신 Comparable 인터페이스를 구현해서 사용해야함
public class Duck implements Comparable<Duck>{
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString(){
        return name + "체중 : " + weight;
    }

    //sort() 메서드에서 필요로하는 메서드 (추상 메서드)
    @Override
    public int compareTo(Duck o) {
        if(this.weight < o.weight){
            return -1;
        }
        else if(this.weight == o.weight){
            return 0;
        }
        else{
            return 1;
        }
    }
}
