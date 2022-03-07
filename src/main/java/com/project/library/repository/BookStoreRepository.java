package com.project.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.library.model.BookStore;


@Repository
public interface BookStoreRepository extends JpaRepository<BookStore, Long>{

}
