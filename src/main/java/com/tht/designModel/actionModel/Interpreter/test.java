package com.tht.designModel.actionModel.Interpreter;

/**
 * Created by thrall on 2018/11/30.
 */
public class test {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Context context = new Context( "10");
        new MinusExpression().interpret(context);
        new PlusExpression().interpret(context);
        new MinusExpression().interpret(context);
        new PlusExpression().interpret(context);
        System.out.println( context.getOut());
    }
}
