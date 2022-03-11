package com.functionally.defaulty.map;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yunfeng
 * @date 2022/3/7
 */

public class Map2Sum {
    public static void main(String[] args) {
        List<CostBreakdown> breakdownList = new ArrayList<>();
        breakdownList.add(new CostBreakdown("n1", new BigDecimal("2381.12")));
        breakdownList.add(new CostBreakdown("n2", new BigDecimal("4000.123")));

        BigDecimal reduce = breakdownList.stream().map(CostBreakdown::getCost).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("reduce = " + reduce);
    }
}


@Setter
@Getter
class CostBreakdown {
    /**
     * 费用类型
     */
    private String costType;

    /**
     * 实际费用
     */
    private BigDecimal cost = BigDecimal.ZERO;

    public CostBreakdown(String costType, BigDecimal cost) {
        this.costType = costType;
        this.cost = cost;
    }
}
