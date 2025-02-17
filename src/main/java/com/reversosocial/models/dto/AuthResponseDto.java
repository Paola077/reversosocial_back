package com.reversosocial.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthResponseDto {
  private String accessToken;
  private String username;

  public AuthResponseDto(String accessToken) {
    this.accessToken = accessToken;
  }
}
