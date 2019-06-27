package com.open.learning.presentation.controller

import com.open.learning.presentation.form.TextForm
import com.open.learning.presentation.mapper.ContentsMapper
import com.open.learning.presentation.model.Contents
import com.open.learning.presentation.service.ContentsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class TextController {

    @Autowired
    lateinit var contentsService: ContentsService

    @GetMapping("/get")
    fun get():ResponseEntity<List<Contents>>{
        var contentsList = contentsService.selectAll()
        return ResponseEntity.ok(contentsList)
    }
}