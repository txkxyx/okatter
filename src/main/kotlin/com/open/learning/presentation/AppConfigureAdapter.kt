package com.open.learning.presentation

import org.springframework.context.annotation.Configuration
import org.springframework.context.support.ReloadableResourceBundleMessageSource
import org.springframework.validation.Validator
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
@Configuration
class AppConfigureAdapter: WebMvcConfigurer {

    override fun getValidator(): Validator? {
        val source = ReloadableResourceBundleMessageSource().also {
            it.setBasename("classpath:messages")
            it.setDefaultEncoding("UTF-8")
        }
        return LocalValidatorFactoryBean().also { it.setValidationMessageSource(source) }
    }
}