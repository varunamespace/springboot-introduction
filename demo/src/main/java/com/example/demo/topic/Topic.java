package com.example.demo.topic;

public class Topic {
    private String id;
    private String name;

    public Topic(){}
    public Topic(String id, String name){
        this.id =id;
        this.name =name;
    }
    public String getId(){
        return id;
    }
    public void setName(String fname){
        this.name = fname;
    }
    public String getName(){
        return name;
    }
    public void setId(String id){
        this.id = id;
    }
}
