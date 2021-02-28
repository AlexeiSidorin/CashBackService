package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService ();

    @Test
    public void shouldCashBackLessThenThousand() {
        int actual = service.remain(800);
        int expect = 200;
        assertEquals(actual, expect);
    }

    @Test
    public void shouldCashBackBoundaryMoreThanThousand() {
        int actual = service.remain(1025);
        int expect = 975;
        assertEquals(actual, expect);
    }


    @Test
    public void shouldCashBackEqualBoundary() {
        int actual = service.remain(1000);
        int expect = 0;
        assertEquals(actual, expect);
    }
}
