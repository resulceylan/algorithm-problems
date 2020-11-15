package org.ceylan.resul.islands;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class IslandFinderTest {

    private final IslandFinder underTest = new IslandFinder();

    @Test
    public void shouldReturn0WhenThereIsNoIslands() {
        char[][] grid = {
                {'0', '0', '0'},
                {'0', '0', '0'},
                {'0', '0', '0'},
                {'0', '0', '0'}
        };
        assertThat(underTest.numIslands(grid), is(0));
    }

    @Test
    public void shouldReturn1WhenThereIsNoWater() {
        char[][] grid = {
                {'1', '1', '1'},
                {'1', '1', '1'},
                {'1', '1', '1'},
                {'1', '1', '1'}
        };
        assertThat(underTest.numIslands(grid), is(1));
    }

    @Test
    public void shouldReturn9WhenAllDiagonalFor5x5Grid() {
        char[][] grid = {
                {'1', '0', '0', '0', '1'},
                {'0', '1', '0', '1', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '1', '0', '1', '0'},
                {'1', '0', '0', '0', '1'},
        };
        assertThat(underTest.numIslands(grid), is(9));
    }
}