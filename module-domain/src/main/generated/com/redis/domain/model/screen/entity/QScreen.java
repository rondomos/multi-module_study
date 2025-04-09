package com.redis.domain.model.screen.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QScreen is a Querydsl query type for Screen
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QScreen extends EntityPathBase<Screen> {

    private static final long serialVersionUID = 1407932644L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QScreen screen = new QScreen("screen");

    public final com.redis.domain.config.QBaseEntity _super = new com.redis.domain.config.QBaseEntity(this);

    public final NumberPath<Long> cinemaId = createNumber("cinemaId", Long.class);

    public final StringPath cinemaNm = createString("cinemaNm");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> createDate = createDateTime("createDate", java.time.LocalDateTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifyAt = _super.modifyAt;

    public final DateTimePath<java.time.LocalDateTime> modifyDate = createDateTime("modifyDate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> movieEndTime = createDateTime("movieEndTime", java.time.LocalDateTime.class);

    public final NumberPath<Integer> movieHall = createNumber("movieHall", Integer.class);

    public final NumberPath<Long> movieId = createNumber("movieId", Long.class);

    public final com.redis.domain.model.movie.entity.QMovieInfo movieInfo;

    public final NumberPath<Integer> movieRound = createNumber("movieRound", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> movieStartTime = createDateTime("movieStartTime", java.time.LocalDateTime.class);

    public final BooleanPath screenShowYn = createBoolean("screenShowYn");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedBy = _super.updatedBy;

    public QScreen(String variable) {
        this(Screen.class, forVariable(variable), INITS);
    }

    public QScreen(Path<? extends Screen> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QScreen(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QScreen(PathMetadata metadata, PathInits inits) {
        this(Screen.class, metadata, inits);
    }

    public QScreen(Class<? extends Screen> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.movieInfo = inits.isInitialized("movieInfo") ? new com.redis.domain.model.movie.entity.QMovieInfo(forProperty("movieInfo")) : null;
    }

}

