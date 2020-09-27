package com.zx.ms.miaosha.service;

import com.zx.ms.miaosha.entity.Goods;

public interface GoodsService {
    /**
     * 减掉商品库存——悲观锁
     * @return
     */
    int updateGoodsCount(Goods goods);

    /**
     * 减掉商品库存——乐观锁
     * @return
     */
    int updateGoodsCountOptimisticLock(Goods goods, int version);

    /**
     * 查询商品
     * @return
     */
    Goods getGoods();
}
