package com.tkbasdat.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.tkbasdat.model.PollingModel;

@Mapper
public interface PollingMapper {
	
	@Select("select * from polling p join polling_berita b on p.id = b.id_polling join berita r on b.url_berita = r.url")
	        List<PollingModel> selectAllPolling();

}
