package com.redis.domain.model.movie.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMovieInfo is a Querydsl query type for MovieInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMovieInfo extends EntityPathBase<MovieInfo> {

    private static final long serialVersionUID = -1509428032L;

    public static final QMovieInfo movieInfo = new QMovieInfo("movieInfo");

    public final com.redis.domain.config.QBaseEntity _super = new com.redis.domain.config.QBaseEntity(this);

    public final StringPath castNm = createString("castNm");

    public final StringPath countryCd = createString("countryCd");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> createDate = createDateTime("createDate", java.time.LocalDateTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdBy = _super.createdBy;

    public final StringPath directorNm = createString("directorNm");

    public final StringPath dscription = createString("dscription");

    public final EnumPath<Genre> genreCd = createEnum("genreCd", Genre.class);

    public final EnumPath<Grade> grade = createEnum("grade", Grade.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifyAt = _super.modifyAt;

    public final DateTimePath<java.time.LocalDateTime> modifyDate = createDateTime("modifyDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> movieId = createNumber("movieId", Long.class);

    public final StringPath movieLink = createString("movieLink");

    public final StringPath movieNm = createString("movieNm");

    public final NumberPath<Double> movieRate = createNumber("movieRate", Double.class);

    public final DateTimePath<java.time.LocalDateTime> openDate = createDateTime("openDate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> pubDate = createDateTime("pubDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> showTimeMin = createNumber("showTimeMin", Integer.class);

    public final BooleanPath showYn = createBoolean("showYn");

    public final StringPath subTitle = createString("subTitle");

    public final NumberPath<Integer> thumImg = createNumber("thumImg", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedBy = _super.updatedBy;

    public QMovieInfo(String variable) {
        super(MovieInfo.class, forVariable(variable));
    }

    public QMovieInfo(Path<? extends MovieInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMovieInfo(PathMetadata metadata) {
        super(MovieInfo.class, metadata);
    }

}

