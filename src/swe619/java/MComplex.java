package swe619.java;

//final prevents the class from being subclassed
//if a class is marked as final then no class can inherit any feature from the final class
public final class MComplex {
    private final double re;
    private final double im;

    //class now requires static factory
    //shuts off subclassing
    //disallows access from other classes and remains accessible within this class
    //can be used to implement a singleton
    //singleton is a design pattern that allows only one instance of a class to be created
    //to prevent sublcassing (extending).
    // If you make only a private constructor,
    // no class can extend your class, because it
    // can't call the super() constructor.
    private  MComplex (double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static MComplex MComplexFactory(double re, double im){
        return new MComplex(re, im);
    }

    //final methods: cannot be overridden -- cannot modify a final method from a sub class
    //the content of the method cannot be changed by any outsider
    public final double getReal()      {
        return re;
    }

    public final double getImaginary() {
        return im;
    }

    public final MComplex setReal(double re) {
        return new MComplex(re, this.im);
    }

    public final MComplex setImaginary(double im) {
        return new MComplex(this.re, im);
    }

    public final MComplex add(MComplex c) {
        double r = re + c.re;
        double i = im + c.im;
        return new MComplex(r, i);
    }

    public final MComplex subtract (MComplex c) {
        double r = re - c.re;
        double i = im - c.im;
        return new MComplex(r, i);
    }

    public final MComplex multiply (MComplex c) {
        double r = re * c.re - im * c.im;
        double i = re * c.im + im * c.re;
        return new MComplex(r, i);
    }

    public final MComplex divide (MComplex c) {
        double den = c.re * c.re + c.im * c.im;
        double r = (re * c.re - im * c.im) / den;
        double i = (re * c.im + im * c.re) / den;
        return new MComplex(r, i);
    }

    @Override public final boolean equals (Object o) {
        if (o == this)               return true;
        if (!(o instanceof MComplex)) return false;
        MComplex c = (MComplex) o;

        // See Bloch page 43 to find out why to use compare() instead of ==
        return Double.compare(re, c.re) == 0 &&
                Double.compare(im, c.im) == 0;
    }

    @Override public final int hashCode () {
        int result = 17 + hashDouble(re);
        result = 31 * result + hashDouble(im);
        return result;
    }

    private int hashDouble (double val) {
        long longBits = Double.doubleToLongBits(val);
        return (int) (longBits ^ (longBits >>>32));
    }

    @Override public String toString() { return "(" + re + " + " + im + "i)"; }
}