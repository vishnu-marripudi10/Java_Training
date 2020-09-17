// 5. Output
package oops;

public class OOPS {
    public static void main(String[] args) {
        FirstClass objA = new FirstClass();
        SecondClass objB = new SecondClass();
        System.out.println("in main(): ");
        System.out.println("objA.a = "+objA.getFirstClass());
        System.out.println("objB.b = "+objB.getSecondClass());
        objA.setFirstClass (222);
        objB.setSecondClass (333.33);
        System.out.println("objA.a = "+objA.getFirstClass());
        System.out.println("objB.b = "+objB.getSecondClass());
    }


}
