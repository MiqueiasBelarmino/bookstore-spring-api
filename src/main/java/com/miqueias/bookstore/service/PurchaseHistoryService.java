package com.miqueias.bookstore.service;

import com.miqueias.bookstore.model.PurchaseHistory;
import com.miqueias.bookstore.repository.IPurchaseHistoryRepository;
import com.miqueias.bookstore.repository.projection.IPurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHistoryService implements IPurchaseHistoryService{

    private final IPurchaseHistoryRepository purchaseHistoryRepository;

    public PurchaseHistoryService(IPurchaseHistoryRepository purchaseHistoryRepository) {
        this.purchaseHistoryRepository = purchaseHistoryRepository;
    }

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory){
        purchaseHistory.setCreatedAt(LocalDateTime.now());
        return purchaseHistoryRepository.save(purchaseHistory);
    }

    @Override
    public List<IPurchaseItem> findPurchaseItemsOfUser(Long userId){
        return  purchaseHistoryRepository.findAllPurchasesOfUser(userId);
    }
}
