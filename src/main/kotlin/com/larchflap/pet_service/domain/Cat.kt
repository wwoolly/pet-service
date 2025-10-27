package com.larchflap.pet_service.domain

import java.util.UUID

data class Cat(
  val id: UUID,
  val name: String,
//  val age: Long,
//  val toy: Toy?, //TODO добавить поддержку игрушек для кошки
) {
  init {
    assert(name.isNotEmpty())
    assert(name.length in 2..32)
//    assert()
  }
}
