package p12_Decorator_patten;

public abstract class Border extends Display{
    // 장식틀을 감싸는 내용물
    protected Display display;
    // 객체 생성 시 내용물을 인수로 지정
    protected Border(Display display){
        this.display = display;
    }
}
