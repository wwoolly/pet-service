package com.larchflap.pet_service.domain

import java.util.UUID

data class Toy(
  val id: UUID,
  val type: ToyType,
)
