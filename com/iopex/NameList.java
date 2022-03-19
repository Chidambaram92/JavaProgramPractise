package com.iopex;

public class NameList 
{
	private String name;
    
    public NameList(String n){
        this.name = n;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "Name: "+this.name;
    }
}
