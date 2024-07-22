/* Question 1 : Print the sum, difference and product of two complex numbers by creating a
class named 'Complex' with separate methods for each operation whose real and imaginary
parts are entered by the user. */

//   real part of a*b is a.real*b.real-a.imaginary*b.imaginary
//   imaginary part of a*b is  a.real*b.imaginary+a.imaginary*b.real

// real part of a+b is a.real+b.real
//   imaginary part of a+b is  a.imaginary+b.imaginary

// real part of a+b is a.real-b.real
//   imaginary part of a+b is a.imaginary-b.imaginary
import java.util.*;

public class sol1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter real part of your first complex num");
        int real = sc.nextInt();
        System.out.println("enter imaginary part of your first complex num");
        int imaginary = sc.nextInt();
        complex num = new complex(real, imaginary);

        System.out.println("enter real second part of your complex num");
        int real2 = sc.nextInt();
        System.out.println("enter imaginary second part of your complex num");
        int imaginary2 = sc.nextInt();
        complex num2 = new complex(real2, imaginary2);

        complex sumcComplex = sum(num, num2);
        complex subtractcComplex = subtract(num, num2);
        complex productcComplex = product(num, num2);

        System.out.println("your first complex num is ");
        printcomplex(num);
        System.out.println("your second complex num is ");
        printcomplex(num2);
        System.out.println("your complex num's sum is ");
        printcomplex(sumcComplex);
        System.out.println("your complex num's subtract is ");
        printcomplex(subtractcComplex);
        System.out.println("your complex num's product is ");
        printcomplex(productcComplex);

    }

    public static complex sum(complex c1, complex c2) {
        return new complex((c1.real + c2.real), (c1.imaginary + c2.imaginary));
    }

    public static complex subtract(complex c1, complex c2) {
        return new complex((c1.real - c2.real), (c1.imaginary - c2.imaginary));
    }

    public static complex product(complex c1, complex c2) {
        return new complex((c1.real * c2.real) - (c1.imaginary * c2.imaginary),
                (c1.real * c2.imaginary) + (c1.imaginary * c2.real));
    }

    public static void printcomplex(complex c) {
        if (c.real == 0 && c.imaginary != 0) {
            System.out.println(c.imaginary + "i");
        } else if (c.real != 0 && c.imaginary == 0) {
            System.out.println(c.real);
        } else if (c.real != 0 && c.imaginary != 0) {
            System.out.println(c.real + "+" + c.imaginary + "i");
        } else {
            System.out.println("0");
        }
    }
}

class complex {
    int real;
    int imaginary;

    complex() {
    }

    complex(int r, int i) {
        this.real = r;
        this.imaginary = i;
    }
}