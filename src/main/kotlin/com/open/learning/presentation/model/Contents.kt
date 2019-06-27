package com.open.learning.presentation.model

import java.time.LocalDateTime

data class Contents (var id:Int,
                     var name:String?,
                     var text:String?,
                     var address:String?,
                     var insert_time:LocalDateTime)