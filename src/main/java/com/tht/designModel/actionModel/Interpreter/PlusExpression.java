package com.tht.designModel.actionModel.Interpreter;

/**
 * Created by thrall on 2018/11/30.
 */
public class PlusExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        String in = context.getIn() ;
        int v = Integer.parseInt( in ) ;
        context.setOut( ++v ) ;
    }
}
