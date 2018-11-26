package jp.takeda.springRestApi.service

import jp.takeda.springRestApi.domain.Currency
import jp.takeda.springRestApi.domain.CurrencyRepository
import org.springframework.stereotype.Service

@Service
class CurrencyService(
        private val currencyRepository: CurrencyRepository
) {

    fun findAll(): List<Currency> {
        return currencyRepository.findAll()
    }
}