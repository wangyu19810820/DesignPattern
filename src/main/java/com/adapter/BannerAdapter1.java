package com.adapter;

public class BannerAdapter1 extends Banner implements IPrint {

    public BannerAdapter1() {
        super();
    }

    @Override
    public void printTitle() {
        super.printBannerTitle();
    }

    @Override
    public void printContent() {
        super.printBannerContent();
    }
}
