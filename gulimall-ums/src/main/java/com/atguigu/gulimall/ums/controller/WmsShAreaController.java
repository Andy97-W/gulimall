package com.atguigu.gulimall.ums.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;
import com.atguigu.gulimall.commons.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.atguigu.gulimall.ums.entity.WmsShAreaEntity;
import com.atguigu.gulimall.ums.service.WmsShAreaService;




/**
 * 全国省市区信息
 *
 * @author andy
 * @email andy972019@aliyun.com
 * @date 2019-11-14 16:26:05
 */
@Api(tags = "全国省市区信息 管理")
@RestController
@RequestMapping("ums/wmssharea")
public class WmsShAreaController {
    @Autowired
    private WmsShAreaService wmsShAreaService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('ums:wmssharea:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = wmsShAreaService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('ums:wmssharea:info')")
    public Resp<WmsShAreaEntity> info(@PathVariable("id") Integer id){
		WmsShAreaEntity wmsShArea = wmsShAreaService.getById(id);

        return Resp.ok(wmsShArea);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('ums:wmssharea:save')")
    public Resp<Object> save(@RequestBody WmsShAreaEntity wmsShArea){
		wmsShAreaService.save(wmsShArea);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('ums:wmssharea:update')")
    public Resp<Object> update(@RequestBody WmsShAreaEntity wmsShArea){
		wmsShAreaService.updateById(wmsShArea);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('ums:wmssharea:delete')")
    public Resp<Object> delete(@RequestBody Integer[] ids){
		wmsShAreaService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
