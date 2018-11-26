package jp.takeda.springRestApi.domain

import javax.persistence.Entity
import java.math.BigDecimal
import javax.persistence.GenerationType
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
class Currency {

    /** 自動採番ID  */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0

    /** 仮想通貨名  */
    val name: String = ""

    /** シンボル  */
    val symbol: String = ""

    /** 数量  */
    val amount: BigDecimal = BigDecimal.ZERO

}