package org.kniit.lab2.task5;
import java.util.ArrayList;
import java.util.Collections;

public class Folder extends FileSystemComponent{
    private ArrayList<FileSystemComponent> content  = new ArrayList<>();

    public Folder(String name){
        super(name, 0);
    }

    public void add(FileSystemComponent fyleSystemComponent){
        content.add(fyleSystemComponent);
        this.size += fyleSystemComponent.size;
    }

    public void remove(FileSystemComponent fyleSystemComponent){
        content.remove(fyleSystemComponent);
        this.size -= fyleSystemComponent.size;
    }

    @Override
    public void display(String indent, int nesting){
        String spaces = String.join("", java.util.Collections.nCopies(nesting, indent));
        System.out.println(spaces + getName() + " (" + this.getSize() + " bytes)");
        for (FileSystemComponent fyleSystemComponent: this.content){
            fyleSystemComponent.display(indent, nesting + 1);
        }
    }
}
