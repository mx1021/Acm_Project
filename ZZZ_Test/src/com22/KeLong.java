package com22;

public class KeLong implements Cloneable
{
    String name;
    String[] girls;

    public KeLong(String a, String[] b) {
        this.setName(a);
        this.setGirls(b);
    }

    @Override
    protected KeLong clone() throws CloneNotSupportedException {
        KeLong obj = null;
        obj = (KeLong) super.clone();
        obj.girls = girls;//深度克隆,注释掉就是浅克隆
        return obj;
    }

    public String[] getGirls() {
        return girls;
    }

    public void setGirls(String[] girls) {
        this.girls = girls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
