package com.larchflap.pet_service.controllers.dto

import java.util.UUID

data class CatResponse(
  val id: UUID,
  val name: String,
)
