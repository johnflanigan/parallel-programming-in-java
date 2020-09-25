package com.example;

interface BaseI { void method(); }

class BaseC
{
    public void method()
    {
        System.out.println("Inside BaseC::method");
    }
}

class ImplC extends BaseC implements BaseI
{
    public static void main(String []s)
    {
        try {
            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x + b + d);
        } catch (NumberFormatException e) {
            System.out.println("bad number");
        }CP_CORTEX_API_ETS_SHARED_USER

        /* Here is a comment **** */
        /* This is also a comment /* More comments */ */

    }
}