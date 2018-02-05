package com.coursera.gabriel.algorithms.quickfind;

import com.coursera.gabriel.algorithms.UnionFind;

public class QuickFind extends UnionFind{

    private Integer[] nodes;

    public QuickFind(Integer N) {
        this.nodes = [];
        for(int i=0; i < N; i++){
            this.nodes[i] = i;
        }
    }


    @Override
    public void union(int p, int q) {
        if(this.nodes[p].equals(this.nodes[q])) //already connected
            return;
        for (int i=0; i < this.nodes.length; i++) {
            if(nodes[i].equals(nodes[p]) || nodes[i].equals(nodes[q])){
                nodes[i] = nodes[p];
            }
        }
    }

    @Override
    public boolean connected(int p, int q) {
        if(q > this.nodes.length || p > this.nodes.length){
            return false;
        }
        return nodes[p].equals(nodes[q]);
    }
}
