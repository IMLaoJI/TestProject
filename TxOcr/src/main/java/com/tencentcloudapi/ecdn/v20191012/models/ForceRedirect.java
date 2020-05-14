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

public class ForceRedirect extends AbstractModel{

    /**
    * 访问协议强制跳转配置开关，on或off。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 强制跳转访问协议类型，支持http，https，分别表示请求强制跳转http协议，请求强制跳转https协议。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedirectType")
    @Expose
    private String RedirectType;

    /**
    * 强制跳转开启时返回的http状态码，支持301或302。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedirectStatusCode")
    @Expose
    private Long RedirectStatusCode;

    /**
     * Get 访问协议强制跳转配置开关，on或off。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch 访问协议强制跳转配置开关，on或off。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 访问协议强制跳转配置开关，on或off。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch 访问协议强制跳转配置开关，on或off。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 强制跳转访问协议类型，支持http，https，分别表示请求强制跳转http协议，请求强制跳转https协议。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedirectType 强制跳转访问协议类型，支持http，https，分别表示请求强制跳转http协议，请求强制跳转https协议。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRedirectType() {
        return this.RedirectType;
    }

    /**
     * Set 强制跳转访问协议类型，支持http，https，分别表示请求强制跳转http协议，请求强制跳转https协议。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedirectType 强制跳转访问协议类型，支持http，https，分别表示请求强制跳转http协议，请求强制跳转https协议。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedirectType(String RedirectType) {
        this.RedirectType = RedirectType;
    }

    /**
     * Get 强制跳转开启时返回的http状态码，支持301或302。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedirectStatusCode 强制跳转开启时返回的http状态码，支持301或302。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRedirectStatusCode() {
        return this.RedirectStatusCode;
    }

    /**
     * Set 强制跳转开启时返回的http状态码，支持301或302。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedirectStatusCode 强制跳转开启时返回的http状态码，支持301或302。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedirectStatusCode(Long RedirectStatusCode) {
        this.RedirectStatusCode = RedirectStatusCode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "RedirectType", this.RedirectType);
        this.setParamSimple(map, prefix + "RedirectStatusCode", this.RedirectStatusCode);

    }
}

