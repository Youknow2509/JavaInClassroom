package week4.complexNumbers.number;

public class ComplexNumber {
    // Attributes
    private double real;
    private double imaginary;
    // Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber() {
        this.real = 1;
        this.imaginary = -1;
    }
    // Getters and Setters
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return "ComplexNumber: " +
                 real +
                " + i*(" + imaginary +
                ')';
    }
    // Methods add, subtract, multiply, divide, abs, conjugate
    public ComplexNumber add(ComplexNumber c){
        return new ComplexNumber(this.real + c.real, this.imaginary + c.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber c){
        return new ComplexNumber(this.real - c.real, this.imaginary - c.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber c){
        return new ComplexNumber(this.real * c.real - this.imaginary * c.imaginary,
                this.real * c.imaginary + this.imaginary * c.real);
    }

    public ComplexNumber divide(ComplexNumber c){
        double denominator = c.real * c.real + c.imaginary * c.imaginary;
        return new ComplexNumber((this.real * c.real + this.imaginary * c.imaginary) / denominator,
                (this.imaginary * c.real - this.real * c.imaginary) / denominator);
    }
    public ComplexNumber divide(double n) {
        if (n != 0) {
            return new ComplexNumber(
                    real/n, imaginary/n
            );
        }
        return new ComplexNumber(0, 0);
    }
    public double abs(){
        return Math.sqrt(this.real * this.real + this.imaginary * this.imaginary);
    }

    public ComplexNumber conjugate(){
        return new ComplexNumber(this.real, -this.imaginary);
    }

}
