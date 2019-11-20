package com.el.springboot.design.strategy;

import org.springframework.stereotype.Component;

/**
 * @author roman.zhang
 * @Date: 2019/8/24 16:22
 * @Version:V1.0
 * @Description:ChangeShippingSolver
 */
@Component
public class ChangeShippingSolver extends InspectionSolver {
    @Override
    public void solve(Long orderId, Long userId) {
        System.out.println("订单"+orderId+"开始进行转快递了。。");
    }

    @Override
    public String[] supports() {
        return new String[] {InspectionConstant.INSPECTION_TASK_TYPE_BATCH_CHANGE_SHIPPING};
    }
}
