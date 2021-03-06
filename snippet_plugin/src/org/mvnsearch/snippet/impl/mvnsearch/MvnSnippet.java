/*
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

package org.mvnsearch.snippet.impl.mvnsearch;

import org.mvnsearch.snippet.Snippet;

/**
 * mvn snippet
 *
 * @author linux_china@hotmail.com
 */
public class MvnSnippet extends Snippet {
    private String id;   //id
    private String categoryId;  //category id
    private String mnemonic;    //mnemonic
    private String keywords;   //keywords
    private String url;    //url
    private String rawDescription;  //raw description

    public String getId() {
        return String.valueOf(id);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String toString() {
        return getTitle();
    }

    @Override
    public String getDescription() {
        String descriptionHeader = "<ul>Basic Information:\n" +
                "    <li>ID: " + getId() + "</li>\n" +
                "    <li>Name: " + getTitle() + "</li>\n" +
                "    <li>Mnemonic:" + getMnemonic() + "</li>\n" +
                "    <li>Author: " + getAuthor() + "</li>\n" +
                "    <li>Keywords:" + getKeywords() + "</li>\n" +
                "</ul><br/><br/>";
        if (getRawDescription() == null) return descriptionHeader;
        else return descriptionHeader + getRawDescription();
    }

    public String getRawDescription() {
        return rawDescription;
    }

    public void setRawDescription(String rawDescription) {
        this.rawDescription = rawDescription;
    }

    /**
     * get content type for snippet
     *
     * @return content type
     */
    @Override
    public String getContentType() {
        return "text/" + getLanguage();
    }
}
