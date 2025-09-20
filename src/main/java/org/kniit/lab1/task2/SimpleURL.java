package org.kniit.lab1.task2;

public class SimpleURL {
    
    private String protocol = "";
    private String adress = "";
    private String domainZone = "";
    private String siteName = "";
    private String webPageName = "";
    private String webPageExtention = "";

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setAdress(String adress) {
        this.adress = adress;
        /*String[] adressVec = adress.split(".");

        for (String elem : adressVec) {
            System.out.println(elem); 
        }

        this.domainZone = adressVec[1];
        this.siteName = adressVec[0]; */
    }

    public void setDomainZone(String domainZone){
        this.domainZone = domainZone;
    }

    public void setSiteName(String siteName){
        this.siteName = siteName;
    }

    public void setWebPageName(String webPageName){
        this.webPageName = webPageName;
    } 

    public void setWebPageExtention(String webPageExtention){
        this.webPageExtention = webPageExtention;
    } 

    public String getProtocol(String protocol) {
        return this.protocol;
    }

    public String getAdress(String adress) {
        return this.adress;
    }

    public String getDomainZone(String domainZone){
        return this.domainZone;
    }

    public String getSiteName(String siteName){
        return this.siteName;
    }

    public String getWebPageName(String webPageName){
        return this.webPageName;
    } 

    public String getWebPageExtention(String webPageExtention){
        return this.webPageExtention;
    } 

    public String toString(){
        return this.protocol + "://" + this.adress + "/" + this.webPageName;
    }

}
