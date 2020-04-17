package com.stillcoolme.kv.server;

/**
 * @author: stillcoolme
 * @date: 2020/4/17 21:50
 * Function:
 */
public class Node implements INode {
    private String ip;
    private String port;

    @Override
    public boolean start() {
        return true;
    }

    @Override
    public boolean shutdown() {
        return true;
    }

    @Override
    public boolean communicate() {
        return false;
    }

}
