package com.redis.domain.model.reservation.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReservationSeat is a Querydsl query type for ReservationSeat
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReservationSeat extends EntityPathBase<ReservationSeat> {

    private static final long serialVersionUID = -903022633L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReservationSeat reservationSeat = new QReservationSeat("reservationSeat");

    public final com.redis.domain.config.QBaseEntity _super = new com.redis.domain.config.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdBy = _super.createdBy;

    public final NumberPath<Long> Id = createNumber("Id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifyAt = _super.modifyAt;

    public final QReservation reservation;

    public final com.redis.domain.model.seat.entity.QMovieSeat seat;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedBy = _super.updatedBy;

    public QReservationSeat(String variable) {
        this(ReservationSeat.class, forVariable(variable), INITS);
    }

    public QReservationSeat(Path<? extends ReservationSeat> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReservationSeat(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReservationSeat(PathMetadata metadata, PathInits inits) {
        this(ReservationSeat.class, metadata, inits);
    }

    public QReservationSeat(Class<? extends ReservationSeat> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.reservation = inits.isInitialized("reservation") ? new QReservation(forProperty("reservation"), inits.get("reservation")) : null;
        this.seat = inits.isInitialized("seat") ? new com.redis.domain.model.seat.entity.QMovieSeat(forProperty("seat"), inits.get("seat")) : null;
    }

}

