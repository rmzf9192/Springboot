package com.el.springboot.design.strategy;

import org.springframework.stereotype.Component;

/**
 * @author roman.zhang
 * @Date: 2019/8/24 16:19
 * @Version:V1.0
 * @Description:ChangeWarehouseSolver
 */
@Component
public class ChangeWarehouseSolver extends InspectionSolver {
    @Override
    public void solve(Long orderId, Long userId) {
        System.out.println("订单"+orderId+"开始进行批量转仓了。。");
    }

    @Override
    public String[] supports() {
        return new String[] {InspectionConstant.INSPECTION_TASK_TYPE_BATCH_CHANGE_WAREHOUSE};
    }
}
