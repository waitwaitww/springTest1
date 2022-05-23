package com.demo1;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        proxy proxy = new proxy(host);
        proxy.rent();
    }
}
