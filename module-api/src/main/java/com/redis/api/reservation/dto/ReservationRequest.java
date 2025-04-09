package com.redis.api.reservation.dto;


import lombok.Data;

import java.util.List;

@Data
public class ReservationRequest {
    private Long userId;
    private Long screeningId;
    private List<Long> seatIds;
}
