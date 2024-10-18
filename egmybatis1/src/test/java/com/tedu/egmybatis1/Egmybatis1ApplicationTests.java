package com.tedu.egmybatis1;

import com.tedu.egmybatis1.mapper.ProductMapper;
import com.tedu.egmybatis1.pojo.entitiy.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class Egmybatis1ApplicationTests {
    @Autowired
    private ProductMapper productMapper;

    @Test
    void testProductMapperInsert() {
        System.out.println(productMapper);
        Product product=new Product();
        product.setTitle("iphonex");
        product.setPrice(9999);
        product.setStock(100);
        int num=productMapper.insert(product);
        if (num>0){
            System.out.println("插入成功");
        }else{
            System.out.println("插入失败");
        }
    }
    @Test
    void testdeletebyid(){
        int num=productMapper.deleteById(1);
        System.out.println(num>0?"删除成功":"删除失败");
    }
    @Test
    void testUpdataById(){
        Product p=new Product();
        p.setStock(500);
        p.setPrice(19999);
        p.setTitle("huawei");
        p.setId(2);
        int num=productMapper.updataById(p);
        System.out.println(num>0?"更新成功":"更新失败");
    }
    @Test
    void testSelectById(){
        Product p=productMapper.selectById(2);
        System.out.println(p);
    }
    @Test
    void testSelectAll(){
        List<Product>p=productMapper.selectAllById();
        for (Product p1:p){
            System.out.println(p1);
        }
    }
    }

