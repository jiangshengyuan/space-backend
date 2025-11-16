package com.explore.space.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class BaseEntity {
    String createTime;
    String createId;
    String updateId;
    String updateTime;
    String valid;
}
