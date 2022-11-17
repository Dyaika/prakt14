package com.company;

public class Client {
    public Chair chair;

    void sit(){
        chair.sit();
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
