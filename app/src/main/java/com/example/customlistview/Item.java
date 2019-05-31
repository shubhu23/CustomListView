package com.example.customlistview;

class Item {
    String imageName;
    int imgno;
    public Item(String imageName, int imgno) {
        this.imageName=imageName;
        this.imgno=imgno;
    }
    public String getBookName()
    {
        return imageName;
    }
    public int getBookImage()
    {
        return imgno;
    }
}
