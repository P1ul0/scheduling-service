package com.api.scheduling.adapters.inbound.record;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatusCode;

public record ResponseJson(
        @JsonProperty("message")
        String message,

        @JsonProperty("status")
        HttpStatusCode status
) {
}
