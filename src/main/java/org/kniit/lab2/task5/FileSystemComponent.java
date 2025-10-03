package org.kniit.lab2.task5;

public class FileSystemComponent {
    protected String name;
    protected int size;

    public FileSystemComponent(String name, int size){
        this.name = name;
        this.size = size;
    } 

    public String getName(){
        return this.name;
    }

    public int getSize(){
        return this.size;
    }

    protected void display(String indent, int nesting){
    }
}
