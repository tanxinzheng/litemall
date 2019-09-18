package org.linlinjava.litemall.db.service;

import org.linlinjava.litemall.db.dao.LitemallActiveMapper;
import org.linlinjava.litemall.db.domain.LitemallActive;
import org.linlinjava.litemall.db.domain.LitemallActiveExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class LitemallActiveService {

    @Autowired
    LitemallActiveMapper litemallActiveMapper;

    public int insertBatch(List<LitemallActive> litemallActiveList) {
        if(CollectionUtils.isEmpty(litemallActiveList)){
            return 0;
        }
        AtomicInteger i = new AtomicInteger();
        litemallActiveList.stream().forEach(litemallActive -> {
            litemallActiveMapper.insert(litemallActive);
            i.getAndIncrement();
        });
        return i.get();
    }

    public List<LitemallActive> getActiveByOrderId(Integer orderId) {
        LitemallActiveExample litemallActiveExample = new LitemallActiveExample();
        litemallActiveExample.createCriteria().andOrderIdEqualTo(orderId);
        return litemallActiveMapper.selectByExample(litemallActiveExample);
    }
}
