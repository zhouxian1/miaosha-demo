package com.zx.ms.miaosha.service.impl;

import com.zx.ms.miaosha.dao.GoodsMapper;
import com.zx.ms.miaosha.entity.Goods;
import com.zx.ms.miaosha.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper userMapper;

    @Override
    public int updateGoodsCount(Goods goods) {
        return userMapper.updateGoodsCount(goods);
    }

    @Override
    public int updateGoodsCountOptimisticLock(Goods goods,int version) {
        return userMapper.updateGoodsCountOptimisticLock(goods,version);
    }

    @Override
    public Goods getGoods() {
        return userMapper.getGoods();
    }

}
