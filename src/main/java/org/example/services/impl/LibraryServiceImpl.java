package org.example.services.impl;

import org.example.entity.Borrower;
import org.example.repository.BorrowerRepository;
import org.example.services.LibraryServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryServiceImpl implements LibraryServices {

    public static final Logger LOGGER = LoggerFactory.getLogger(LibraryServiceImpl.class);

    @Autowired
    BorrowerRepository borrowerRepository;

    @Override
    public Borrower createBorrower(Borrower borrower) {
        Borrower borrowerResp = borrowerRepository.save(borrower);
        return null;
    }
}
