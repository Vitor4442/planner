package com.airplane.planner.activity;

import com.airplane.planner.trip.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository repository;

    public ActivityResponse registerActivity(ActivityRequestPayload payload, Trip trip){
        Activity newActivity = new Activity(payload.title(), payload.occurs_at(), trip);

        LocalDateTime occursAt = newActivity.getOccursAt();

        if(occursAt.isBefore(trip.getStartAt()) || occursAt.isAfter(trip.getEndsAt())){
            throw new IllegalArgumentException(
                    "A atividade deve ocorrer dentro do período da viagem"
            );
        }

        this.repository.save(newActivity);
        
        return new ActivityResponse(newActivity.getId());
    }

    public List<ActivityData> getAllActivitiesFromId(UUID tripId){
        return this.repository.findByTripId(tripId).stream().map(activity -> new ActivityData(activity.getId(), activity.getTitle(), activity.getOccursAt())).toList();
    }


}
