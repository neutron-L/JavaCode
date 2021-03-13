package com.company;

public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }


    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}

/*
* public class PrintBanner extends Print {
*   private Banner banner;
*   public PrintBanner(String string) {
*     this.banner = new Banner(string);
* }
*  public void printWeak() {
*    banner.showWithParen();
* }
*  public void printStrong() {
*    banner.showWithStrong();
* }
* }
*  */
