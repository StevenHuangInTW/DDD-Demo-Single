package com.ddd.demo.promotion.domain.promotion.action;

import com.ddd.demo.promotion.domain.promotion.Promotion;

public class CancelPromotionActionCommand implements ActionCommand {
    @Override
    public void execute(Promotion promotion) {
        //do cancel promotion business logic
    }
}
