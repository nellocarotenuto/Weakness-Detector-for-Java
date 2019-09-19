/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.dataformat.base64.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.DataFormatConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The Base64 data format is used for base64 encoding and decoding.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.dataformat.base64")
public class Base64DataFormatConfiguration
        extends
            DataFormatConfigurationPropertiesCommon {

    /**
     * To specific a maximum line length for the encoded data. By default 76 is
     * used.
     */
    private Integer lineLength = 76;
    /**
     * The line separators to use. Uses new line characters (CRLF) by default.
     */
    private String lineSeparator;
    /**
     * Instead of emitting '' and '/' we emit '-' and '_' respectively. urlSafe
     * is only applied to encode operations. Decoding seamlessly handles both
     * modes. Is by default false.
     */
    private Boolean urlSafe = false;
    /**
     * Whether the data format should set the Content-Type header with the type
     * from the data format if the data format is capable of doing so. For
     * example application/xml for data formats marshalling to XML or
     * application/json for data formats marshalling to JSon etc.
     */
    private Boolean contentTypeHeader = false;

    public Integer getLineLength() {
        return lineLength;
    }

    public void setLineLength(Integer lineLength) {
        this.lineLength = lineLength;
    }

    public String getLineSeparator() {
        return lineSeparator;
    }

    public void setLineSeparator(String lineSeparator) {
        this.lineSeparator = lineSeparator;
    }

    public Boolean getUrlSafe() {
        return urlSafe;
    }

    public void setUrlSafe(Boolean urlSafe) {
        this.urlSafe = urlSafe;
    }

    public Boolean getContentTypeHeader() {
        return contentTypeHeader;
    }

    public void setContentTypeHeader(Boolean contentTypeHeader) {
        this.contentTypeHeader = contentTypeHeader;
    }
}