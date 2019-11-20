package com.el.springboot.design.strategy;

import org.springframework.stereotype.Component;

/**
 * @author roman.zhang
 * @Date: 2019/8/24 16:23
 * @Version:V1.0
 * @Description:ReplaceOrderGoodsSolver
 */
@Component
public class ReplaceOrderGoodsSolver extends InspectionSolver {
    @Override
    public void solve(Long orderId, Long userId) {
        System.out.println("订单"+orderId+"开始进行替换商品了");
    }

    @Override
    public String[] supports() {
        return new String[]{InspectionConstant.INSPECTION_TASK_TYPE_BATCH_REPLACE_ORDER_GOODS};
    }
}
