package com.open.learning.presentation.controller

import com.open.learning.presentation.form.TextForm
import com.open.learning.presentation.mapper.ContentsMapper
import com.open.learning.presentation.model.Contents
import com.open.learning.presentation.service.ContentsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import java.time.LocalDateTime
import javax.servlet.http.HttpServletRequest

@Controller
class MainController {

    @Autowired
    lateinit var contentsService: ContentsService

    @Autowired
    lateinit var httpServletRequest: HttpServletRequest

    @ModelAttribute
    fun setTextForm():TextForm{
        return TextForm()
    }

    @GetMapping("/")
    fun index( model: Model):String{
        return "index"
    }

    @PostMapping("/post")
    fun post(@Validated textForm: TextForm, bindingResult: BindingResult, model: Model):String{
        if (bindingResult.hasErrors()){
            return "index"
        }
        var contents = Contents(0,textForm.name,textForm.text,getRemoteIP(),LocalDateTime.now())
        contentsService.insert(contents)
        textForm.text = ""
        model.addAttribute("textForm",textForm)
        return "index"
    }

    fun getRemoteIP():String{
        return httpServletRequest.remoteAddr
    }
}