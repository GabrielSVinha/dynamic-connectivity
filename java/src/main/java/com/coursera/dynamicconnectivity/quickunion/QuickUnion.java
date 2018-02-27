package com.coursera.dynamicconnectivity.quickunion;

import com.coursera.dynamicconnectivity.algorithms.UnionFind;

public class QuickUnion extends UnionFind {
    private Integer[] nodes;

    public QuickUnion(int N) {
        this.nodes = new Integer[N];
        for(int i=0; i < N; i++){
            this.nodes[i] = i;
        }
    }

    private int root(int i){
        while (i != this.nodes[i]){
            i = this.nodes[i];
        }
        return i;
    }

    public void union(int p, int q) {
        this.nodes[this.root(p)] = root(q);
    }

    public boolean connected(int p, int q) {
        return this.root(p) == this.root(q);
    }
}
