package com.zx.ms.miaosha.dao;

import com.zx.ms.miaosha.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface GoodsMapper {
    /**
     * 减掉商品库存——悲观锁
     *
     * @return
     */
    @Update("UPDATE `ms`.`seckill_goods` SET `name` = 'iphone X', `count` = #{goods.count}, `sale` = #{goods.sale}, `version` = 0 WHERE `id` = 1 ;")
    //for update
    int updateGoodsCount(@Param("goods") Goods goods);

    /**
     * 减掉商品库存——乐观锁
     *
     * @return
     */
    @Update("UPDATE `ms`.`seckill_goods` SET `name` = 'iphone X', `count` = #{goods.count}, `sale` = #{goods.sale}, `version` = #{goods.version}+1 WHERE `id` = #{goods.id} and version = #{updateVersion};")
    int updateGoodsCountOptimisticLock(@Param("goods") Goods goods, @Param("updateVersion") int version);

    /**
     * 查询商品
     *
     * @return
     */
    @Select("select `id`, `name`, `count`, `sale`, `version` from seckill_goods where id = 1 for update;")
    Goods getGoods();

}
