package com.explore.space.common.utils;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SessionUser {
    String loginCode;
    String loginName;
    String roleCode;
}
