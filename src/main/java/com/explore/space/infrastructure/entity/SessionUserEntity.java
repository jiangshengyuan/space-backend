package com.explore.space.infrastructure.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SessionUserEntity {
    String loginCode;
    String loginName;
    String roleCode;
}
