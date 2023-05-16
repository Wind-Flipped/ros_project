package com.se.hw.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <p>
 *
 * </p>
 *
 * @author SE2304
 * @since 2023-05-11
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Point implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;//Table Welcome Kitchen

    private Double xAxis;

    private Double yAxis;

    private Integer status;// 0 is free ; 1 is full

    private Integer mapId;

    private Double zAxis;

    private Double oriX;

    private Double oriY;

    private Double oriZ;

    private Double oriW;
}
