package com.kys.practice.mmd_practice_1

import android.net.Uri

class Songs {
    var name: String? = null
    var artist: String? = null
    var image : Uri? = null

    constructor(name : String, artist :String,image : Uri) {
        this.name = name
        this.artist = artist
        this.image = image
    }
}