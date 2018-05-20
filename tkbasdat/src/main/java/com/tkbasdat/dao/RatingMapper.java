package com.tkbasdat.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import com.tkbasdat.model.RatingModel;

@Mapper
public interface RatingMapper {
	@Select("select * from rating where ip_address = #{ip}")
    RatingModel selectRatingByIP(@Param("ip") String ip);
	
	@Insert("insert into rating (url_berita,ip_address,nilai) values (#{url_berita},#{ip_address},#{nilai})")
	void addRating(RatingModel rating);
}
