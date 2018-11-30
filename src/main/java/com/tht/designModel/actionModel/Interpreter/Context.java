package com.tht.designModel.actionModel.Interpreter;

/**
 * Created by thrall on 2018/11/30.
 */
public class Context {
    private String in ;

    private int out ;

    public Context(String in) {
        this.in = in ;
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.in = String.valueOf( out ) ;
        this.out = out;
    }

    public String getIn() {
        return in;
    }

}
