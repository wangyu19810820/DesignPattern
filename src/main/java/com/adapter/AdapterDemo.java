package com.adapter;

public class AdapterDemo {

    public static void main(String[] args) {
        BannerAdapter1 adapter1 = new BannerAdapter1();
        adapter1.printTitle();
        adapter1.printContent();

        BannerAdapter2 adapter2 = new BannerAdapter2(new Banner());
        adapter2.printTitle();
        adapter2.printContent();
    }
}
