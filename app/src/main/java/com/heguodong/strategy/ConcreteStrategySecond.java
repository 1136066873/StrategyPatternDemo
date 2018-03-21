package com.heguodong.strategy;

import android.util.Log;

/**
 * Created by 何国栋 on 2018/3/21.
 */

public class ConcreteStrategySecond implements IStrategy {

    @Override
    public void operate() {
        Log.e("heguodong"," 现在在执行 ConcreteStrategySecond 的 operate() 啦~");
    }
}
