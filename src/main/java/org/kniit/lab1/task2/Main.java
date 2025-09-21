package org.kniit.lab1.task2;
// import org.kniit.lab1.task2.SimpleURL;

// https://javarush.com/groups/posts/1928-getterih-i-setterih

public class Main {
    public static void main(String[] args){
        String strURL = "https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText";
        SimpleURL url = new SimpleURL(strURL);
        System.out.println(url);
    }
}
