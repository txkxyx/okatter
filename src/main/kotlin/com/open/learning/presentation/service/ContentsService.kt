package com.open.learning.presentation.service

import com.open.learning.presentation.mapper.ContentsMapper
import com.open.learning.presentation.model.Contents
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ContentsService {

    @Autowired
    lateinit var contentsMapper: ContentsMapper

    fun selectAll():List<Contents>{
        return contentsMapper.selectAll()
    }

    fun insert(contents: Contents){
        contentsMapper.insert(contents)
    }
}