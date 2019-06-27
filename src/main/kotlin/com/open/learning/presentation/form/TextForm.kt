package com.open.learning.presentation.form

import javax.validation.constraints.Max
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size
import kotlin.math.max

data class TextForm (
        @field:NotBlank
        @field:Size(max=30)
        var name:String? = null,
        @field:NotBlank
        @field:Size(max=300)
        var text:String? = null)