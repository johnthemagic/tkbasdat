package com.tkbasdat.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.tkbasdat.model.BeritaModel;

@Mapper
public interface BeritaMapper {

	@Select("select * from berita b join narasumber_berita s on b.url = s.url_berita join narasumber n on n.id = s.id_narasumber")
    List<BeritaModel> selectAllBerita();
	
	@Select("select * from berita b join narasumber_berita s on b.url = s.url_berita join narasumber n on n.id = s.id_narasumber join universitas u on u.id = n.id_universitas where b.judul= #{judul}")
    BeritaModel selectBerita(@Param("judul") String judul);
}
