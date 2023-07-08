package com.seesaw.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MailResponse {
    @JsonProperty("message")
    private String message;
    @JsonProperty("status")
    private boolean status;

}