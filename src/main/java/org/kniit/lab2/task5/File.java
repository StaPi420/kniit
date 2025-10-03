package org.kniit.lab2.task5;

public class File extends FileSystemComponent{
    public File(String name, int size){
        super(name, size);
    }

    @Override
    public void display(String indent, int nesting){
        String spaces = String.join("", java.util.Collections.nCopies(nesting, indent));
        System.out.println(spaces + getName() + " (" + this.getSize() + " bytes)");
    }
}
