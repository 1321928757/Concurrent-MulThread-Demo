package com.luckysj.threadpool.thread;

/**
 * @author Luckysj @刘仕杰
 * @description 拒绝策略接口
 * @create 2024/03/27 11:29:46
 */
public interface RejectPolicy<T> {
    void reject(WorkQueue<T> blockQueue, T task);

}
