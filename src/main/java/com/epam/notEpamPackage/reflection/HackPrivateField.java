package com.epam.notEpamPackage.reflection;

import java.lang.reflect.Field;

public class HackPrivateField {
    public static void main(String[] args) {
        HackPrivateField hackPrivateField = new HackPrivateField();
        hackPrivateField.hackWithReflection();
    }

    public void hackWithReflection(){
        final Class<?> privCls = PrivateField.class;

        try{
            PrivateField privateField = new PrivateField();
            //get private field
            Field fieldA = privCls.getDeclaredField("a");
            fieldA.setAccessible(true);
            System.out.println("Field a1 = "+fieldA.getInt(privateField));
            //get final private
            Field fieldB = privCls.getDeclaredField("B");
            fieldB.setAccessible(true);
            System.out.println("Field b1 = "+fieldB.getInt(privateField));
            //get static private
            Field fieldC = privCls.getDeclaredField("c");
            fieldC.setAccessible(true);
            System.out.println("Field c1 = "+fieldC.getInt(privateField));
            //get final private static
            Field fieldD = privCls.getDeclaredField("D");
            fieldD.setAccessible(true);
            System.out.println("Field c1 = "+fieldD.getInt(privateField)+"\n");

            fieldA.setInt(privateField,11);
            System.out.println("Field a2 = "+ fieldA.getInt(privateField));
            fieldB.setInt(privateField,12);
            System.out.println("Field b1 = "+fieldB.getInt(privateField));
            fieldC.setInt(privateField,13);
            System.out.println("Field c1 = "+fieldC.getInt(privateField));
//            IllegalAccessException: Can not set static final int field
//            com.epam.notEpamPackage.reflection.PrivateField.D to (int)14
            fieldD.setInt(privateField,14);
            System.out.println("Field c1 = "+fieldD.getInt(privateField)+"\n");
        } catch (NoSuchFieldException e) {
            System.err.println("Wrong field name!");
        } catch (IllegalAccessException e) {
            System.err.println("You can`t to change a final static fields!");

        }
    }
}
