package com.company;

public class customer {
    String name;
    String barcode;
    String prefer;
    int purchase;
    int cp;

    public customer ( String name, String bc, String pf){
        this.name = name;
        this.barcode = bc;
        this.prefer = pf;
        this.purchase = 0;
        this.cp = 0;
    }
    public void buy (){
        this.purchase++;
        if (this.purchase == 3){
            this.cp ++;
            this.purchase = 0;
        }
    }
    public void spBuy(int x){
        for(int i = 3; i > 0; i--){
            buy();
        }
    }
    public void usingCP(){
        if(this.cp <= 0){
            System.out.println("not available");
        }
        else{
            cp--;
            System.out.println("success!");
        }
    }

}
