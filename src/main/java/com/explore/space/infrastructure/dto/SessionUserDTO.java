package com.explore.space.infrastructure.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SessionUserDTO {
    String loginCode;
    String loginName;
    String roleCode;
}
