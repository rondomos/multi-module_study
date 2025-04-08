package com.redis.domain.model.common.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCommonImg is a Querydsl query type for CommonImg
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCommonImg extends EntityPathBase<CommonImg> {

    private static final long serialVersionUID = 444531393L;

    public static final QCommonImg commonImg = new QCommonImg("commonImg");

    public final com.redis.domain.config.QBaseEntity _super = new com.redis.domain.config.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdBy = _super.createdBy;

    public final StringPath imgNm = createString("imgNm");

    public final StringPath imgPath = createString("imgPath");

    public final NumberPath<Long> imgSeq = createNumber("imgSeq", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifyAt = _super.modifyAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedBy = _super.updatedBy;

    public QCommonImg(String variable) {
        super(CommonImg.class, forVariable(variable));
    }

    public QCommonImg(Path<? extends CommonImg> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCommonImg(PathMetadata metadata) {
        super(CommonImg.class, metadata);
    }

}

