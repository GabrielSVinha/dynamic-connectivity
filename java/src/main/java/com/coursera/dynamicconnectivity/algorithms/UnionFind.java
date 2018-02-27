package com.coursera.dynamicconnectivity.algorithms;

public abstract class UnionFind <Integer> {
    public abstract void union(int p, int q);

    public abstract boolean connected(int p, int q);
}