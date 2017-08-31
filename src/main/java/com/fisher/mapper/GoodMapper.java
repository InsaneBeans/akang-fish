package com.fisher.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fisher.domain.fisher.Goods;

@Mapper
public interface GoodMapper {
    
    List<Goods> getAllGoods();
    
    List<Goods> searchGoods(@Param("keyword") String keyword);
    
    Integer getAllGoodsCount();
}
