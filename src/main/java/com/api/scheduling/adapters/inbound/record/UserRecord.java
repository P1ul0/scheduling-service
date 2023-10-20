package com.api.scheduling.adapters.inbound.record;

import java.util.List;

public record UserRecord(
         String name,
         String email,
         String password
) {
}
