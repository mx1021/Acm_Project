package com11;

public class People
{
    public String age;
    public String name;

    public People(String name, String age) {
        // TODO Auto-generated constructor stub
        this.name = name;
        this.age = age;
    }

    protected void bbb() {
        System.out.println("people");
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof People) {
            return ((People) obj).name.equals(this.name);
        }
        return false;
    }
}
