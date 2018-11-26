package jp.takeda.springRestApi.controller

import jp.takeda.springRestApi.service.CurrencyService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class CurrencyController(
        private val currencyService: CurrencyService
) {
    @GetMapping("/")
    fun findAll(): ResponseEntity<CurrencyResponse> {
        val currencies = currencyService.findAll()
        val currencyResponse = CurrencyResponse(currencies)
        return ResponseEntity(currencyResponse, HttpStatus.OK)
    }
}