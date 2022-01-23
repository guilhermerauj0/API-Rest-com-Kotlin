package br.acom.empresa.demo.service

import org.springframework.stereotype.Service

@Service
class ModuloService {

    fun module(numero: Int): Int{
        val resultado = numero % 2
        return resultado
    }
}