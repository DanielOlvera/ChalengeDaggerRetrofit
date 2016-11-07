
package com.example.daniel.retrofitdaggerokhttpspotify_project.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExternalIds {

    @SerializedName("isrc")
    @Expose
    private String isrc;

    /**
     * 
     * @return
     *     The isrc
     */
    public String getIsrc() {
        return isrc;
    }

    /**
     * 
     * @param isrc
     *     The isrc
     */
    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

}
