package com.prototype;

public class UnderLinePen implements Product, Cloneable {

    private char decordChar;

    public UnderLinePen(char decordChar) {
        this.decordChar = decordChar;
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
        System.out.println("\" " + s + " \"");
        for (int i = 0; i < s.getBytes().length; i++) {
            System.out.print(decordChar);
        }
        System.out.println();
    }
}
