package com.tkbasdat.service;

import java.util.List;

import com.tkbasdat.model.BeritaModel;

public interface BeritaService {

	List<BeritaModel> selectAllBerita();
	BeritaModel selectBerita(String judul);
	
}
