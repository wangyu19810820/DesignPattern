package com.prototype;

public class MessageBox implements Product, Cloneable {

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    public Product cloneCreate() {
        Product p = null;
        try {
            p = (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public void use(String s) {
        int len = s.getBytes().length;
        for (int i = 0; i < len + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < len + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }
}
