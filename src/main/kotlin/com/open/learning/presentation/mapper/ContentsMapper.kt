package com.open.learning.presentation.mapper

import com.open.learning.presentation.model.Contents
import org.apache.ibatis.annotations.Mapper

@Mapper
interface ContentsMapper {

    fun selectAll():List<Contents>

    fun insert(contents: Contents)
}