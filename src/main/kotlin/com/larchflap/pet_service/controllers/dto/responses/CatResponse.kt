package com.larchflap.pet_service.controllers.dto.responses

import java.util.UUID

data class CatResponse(
  val id: UUID,
  val name: String,
)
