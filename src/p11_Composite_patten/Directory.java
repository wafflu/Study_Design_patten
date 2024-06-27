package p11_Composite_patten;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry{
    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getSize(){
        int size = 0;
        for(Entry entry : directory){
            size += entry.getSize(); // 자기자신 호출
        }
        return size;
    }

    @Override
    protected void printList(String prefix){
        System.out.println("d1 : "+prefix+"/"+this);
        for(Entry entry : directory){
            entry.printList(prefix+"/"+name); // 자기자신 호출
        }
    }

    public Entry add(Entry entry){
        directory.add(entry);
        return this;
    }
}
