package com.tedu.egmybatis1.mapper;
import com.tedu.egmybatis1.pojo.entitiy.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductMapper {
    @Insert(
            "INSERT INTO product(title,price,stock)"+
                    "VALUE (#{title},#{price},#{stock})"
    )
    int insert(Product product);
    @Delete("DELETE FROM product WHERE id=#{id}")
    int deleteById(Integer id);
    @Update("UPDATE product SET title=#{title},price=#{price},stock=#{stock} "+
    "WHERE id=#{id}")
    int updataById(Product product);
    @Select("SELECT id,title,price,stock "+
    "FROM product "+
    "WHERE id=#{id}")
    Product selectById(Integer id);
    @Select("SELECT id,title,price,stock "+
            "FROM product ")
    List<Product> selectAllById();
}
