package com.redis.domain.model.user.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMovieUser is a Querydsl query type for MovieUser
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMovieUser extends EntityPathBase<MovieUser> {

    private static final long serialVersionUID = -1177300380L;

    public static final QMovieUser movieUser = new QMovieUser("movieUser");

    public final com.redis.domain.config.QBaseEntity _super = new com.redis.domain.config.QBaseEntity(this);

    public final StringPath address01 = createString("address01");

    public final StringPath address02 = createString("address02");

    public final StringPath address03 = createString("address03");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> createDate = createDateTime("createDate", java.time.LocalDateTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdBy = _super.createdBy;

    public final StringPath email01 = createString("email01");

    public final StringPath email02 = createString("email02");

    public final DateTimePath<java.time.LocalDateTime> lastLoginDate = createDateTime("lastLoginDate", java.time.LocalDateTime.class);

    public final StringPath loginId = createString("loginId");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifyAt = _super.modifyAt;

    public final DateTimePath<java.time.LocalDateTime> modifyDate = createDateTime("modifyDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> phoneNum01 = createNumber("phoneNum01", Integer.class);

    public final NumberPath<Integer> phoneNum02 = createNumber("phoneNum02", Integer.class);

    public final NumberPath<Integer> phoneNum03 = createNumber("phoneNum03", Integer.class);

    public final StringPath pwd = createString("pwd");

    public final StringPath role = createString("role");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedBy = _super.updatedBy;

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public final NumberPath<Integer> userImg = createNumber("userImg", Integer.class);

    public final StringPath userNm = createString("userNm");

    public final BooleanPath useYn = createBoolean("useYn");

    public QMovieUser(String variable) {
        super(MovieUser.class, forVariable(variable));
    }

    public QMovieUser(Path<? extends MovieUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMovieUser(PathMetadata metadata) {
        super(MovieUser.class, metadata);
    }

}

