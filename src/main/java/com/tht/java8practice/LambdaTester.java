package com.tht.java8practice;

/**
 * Created by thrall on 2018/11/26.
 * 1.Lambda 表达式主要用来定义行内执行的方法类型接口，例如，一个简单方法接口。在上面例子中，我们使用各种类型的Lambda表达式来定义MathOperation接口的方法。然后我们定义了sayMessage的执行。
 *2.Lambda 表达式免去了使用匿名方法的麻烦，并且给予Java简单但是强大的函数化的编程能力。
 *3.lambda 表达式的局部变量可以不用声明为 final，但是必须不可被后面的代码修改（即隐性的具有 final 的语义）
 */
public class LambdaTester {
    public static void main(String[] args) {
        LambdaTester tester=new LambdaTester();

        //类型声明
        MathOperation addition = (int a, int b) -> a + b;

        //不声明类型
        MathOperation substruct=(a,b)->a-b;

        //大括号中返回
        MathOperation multiply=(int a,int b)->{return a*b;};

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        //另外一种写法
        System.out.println("10 + 5 = " + addition.operation(10,5));

        System.out.println("10 - 5 = " + tester.operate(10, 5, substruct));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiply));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.say("Runoob");
        greetService2.say("Google");


        // 1.1使用匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        }).start();

        //1.2使用 lambdas 来实现 Runnable 接口的示例:
        new Thread(() -> System.out.println("Hello world !")).start();

        // 2.1使用匿名内部类
        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        };
        // 2.2使用 lambda expression
        Runnable race2 = () -> System.out.println("Hello world !");
        // 直接调用 run 方法(没开新线程哦!)
        race1.run();
        race2.run();
    }

    interface MathOperation{
        int operation(int a,int b);
    }

    interface GreetingService{
        void say(String message);
    }

    private int operate(int a ,int b,MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
