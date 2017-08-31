package com.fisher.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fisher.domain.fisher.Goods;
import com.fisher.service.GoodService;

@Service
@Transactional(rollbackFor = Exception.class)
public class GoodServiceImpl implements GoodService {

    @Override
    public List<Goods> getAllGoods() {
        return null;
    }

    @Override
    public List<Goods> searchGoods(String key) {
        // TODO Auto-generated method stub
        return null;
    }

}
