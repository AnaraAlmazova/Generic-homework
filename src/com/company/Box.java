package com.company;

public class Box<T,S> {
    T weight;
    S color;

    public Box(T weight, S color) {
        this.weight = weight;
        this.color = color;
    }
    public static <L> void met(L maani){
        System.out.println(maani);
    }

    public T getWeight() {
        return weight;
    }

    public void setWeight(T weight) {
        this.weight = weight;
    }

    public S getColor() {
        return color;
    }

    public void setColor(S color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Box  " +
                "weight=" + weight +
                ", color=" + color ;

    }
}
