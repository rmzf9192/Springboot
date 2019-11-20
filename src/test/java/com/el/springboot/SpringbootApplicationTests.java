package com.el.springboot;

import com.el.springboot.design.strategy.InspectionConstant;
import com.el.springboot.design.strategy.InspectionSolver;
import com.el.springboot.design.strategy.InspectionSolverChooser;
import com.el.springboot.util.JedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
public class SpringbootApplicationTests {
    @Autowired
    private InspectionSolverChooser solverChooser;

    @Autowired
    private JedisUtil jedisUtil;


    @Test
    public void testStrategy(){
        //do data,start test
        String s = InspectionConstant.INSPECTION_TASK_TYPE_BATCH_CHANGE_SHIPPING;
        Long orderId = 12345L;
        Long userId = 123L;
        //get task type solver;
        InspectionSolver choose = solverChooser.choose(s);
        if (choose == null) {
            throw new RuntimeException("任务类型暂时无法处理");
        }
        //使用不同的类型调用处理
        choose.solve(userId,orderId);

    }


    @Test
    public void contextLoads() {
        System.out.println("hello world");
        String token = jedisUtil.get("token");
        System.out.println(token);
        Long token1 = jedisUtil.del("token");
        System.out.println(token1);
    }

}
