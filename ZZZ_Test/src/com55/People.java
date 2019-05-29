package com55;

public class People implements Comparable<People>
{

    public String name;
    public int age;

    People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override //treeset只需要重写 这个方法即可
    public int compareTo(People o) {

        return 0;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return 10086;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof People)) {
            return false;
        }
        People tmp = (People) obj;
        return ((age == tmp.age) && (name.equals(tmp.name)));
    }

    class man
    {
        
    }
}
