package cn.blooming.design.simpleFactory;

import java.math.BigDecimal;

public class SimpleFactory {

    public static Operation getOperation(String operation){
        Operation operation1 = null;

       switch (operation)
       {
           case "+":
               operation1= new AddOperation();
               break;
           case "-":
               operation1 = new SubtractOperation();
               break;
       }
       return operation1;
    }
}
