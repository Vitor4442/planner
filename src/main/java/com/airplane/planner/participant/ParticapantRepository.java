package com.airplane.planner.participant;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParticapantRepository extends JpaRepository<Participant, UUID> {
}
