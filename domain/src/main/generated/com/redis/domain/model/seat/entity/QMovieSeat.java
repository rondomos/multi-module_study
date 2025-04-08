package com.redis.domain.model.seat.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMovieSeat is a Querydsl query type for MovieSeat
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMovieSeat extends EntityPathBase<MovieSeat> {

    private static final long serialVersionUID = 1212239268L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMovieSeat movieSeat = new QMovieSeat("movieSeat");

    public final NumberPath<Long> cinemaId = createNumber("cinemaId", Long.class);

    public final BooleanPath isReserved = createBoolean("isReserved");

    public final com.redis.domain.model.screen.entity.QScreen screen;

    public final StringPath seatCd = createString("seatCd");

    public final StringPath seatCol = createString("seatCol");

    public final NumberPath<Long> seatId = createNumber("seatId", Long.class);

    public final StringPath seatLv = createString("seatLv");

    public final StringPath seatNm = createString("seatNm");

    public final StringPath seatRow = createString("seatRow");

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QMovieSeat(String variable) {
        this(MovieSeat.class, forVariable(variable), INITS);
    }

    public QMovieSeat(Path<? extends MovieSeat> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMovieSeat(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMovieSeat(PathMetadata metadata, PathInits inits) {
        this(MovieSeat.class, metadata, inits);
    }

    public QMovieSeat(Class<? extends MovieSeat> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.screen = inits.isInitialized("screen") ? new com.redis.domain.model.screen.entity.QScreen(forProperty("screen"), inits.get("screen")) : null;
    }

}

