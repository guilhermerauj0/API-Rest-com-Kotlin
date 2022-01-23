package br.acom.empresa.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ModuloController {

    @GetMapping
    fun calculo(num: Int): Int{
        return 0
    }
}