package com.yjl.javase.comparable;

import java.util.Objects;

/**
 * @author ll3306
 * @Description
 * @create 2022-01-15
 */
public class Goods implements Comparable<Goods>{
    private String goodName;
    private Integer count;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Goods)) return false;
        Goods goods = (Goods) o;
        return Objects.equals(goodName, goods.goodName) &&
                Objects.equals(count, goods.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodName, count);
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodName='" + goodName + '\'' +
                ", count=" + count +
                '}';
    }

    public Goods() {
    }

    public Goods(String goodName, Integer count) {
        this.goodName = goodName;
        this.count = count;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public int compareTo(Goods o) {
        if(this.count>o.count){
            return 1;
        }else if(this.count<o.count){
            return -1;
        }else {
            return 0;
        }
    }
}
