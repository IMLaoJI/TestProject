/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainsRequest extends AbstractModel{

    /**
    * 分页查询的偏移地址，默认0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询的域名个数，默认100，最大支持1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询条件过滤器。
    */
    @SerializedName("Filters")
    @Expose
    private DomainFilter [] Filters;

    /**
     * Get 分页查询的偏移地址，默认0。 
     * @return Offset 分页查询的偏移地址，默认0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询的偏移地址，默认0。
     * @param Offset 分页查询的偏移地址，默认0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询的域名个数，默认100，最大支持1000。 
     * @return Limit 分页查询的域名个数，默认100，最大支持1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询的域名个数，默认100，最大支持1000。
     * @param Limit 分页查询的域名个数，默认100，最大支持1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询条件过滤器。 
     * @return Filters 查询条件过滤器。
     */
    public DomainFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询条件过滤器。
     * @param Filters 查询条件过滤器。
     */
    public void setFilters(DomainFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

