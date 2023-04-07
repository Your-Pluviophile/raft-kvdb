package com.mumu.raft.command;

/**
 * 状态机指令类型（客户端指令：增、删）
 * @author mumu
 * @since 2023-04-07
 */
public enum CommandType {
    PUT,
    DELETE;
}
