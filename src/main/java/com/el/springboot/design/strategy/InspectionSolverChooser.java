package com.el.springboot.design.strategy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author roman.zhang
 * @Date: 2019/8/24 16:11
 * @Version:V1.0
 * @Description:InspectionSolverChooser
 */
@Component
public class InspectionSolverChooser implements ApplicationContextAware {
    private ApplicationContext context;

    private Map<String,InspectionSolver> chooseMap = new HashMap<>();

    public InspectionSolver choose(String type){
        return chooseMap.get(type);
    }

    @PostConstruct
    public void register(){
        Map<String, InspectionSolver> beansOfType = context.getBeansOfType(InspectionSolver.class);
        for(InspectionSolver solver:beansOfType.values()){
            for(String str:solver.supports()){
                chooseMap.put(str,solver);
            }
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }


}
