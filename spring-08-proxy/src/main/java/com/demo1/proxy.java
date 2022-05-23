package com.demo1;

public class proxy implements Rent{
    private Host host;

    public proxy() {
    }

    public proxy(Host host) {
        this.host = host;
    }


    public void rent() {
        host.rent();
        seeHouse();
        fare();
        hetong();
    }

    public void seeHouse(){
        System.out.println("kanfang");
    }

    public void fare(){
        System.out.println("shoufei");
    }

    public void hetong(){
        System.out.println("qianhetong");
    }

}
