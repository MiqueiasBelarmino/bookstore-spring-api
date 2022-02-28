package com.miqueias.bookstore.repository;

import com.miqueias.bookstore.model.PurchaseHistory;
import com.miqueias.bookstore.repository.projection.IPurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPurchaseHistoryRepository extends JpaRepository<PurchaseHistory, Long> {

    @Query("SELECT b.title, ph.price, ph.createdAt as purchaseDate FROM PurchaseHistory ph LEFT JOIN Book b ON ph.bookId = b.id WHERE ph.userId = :userId")
    List<IPurchaseItem> findAllPurchasesOfUser(@Param("userId")Long userId);

}
