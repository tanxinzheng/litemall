package org.linlinjava.litemall.db.service;

import org.linlinjava.litemall.db.domain.LitemallActive;

import java.util.List;

public interface LitemallActiveService {

    int insertBatch(List<LitemallActive> litemallActiveList);

    List<LitemallActive> getActiveByOrderId(Integer orderId);
}
