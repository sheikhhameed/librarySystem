package org.example.repository;

import org.example.entity.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface BorrowerRepository extends JpaRepository<Borrower, Integer> {


}
