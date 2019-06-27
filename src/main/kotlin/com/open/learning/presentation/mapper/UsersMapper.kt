package com.open.learning.presentation.mapper

import com.open.learning.presentation.model.Users
import org.apache.ibatis.annotations.Mapper

@Mapper
interface UsersMapper {

    fun selectByAddress(address:String):Users
}