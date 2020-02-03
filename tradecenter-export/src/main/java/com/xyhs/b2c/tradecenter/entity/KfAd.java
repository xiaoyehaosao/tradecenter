package com.xyhs.b2c.tradecenter.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.xyhs.b2c.common.tools.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author ljp
 * @since 2019-12-30
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class KfAd extends BaseEntity {


    private static final long serialVersionUID = -4922916997386478110L;
    private Long id;

    @TableField("createDate")
    private LocalDateTime createDate;

    @TableField("modifyDate")
    private LocalDateTime modifyDate;

    private Integer sort;

    private String content;

    private String image;

    private String title;

    private String type;

    @TableField("isEnabled")
    private Boolean isEnabled;

    private String url;

    @TableField("adPositionId")
    private Long adPositionId;


}
