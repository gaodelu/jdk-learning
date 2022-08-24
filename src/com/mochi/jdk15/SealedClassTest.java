package com.mochi.jdk15;

public class SealedClassTest {


    //密封类，必须被继承。 没继承会编译错误
    sealed class A {
    }

    // 密封类的子类可以是final，sealed或non-sealed
    final class A_1 extends A {
        
    }

    non-sealed class A_2 extends A {

    }

    // 密封类可以指定只能哪些子类可以继承它
    sealed class A_3 extends A permits A_3_1 {

    }

    non-sealed class A_3_1 extends A_3 {

    }

    //compile error
    /*non-sealed class A_3_2 extends A_3 {

    }*/
}
