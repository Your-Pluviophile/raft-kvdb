package com.mumu.raft.log;

import com.mumu.raft.command.Command;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author mumu
 * @since 2023-04-07
 */
@Data
@Builder
@AllArgsConstructor
public class Entry implements Serializable {
    /**
     * 任期号
     */
    private long term;
    /**
     * 日志索引
     */
    private Long index;
    /**
     * 状态机指令
     */
    private Command cmd;
    /**
     * 请求id
     */
    private String requestId;

}
