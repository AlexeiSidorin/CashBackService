package ru.netology.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTestOnJUnit5 {

    CashbackHackService service = new CashbackHackService ();

    @Test
    public void shouldCashBackLessThenThousand() {
        int actual = service.remain(800);
        int expect = 200;
        assertEquals(expect, actual);
    }

    @Test
    public void shouldCashBackBoundaryMoreThanThousand() {
        int actual = service.remain(1025);
        int expect = 975;
        assertEquals(expect, actual);
    }


    @Test
    public void shouldCashBackEqualBoundary() {
        int actual = service.remain(1000);
        int expect = 0;
        assertEquals(expect, actual);
    }
}
