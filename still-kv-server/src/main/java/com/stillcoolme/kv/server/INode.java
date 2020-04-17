package com.stillcoolme.kv.server;

/**
 * @author: stillcoolme
 * @date: 2020/4/17 21:54
 * Function:
 */
public interface INode {

    public boolean start();
    public boolean shutdown();
    public boolean communicate();

}
