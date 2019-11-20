package com.el.springboot.design.strategy;

/**
 * @author roman.zhang
 * @Date: 2019/8/24 13:13
 * @Version:V1.0
 * @Description:InspectionSolver
 */
public abstract class InspectionSolver {
    private  String abc = "abc";
    public abstract void solve(Long userId,Long orederId);
    public abstract String[] supports();
}
