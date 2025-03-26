package com.Bank;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.Bank.Dao.BankDao;
import com.Bank.Entity.Bank;
import com.Bank.Service.BankService;

@ExtendWith(MockitoExtension.class)
public class BankServiceTest {

    @Mock
    private BankDao bankDao; 

    @InjectMocks
    private BankService bankService; 

    @Test
    public void testPostAll() {
        List<Bank> banks = Arrays.asList(new Bank(1, "SBI", "SBIN00123", "Mumbai"),
                                         new Bank(2, "HDFC", "HDFC00234", "Delhi"));

        when(bankDao.postAll(banks)).thenReturn("Saved Successfully");

        String response = bankService.postAll(banks);

        assertEquals("Saved Successfully", response);
        verify(bankDao, times(1)).postAll(banks);
    }

    @Test
    public void testGetIFSC() {
        when(bankDao.getIFSC("SBIN00123")).thenReturn("Mumbai");

        String branch = bankService.getIFSC("SBIN00123");

        assertEquals("Mumbai", branch);
        verify(bankDao, times(1)).getIFSC("SBIN00123");
    }
}

