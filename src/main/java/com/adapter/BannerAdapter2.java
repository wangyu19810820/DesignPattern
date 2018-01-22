package com.adapter;

public class BannerAdapter2 extends AbstractPrint {

    private Banner banner;

    public BannerAdapter2(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void printTitle() {
        banner.printBannerTitle();
    }

    @Override
    public void printContent() {
        banner.printBannerContent();
    }
}
