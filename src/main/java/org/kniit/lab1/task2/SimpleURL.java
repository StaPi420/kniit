package org.kniit.lab1.task2;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;


public class SimpleURL {
    
    private String protocol;
    private String adress;
    private String domainZone;
    private String siteName;
    private String pathToPage;
    private String webPageName;
    private String webPageExtention;
    private Map<String, String> paramsMap = new HashMap<>();


    // Конструктор

    public SimpleURL(String url){
        int protocolIndex = url.indexOf("://");
        this.setProtocol(url.substring(0, protocolIndex));

        url = url.substring(protocolIndex + 3);
        int adressEndIndex = url.indexOf("/");
        this.setAdress(url.substring(0, adressEndIndex));

        int paramIndex = url.indexOf("?");
        int pageNameIndex = url.lastIndexOf("/");
        if (paramIndex != -1){
            this.setWebPageName(url.substring(pageNameIndex + 1, paramIndex));

            this.setParams(url.substring(paramIndex + 1));

        }
        else {
            this.setWebPageName(url.substring(pageNameIndex + 1));
        }
        this.setPathToPage(url.substring(adressEndIndex + 1, pageNameIndex));
    }

    // Сеттеры

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setAdress(String adress) {
        this.adress = adress;
        String[] adressAr = adress.split("\\.");

        /*for (String elem : adressAr) {
            System.out.println(elem); 
        }*/

        this.domainZone = adressAr[1];
        this.siteName = adressAr[0]; 
    }

    public void setDomainZone(String domainZone){
        this.domainZone = domainZone;
    }

    public void setSiteName(String siteName){
        this.siteName = siteName;
    }

    public void setWebPageName(String webPageName){
        this.webPageName = webPageName;
        String[] webPageAr = webPageName.split("\\.");
        this.setWebPageExtention((webPageAr.length == 2 ? webPageAr[1] : ""));
    } 

    public void setWebPageExtention(String webPageExtention){
        this.webPageExtention = webPageExtention;
    } 

    public void setPathToPage(String pathToPage){
        this.pathToPage = pathToPage;
    }

    public void setParams(String params){
        if (params.length() > 0)
            for (String param: params.split("&")){
                String[] paramAr = param.split("=");
                this.paramsMap.put(paramAr[0], paramAr[1]);
            }
    }

    // Геттеры

    public String getProtocol() {
        return this.protocol;
    }

    public String getAdress() {
        return this.adress;
    }

    public String getDomainZone(){
        return this.domainZone;
    }

    public String getSiteName(){
        return this.siteName;
    }

    public String getWebPageName(){
        return this.webPageName;
    } 

    public String getWebPageExtention(){
        return this.webPageExtention;
    } 

    public String getPathToPage(){
        return this.pathToPage;
    }

    public String getParams(){
        List<String> params = new ArrayList<>();
        for (Map.Entry<String, String> entry: this.paramsMap.entrySet()){
            params.add(entry.getKey() + "=" + entry.getValue());
        }
        return String.join("&", params);
    }

    // Перегрузка метода toString

    public String toString(){
        String url = this.getProtocol() + "://" + this.getAdress();
        String pathToPage = this.getPathToPage();
        if (pathToPage.length() > 0){
            url += "/" + pathToPage;
        }
        url += "/" + this.getWebPageName();
        String params = this.getParams();
        if (params.length() > 0){
            url += "?" + params;
        }
        return url;
    }

}
