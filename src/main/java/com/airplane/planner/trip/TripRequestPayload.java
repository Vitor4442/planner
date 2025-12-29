package com.airplane.planner.trip;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record TripRequestPayload(@NotBlank String destination, @NotNull @Future String starts_at, @NotNull @Future String ends_at, List<String> emails_to_invite, String owner_email, String owner_name) {

}
