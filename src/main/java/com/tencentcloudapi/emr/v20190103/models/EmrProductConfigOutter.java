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

public class EmrProductConfigOutter extends AbstractModel{

    /**
    * 软件信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SoftInfo")
    @Expose
    private String [] SoftInfo;

    /**
    * Master节点个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterNodeSize")
    @Expose
    private Integer MasterNodeSize;

    /**
    * Core节点个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoreNodeSize")
    @Expose
    private Integer CoreNodeSize;

    /**
    * Task节点个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskNodeSize")
    @Expose
    private Integer TaskNodeSize;

    /**
    * Common节点个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComNodeSize")
    @Expose
    private Integer ComNodeSize;

    /**
    * Master节点资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterResource")
    @Expose
    private OutterResource MasterResource;

    /**
    * Core节点资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoreResource")
    @Expose
    private OutterResource CoreResource;

    /**
    * Task节点资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskResource")
    @Expose
    private OutterResource TaskResource;

    /**
    * Common节点资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComResource")
    @Expose
    private OutterResource ComResource;

    /**
    * 是否使用COS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnCos")
    @Expose
    private Boolean OnCos;

    /**
    * 收费类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeType")
    @Expose
    private Integer ChargeType;

    /**
     * Get 软件信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SoftInfo 软件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSoftInfo() {
        return this.SoftInfo;
    }

    /**
     * Set 软件信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SoftInfo 软件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSoftInfo(String [] SoftInfo) {
        this.SoftInfo = SoftInfo;
    }

    /**
     * Get Master节点个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterNodeSize Master节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getMasterNodeSize() {
        return this.MasterNodeSize;
    }

    /**
     * Set Master节点个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterNodeSize Master节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterNodeSize(Integer MasterNodeSize) {
        this.MasterNodeSize = MasterNodeSize;
    }

    /**
     * Get Core节点个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoreNodeSize Core节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getCoreNodeSize() {
        return this.CoreNodeSize;
    }

    /**
     * Set Core节点个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoreNodeSize Core节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoreNodeSize(Integer CoreNodeSize) {
        this.CoreNodeSize = CoreNodeSize;
    }

    /**
     * Get Task节点个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskNodeSize Task节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getTaskNodeSize() {
        return this.TaskNodeSize;
    }

    /**
     * Set Task节点个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskNodeSize Task节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskNodeSize(Integer TaskNodeSize) {
        this.TaskNodeSize = TaskNodeSize;
    }

    /**
     * Get Common节点个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComNodeSize Common节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getComNodeSize() {
        return this.ComNodeSize;
    }

    /**
     * Set Common节点个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComNodeSize Common节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComNodeSize(Integer ComNodeSize) {
        this.ComNodeSize = ComNodeSize;
    }

    /**
     * Get Master节点资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterResource Master节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OutterResource getMasterResource() {
        return this.MasterResource;
    }

    /**
     * Set Master节点资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterResource Master节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterResource(OutterResource MasterResource) {
        this.MasterResource = MasterResource;
    }

    /**
     * Get Core节点资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoreResource Core节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OutterResource getCoreResource() {
        return this.CoreResource;
    }

    /**
     * Set Core节点资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoreResource Core节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoreResource(OutterResource CoreResource) {
        this.CoreResource = CoreResource;
    }

    /**
     * Get Task节点资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskResource Task节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OutterResource getTaskResource() {
        return this.TaskResource;
    }

    /**
     * Set Task节点资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskResource Task节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskResource(OutterResource TaskResource) {
        this.TaskResource = TaskResource;
    }

    /**
     * Get Common节点资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComResource Common节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OutterResource getComResource() {
        return this.ComResource;
    }

    /**
     * Set Common节点资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComResource Common节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComResource(OutterResource ComResource) {
        this.ComResource = ComResource;
    }

    /**
     * Get 是否使用COS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnCos 是否使用COS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getOnCos() {
        return this.OnCos;
    }

    /**
     * Set 是否使用COS
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnCos 是否使用COS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnCos(Boolean OnCos) {
        this.OnCos = OnCos;
    }

    /**
     * Get 收费类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeType 收费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 收费类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeType 收费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeType(Integer ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SoftInfo.", this.SoftInfo);
        this.setParamSimple(map, prefix + "MasterNodeSize", this.MasterNodeSize);
        this.setParamSimple(map, prefix + "CoreNodeSize", this.CoreNodeSize);
        this.setParamSimple(map, prefix + "TaskNodeSize", this.TaskNodeSize);
        this.setParamSimple(map, prefix + "ComNodeSize", this.ComNodeSize);
        this.setParamObj(map, prefix + "MasterResource.", this.MasterResource);
        this.setParamObj(map, prefix + "CoreResource.", this.CoreResource);
        this.setParamObj(map, prefix + "TaskResource.", this.TaskResource);
        this.setParamObj(map, prefix + "ComResource.", this.ComResource);
        this.setParamSimple(map, prefix + "OnCos", this.OnCos);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);

    }
}

