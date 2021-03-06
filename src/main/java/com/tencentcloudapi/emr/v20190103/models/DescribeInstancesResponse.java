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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesResponse extends AbstractModel{

    /**
    * 实例数量
    */
    @SerializedName("TotalCnt")
    @Expose
    private Integer TotalCnt;

    /**
    * 集群实例信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterList")
    @Expose
    private ClusterInstancesInfo [] ClusterList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例数量 
     * @return TotalCnt 实例数量
     */
    public Integer getTotalCnt() {
        return this.TotalCnt;
    }

    /**
     * Set 实例数量
     * @param TotalCnt 实例数量
     */
    public void setTotalCnt(Integer TotalCnt) {
        this.TotalCnt = TotalCnt;
    }

    /**
     * Get 集群实例信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterList 集群实例信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClusterInstancesInfo [] getClusterList() {
        return this.ClusterList;
    }

    /**
     * Set 集群实例信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterList 集群实例信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterList(ClusterInstancesInfo [] ClusterList) {
        this.ClusterList = ClusterList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCnt", this.TotalCnt);
        this.setParamArrayObj(map, prefix + "ClusterList.", this.ClusterList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

