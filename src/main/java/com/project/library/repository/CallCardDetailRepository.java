package com.project.library.repository;

import com.project.library.model.Book;
import com.project.library.model.CallCardDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CallCardDetailRepository extends JpaRepository<CallCardDetail, Long> {
    public Long countByBookAndReturned(Book book, Integer returned);

    @Query("select c.book, (count(c.book) * c.book.borrowPrice) from CallCardDetail as c  group by c.book")
    public List<Object[]> totalBookPrice();
}
