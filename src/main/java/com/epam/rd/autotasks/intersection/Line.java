package com.epam.rd.autotasks.intersection;

public class Line {

    public final double k, b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        double x = (other.b - this.b) / (this.k - other.k);
        double y = this.k * x + this.b;
        if ((this.k == other.k && this.b != other.b) || (this.k == other.k && this.b == other.b)) {
            return null;
        } else {
            return new Point((int) x, (int) y);
        }
    }
}
