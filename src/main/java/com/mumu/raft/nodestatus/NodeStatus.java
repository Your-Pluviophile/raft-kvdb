package com.mumu.raft.nodestatus;

/**
 * 节点状态定义
 * @author mumu
 * @since 2023-04-07
 */
public enum NodeStatus {
    FOLLOWER,
    CANDIDATE,
    LEADER;
}
