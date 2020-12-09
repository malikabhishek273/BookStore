package com.bookstore.Book_Store;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookStoreRepo extends JpaRepository<Book, Integer>{
	List<Book> findByissueUserId(int userId);
}
