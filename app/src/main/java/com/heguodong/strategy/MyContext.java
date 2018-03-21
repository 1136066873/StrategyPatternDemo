package com.heguodong.strategy;

/**
 * Created by 何国栋 on 2018/3/21.
 */

public class MyContext  {

    private IStrategy strategy;

    public MyContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(IStrategy strategy){
        this.strategy = strategy ;
    }

    public void operate(){
        this.strategy.operate();
    }
}
