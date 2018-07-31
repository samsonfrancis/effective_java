package com.sam.effective_java.overriding_objects_equals_method;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Point)){
            return false;
        }
        Point p = (Point) o;
        return p.x == x && p.y == y;
    }
}
