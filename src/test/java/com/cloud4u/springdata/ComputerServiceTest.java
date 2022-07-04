package com.cloud4u.springdata;

import com.cloud4u.springdata.domain.CPU;
import com.cloud4u.springdata.service.ComputerServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ComputerServiceTest {

    @InjectMocks
    private ComputerServiceImpl computerService;

    @Mock
    private CPU cpu;

    @Test
    public void testCpuInfo() {
        when(cpu.toString()).thenReturn("{I am CPU}");
        String s = computerService.cpuInfo();
        System.out.println(s);
    }
}
