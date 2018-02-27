package com.coursera.dynamicconnectivity;

import com.coursera.dynamicconnectivity.algorithms.UnionFind;
import com.coursera.dynamicconnectivity.algorithms.quickfind.QuickFind;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        UnionFind uf = new QuickFind(10);
        uf.union(1, 2);
        uf.union(1, 3);
        uf.union(8, 9);
        uf.union(7, 0);
        uf.union(0, 2);
        uf.union(5, 4);
        uf.union(4, 6);
        uf.union(1, 2);

        assert uf.connected(1,2);
        assert uf.connected(2,7);
        assert !uf.connected(4, 6);

        uf.union(7, 8);
        uf.union(6, 7);

        //this point, everyone is connected
        assert uf.connected(1,2);
        assert uf.connected(0,4);
        assert uf.connected(1, 8);
        assert uf.connected(1,2);
        assert uf.connected(2,9);
        assert uf.connected(0, 6);
        assert uf.connected(1,3);
        assert uf.connected(2,6);
        assert uf.connected(9, 6);

        // quick union
    }
}
