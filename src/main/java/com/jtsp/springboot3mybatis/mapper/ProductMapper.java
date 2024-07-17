package com.jtsp.springboot3mybatis.mapper;

import com.jtsp.springboot3mybatis.entity.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductMapper {
    @Select("select * from products LIMIT 10")
    List<Product> findAllProductsWithLimit();

    @Select("select * from products where id=#{id}")
    Product findProductById(Long id);

    @Insert("insert into products(name,quantity) values(#{name}, #{quantity})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    Long insertProduct(Product product);

    @Update("update products set name=#{product.name},quantity=#{product.quantity} where id=#{id}")
    void updateProduct(Product product, Long id);

    @Delete("delete from products where id=#{id}")
    void deleteProduct(Long id);
}
