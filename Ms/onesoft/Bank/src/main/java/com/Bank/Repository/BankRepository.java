package com.Bank.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bank.Entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer>{

}
