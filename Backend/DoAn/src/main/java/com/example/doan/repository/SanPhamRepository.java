package com.example.doan.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.doan.entity.SanPham;

public interface SanPhamRepository<P> extends CrudRepository<SanPham, Long> {

}
