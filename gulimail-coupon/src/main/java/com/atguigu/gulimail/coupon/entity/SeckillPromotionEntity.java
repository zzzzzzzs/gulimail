package com.atguigu.gulimail.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 秒杀活动
 * 
 * @author zzzzzzzs
 * @email 1443539042@qq.com
 * @date 2021-01-08 10:51:06
 */
@Data
@TableName("sms_seckill_promotion")
public class SeckillPromotionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 活动标题
	 */
	private String title;
	/**
	 * 开始日期
	 */
	private Date startTime;
	/**
	 * 结束日期
	 */
	private Date endTime;
	/**
	 * 上下线状态
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 创建人
	 */
	private Long userId;

}
