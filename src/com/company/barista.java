package com.company;


import java.util.HashMap;

import java.util.Map;

public class barista {

    Map<String, customer> ct;
    private String name;
    int x;
    private int count;

    public barista(String name){
        ct = new HashMap<String, customer>();
        this.name = name;
        this.count = 0;
    }
    public void add(customer client){
        ct.put(client.barcode, client);
    }
    public void getInfo(String cd) {
        if (ct.containsKey(cd)) {
            System.out.println("id: " + ct.get(cd).barcode + "\n" + "name: "+ ct.get(cd).name + "\n" + "prefer : " + ct.get(cd).prefer + "\n" + "purchase : " + ct.get(cd).purchase + "\n" + "coupon : " + ct.get(cd).cp );
        }
         else {
            System.out.println("no info");
        }
        System.out.println("______________________");
    }

}
