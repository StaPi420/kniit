package org.kniit.lab1.task2;
// import org.kniit.lab1.task2.SimpleURL;

// https://javarush.com/groups/posts/1928-getterih-i-setterih

public class Main {
    public static void main(String[] args){
        SimpleURL url = new SimpleURL();

        url.setProtocol("https");
        url.setAdress("javarush.com");
        url.setWebPageName("groups/posts/1928-getterih-i-setterih");

        System.out.println(url);
    }
}
