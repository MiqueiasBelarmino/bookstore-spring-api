package com.miqueias.bookstore.service;

import com.miqueias.bookstore.model.PurchaseHistory;
import com.miqueias.bookstore.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchaseItemsOfUser(Long userId);
}
