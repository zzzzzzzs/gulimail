package com.atguigu.gulimail.product;

import com.atguigu.gulimail.product.entity.BrandEntity;
import com.atguigu.gulimail.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.ScopedMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


// 做单元测试的时候要指定自己的类

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GulimallProductApplication.class)
class GulimailProductApplicationTests {

    @Autowired
    BrandService brandService;

    // 做一下单元测试
    @Test
    void contextLoads() {
//        BrandEntity  brandEntity = new BrandEntity();
//
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("华为");
//        brandService.updateById(brandEntity);


//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");


        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println(item);
        });



    }

}
