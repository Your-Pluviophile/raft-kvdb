package com.mumu.raft.command;

import lombok.*;

import java.io.Serializable;

/**
 * 状态机指令
 * @author mumu
 * @since 2023-04-07
 */
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class Command implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 操作类型
     */
    CommandType type;

    String key;

    String value;

}
