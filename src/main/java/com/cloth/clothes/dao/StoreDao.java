package com.cloth.clothes.dao;

import com.cloth.clothes.bean.Clothes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StoreDao {

    @Select("INSTER INTO clothes values(#name#,#feature#,#brand#,#type#,#size#," +
            "#texture#,#couar#,#sleeve#,#batch#,#cost#,#number#,#profit#)")
    boolean inStore(Clothes clothes);

    @Select("UPDATE INFO clothes SET number = #{number} WHERE id = #{id}")
    boolean outStore(@Param("id") String id, @Param("number") long number);

    @Select("select * from clothes LIMIT #{start} , #{end}")
    List<Clothes> getClothes(@Param("start") long start, @Param("end") long number);
}
