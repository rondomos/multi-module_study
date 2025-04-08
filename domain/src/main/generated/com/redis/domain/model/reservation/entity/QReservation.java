package com.redis.domain.model.reservation.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReservation is a Querydsl query type for Reservation
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReservation extends EntityPathBase<Reservation> {

    private static final long serialVersionUID = 530079410L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReservation reservation = new QReservation("reservation");

    public final com.redis.domain.config.QBaseEntity _super = new com.redis.domain.config.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdBy = _super.createdBy;

    public final StringPath loginId = createString("loginId");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifyAt = _super.modifyAt;

    public final com.redis.domain.model.user.entity.QMovieUser movieUser;

    public final StringPath reserCd = createString("reserCd");

    public final NumberPath<Long> reserId = createNumber("reserId", Long.class);

    public final DateTimePath<java.time.LocalDateTime> reserTime = createDateTime("reserTime", java.time.LocalDateTime.class);

    public final com.redis.domain.model.screen.entity.QScreen screen;

    public final StringPath seatId = createString("seatId");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedBy = _super.updatedBy;

    public final StringPath userId = createString("userId");

    public QReservation(String variable) {
        this(Reservation.class, forVariable(variable), INITS);
    }

    public QReservation(Path<? extends Reservation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReservation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReservation(PathMetadata metadata, PathInits inits) {
        this(Reservation.class, metadata, inits);
    }

    public QReservation(Class<? extends Reservation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.movieUser = inits.isInitialized("movieUser") ? new com.redis.domain.model.user.entity.QMovieUser(forProperty("movieUser")) : null;
        this.screen = inits.isInitialized("screen") ? new com.redis.domain.model.screen.entity.QScreen(forProperty("screen"), inits.get("screen")) : null;
    }

}

