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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSampleSnapshotTemplateRequest extends AbstractModel{

    /**
    * 图片宽度，取值范围： [128, 4096]，单位：px。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 图片高度，取值范围： [128, 4096]，单位：px。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 采样截图类型，取值：
<li>Percent：按百分比。</li>
<li>Time：按时间间隔。</li>
    */
    @SerializedName("SampleType")
    @Expose
    private String SampleType;

    /**
    * 采样间隔。
<li>当 SampleType 为 Percent 时，指定采样间隔的百分比。</li>
<li>当 SampleType 为 Time 时，指定采样间隔的时间，单位为秒。</li>
    */
    @SerializedName("SampleInterval")
    @Expose
    private Long SampleInterval;

    /**
    * 采样截图模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 图片格式，取值为 jpg 和 png。默认为 jpg。
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get 图片宽度，取值范围： [128, 4096]，单位：px。 
     * @return Width 图片宽度，取值范围： [128, 4096]，单位：px。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 图片宽度，取值范围： [128, 4096]，单位：px。
     * @param Width 图片宽度，取值范围： [128, 4096]，单位：px。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 图片高度，取值范围： [128, 4096]，单位：px。 
     * @return Height 图片高度，取值范围： [128, 4096]，单位：px。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 图片高度，取值范围： [128, 4096]，单位：px。
     * @param Height 图片高度，取值范围： [128, 4096]，单位：px。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 采样截图类型，取值：
<li>Percent：按百分比。</li>
<li>Time：按时间间隔。</li> 
     * @return SampleType 采样截图类型，取值：
<li>Percent：按百分比。</li>
<li>Time：按时间间隔。</li>
     */
    public String getSampleType() {
        return this.SampleType;
    }

    /**
     * Set 采样截图类型，取值：
<li>Percent：按百分比。</li>
<li>Time：按时间间隔。</li>
     * @param SampleType 采样截图类型，取值：
<li>Percent：按百分比。</li>
<li>Time：按时间间隔。</li>
     */
    public void setSampleType(String SampleType) {
        this.SampleType = SampleType;
    }

    /**
     * Get 采样间隔。
<li>当 SampleType 为 Percent 时，指定采样间隔的百分比。</li>
<li>当 SampleType 为 Time 时，指定采样间隔的时间，单位为秒。</li> 
     * @return SampleInterval 采样间隔。
<li>当 SampleType 为 Percent 时，指定采样间隔的百分比。</li>
<li>当 SampleType 为 Time 时，指定采样间隔的时间，单位为秒。</li>
     */
    public Long getSampleInterval() {
        return this.SampleInterval;
    }

    /**
     * Set 采样间隔。
<li>当 SampleType 为 Percent 时，指定采样间隔的百分比。</li>
<li>当 SampleType 为 Time 时，指定采样间隔的时间，单位为秒。</li>
     * @param SampleInterval 采样间隔。
<li>当 SampleType 为 Percent 时，指定采样间隔的百分比。</li>
<li>当 SampleType 为 Time 时，指定采样间隔的时间，单位为秒。</li>
     */
    public void setSampleInterval(Long SampleInterval) {
        this.SampleInterval = SampleInterval;
    }

    /**
     * Get 采样截图模板名称，长度限制：64 个字符。 
     * @return Name 采样截图模板名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 采样截图模板名称，长度限制：64 个字符。
     * @param Name 采样截图模板名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 图片格式，取值为 jpg 和 png。默认为 jpg。 
     * @return Format 图片格式，取值为 jpg 和 png。默认为 jpg。
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 图片格式，取值为 jpg 和 png。默认为 jpg。
     * @param Format 图片格式，取值为 jpg 和 png。默认为 jpg。
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 模板描述信息，长度限制：256 个字符。 
     * @return Comment 模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述信息，长度限制：256 个字符。
     * @param Comment 模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "SampleType", this.SampleType);
        this.setParamSimple(map, prefix + "SampleInterval", this.SampleInterval);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

