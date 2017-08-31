package com.fisher.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fisher.domain.fisher.Goods;

@Service
public interface GoodService {
    
    List<Goods> getAllGoods();
    
    List<Goods> searchGoods(String key);
    
}
