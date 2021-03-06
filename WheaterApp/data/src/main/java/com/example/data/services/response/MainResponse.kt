package com.example.data.services.response

import com.example.data.utils.DEFAULT_TEMP

data class MainResponse(
        val temp: Double = DEFAULT_TEMP,
        val temp_min: Double = DEFAULT_TEMP,
        val temp_max: Double = DEFAULT_TEMP
)