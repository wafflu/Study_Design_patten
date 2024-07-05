package p13_Visitor;

import p13_Visitor.Directory;

public class ListVisitor extends Visitor{
    private String currentdir = "";

    @Override
    public void visit(File file) {
        System.out.println("FIle : "+currentdir+"/"+file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println("Dir : "+currentdir+"/"+directory);
        String savedir = currentdir;
        currentdir = currentdir+"/"+directory.getName();
        for(Entry entry : directory){
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
